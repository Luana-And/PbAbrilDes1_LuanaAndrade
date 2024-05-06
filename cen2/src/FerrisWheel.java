package application;

import java.util.*;

import model.Adult;
import model.Child;
import model.Person;

public class FerrisWheel {
    private static final int GONDOLA_COUNT = 18;
    private final List<Set<Person>> gondolas;

    public FerrisWheel() {
        gondolas = new ArrayList<>();
        for (int i = 0; i < GONDOLA_COUNT; i++) {
            gondolas.add(new HashSet<>());
        }
    }

    public void board(int gondolaNumber, Person... people) {
        if (gondolaNumber < 1 || gondolaNumber > GONDOLA_COUNT) {
            System.out.println("Número de gôndola inválido!");
            return;
        }

        // Verifica se cada pessoa embarcando já está em uma gôndola
        // E remove da gôndola anterior
        for (Set<Person> g : gondolas) {
            for (Person person : people) {
                g.remove(person);
            }
        }

        Set<Person> gondola = gondolas.get(gondolaNumber - 1);
        gondola.addAll(Arrays.asList(people));
    }

    public void status() {
        // Mensagem de erro se for < 12 anos desacompanhado do pai
        for (Set<Person> gondola : gondolas) {
            for (Person person : gondola) {
                boolean naoTemPaiPresente = !gondola.contains(person.getFather());
                if (person.getAge() < 12 && naoTemPaiPresente) {
                    System.out.println("Erro: Criança menor de 12 anos deve estar acompanhada pelo pai!");
                }
            }
        }

        // Remove se for < 12 anos desacompanhado do pai ou se chamar Pedro (coitado =/)
        for (Set<Person> gondola : gondolas) {
            gondola.removeIf(p -> {
                boolean isPedro = p.getName().equals("Pedro");
                boolean fatherNotPresent = !gondola.contains(p.getFather());
                boolean isUnaccompaniedChild = p.getAge() < 12 && fatherNotPresent;
                return isPedro || isUnaccompaniedChild;

            });
        }

        System.out.println("\t* Gondola Status");
        System.out.println("\t* ______");
        for (int i = 0; i < GONDOLA_COUNT; i++) {
            System.out.print("\t* " + (i + 1) + " ");
            Set<Person> gondola = gondolas.get(i);

            if (gondola.isEmpty()) {
                System.out.println("(empty)");
                continue;
            }

            // Prints people in gondola
            Set<String> personNames = new HashSet<>();
            for (Person person : gondola) {
                personNames.add(person.getName());
            }
            if (personNames.size() == 1) {
                System.out.println("Only " + personNames.iterator().next());
                continue;
            }
            String names = String.join(" and ", personNames);
            System.out.println(names);
        }
    }
}
    
