import java.util.ArrayList;
import java.util.List;

public class FerrisWheel {
    private static final int GONDOLA_COUNT = 18;
    private final List<List<Child>> gondolas;

    public FerrisWheel() {
        gondolas = new ArrayList<>();
        for (int i = 0; i < GONDOLA_COUNT; i++) {
            gondolas.add(new ArrayList<>());
        }
    }

    public void board(int gondolaNumber, Child... children) {
        if (gondolaNumber < 1 || gondolaNumber > GONDOLA_COUNT) {
            System.out.println("Número de gôndola inválido!");
            return;
        }

        if (children.length == 0) {
            System.out.println("Nenhum passageiro para embarcar!");
            return;
        }

        for (Child child : children) {
            if (child.getAge() < 12 && child.getFather() == null) {
                System.out.println("Erro: Criança menor de 12 anos deve estar acompanhada pelo pai!");
                return;
            }
        }

        for (Child child : children) {
            gondolas.get(gondolaNumber - 1).add(child);
        }
    }

    public void board(int gondolaNumber, Adult adult, Child child) {
        if (gondolaNumber < 1 || gondolaNumber > GONDOLA_COUNT) {
            System.out.println("Número de gôndola inválido!");
            return;
        }

        if (child.getAge() < 12 && child.getFather() == null) {
            System.out.println("Erro: Criança menor de 12 anos deve estar acompanhada pelo pai");
            return;
        }

        gondolas.get(gondolaNumber - 1).add(child);
        gondolas.get(gondolaNumber - 1).add(new Child(adult.getName(), adult.getAge(), adult));
    }

    public void status() {
        System.out.println("Status da Roda Gigante");
        System.out.println("_______________________");
        for (int i = 0; i < GONDOLA_COUNT; i++) {
            System.out.print((i + 1) + " ");
            if (gondolas.get(i).isEmpty()) {
                System.out.println("(vazio)");
            } else {
                for (Child child : gondolas.get(i)) {
                    System.out.print(child.getName() + " ");
                }
                System.out.println();
            }
        }
    }
}