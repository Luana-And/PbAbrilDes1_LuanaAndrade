package application;

import java.util.*;
import model.Child;

public class FerrisWheel {
    private static final int GONDOLA_COUNT = 18;
    private final List<Set<Child>> gondolas;

    public FerrisWheel() {
        gondolas = new ArrayList<>();
        for (int i = 0; i < GONDOLA_COUNT; i++) {
            gondolas.add(new HashSet<>());
        }
    }

    public void board(int gondolaNumber, Child ... children) {
        if (gondolaNumber < 1 || gondolaNumber > GONDOLA_COUNT) {
            System.out.println("Número de gôndola inválido!");
            return;
        }

        for (Child child : children) {
            if (child.getAge() < 12 && child.getFather() == null) {
                System.out.println("Erro: Criança menor de 12 anos deve estar acompanhada pelo pai!");
                return;
            }
        }

        Set<Child> gondola = gondolas.get(gondolaNumber - 1);
        for (Child child : children) {
            if (!gondola.contains(child)) {
                gondola.add(child);
            }
        }
    }

    public void status() {
        System.out.println("\t* Gondola Status");
        System.out.println("\t* ______________");
        for (int i = 0; i < GONDOLA_COUNT; i++) {
            System.out.print("\t* " + (i + 1) + " ");
            if (gondolas.get(i).isEmpty()) {
                System.out.println("(empty)");
            } else {
                Set<String> childNames = new HashSet<>();
                boolean hasFather = false;
                for (Child child : gondolas.get(i)) {
                    childNames.add(child.getName());
                    if (child.getFather() != null) {
                        hasFather = true;
                    }
                }
                if (childNames.size() == 1) {
                    System.out.println("Only " + childNames.iterator().next());
                } else {
                    if (hasFather) {
                        childNames.add(gondolas.get(i).iterator().next().getFather().getName());
                    }
                    String names = String.join(" and ", childNames);
                    System.out.println(names);
                }
            }
        }
    }
}