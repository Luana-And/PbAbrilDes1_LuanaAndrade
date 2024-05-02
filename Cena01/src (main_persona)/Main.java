import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        Person lily = new Person("Lily");
        lily.spouse(new Person("Wilhelm"));

        Person opa = new Person("Opa", lily);
        opa.spouse(new Person("Oma"));

        Person reinhold = new Person("Reinhold", opa);
        Person wilma = new Person("Wilma", opa);
        Person sigrid = new Person("Sigrid", opa);

        reinhold.spouse(new Person("Sonia"));
        Person christian = new Person("Christian", reinhold);
        Person gabrielle = new Person("Gabrielle", reinhold);
        Person sabine = new Person("Sabine", reinhold);

        wilma.spouse(new Person("Rodolfo"));
        Person ricardo = new Person("Ricardo", wilma);
        Person rodrigo = new Person("Rodrigo");

        ricardo.spouse(new Person("Debora"));

        christian.spouse(new Person("Monica"));
        Person oscar = new Person("Oscar");
        Person lorena = new Person("Lorena", christian);

        sigrid.spouse(new Person("Peter"));
        Person martin = new Person("Martin");
        Person thomas = new Person("Thomas");
        Person claudia = new Person("Claudia");
        martin.spouse(new Person("Carla"));
        martin.addChild(new Person("Nicolas"));


            lily.printFamilyTree(0);
            opa.printFamilyTree(1);
            reinhold.printFamilyTree(2);
            christian.printFamilyTree(3);
            oscar.printFamilyTree(4);
            lorena.printFamilyTree(4);
            gabrielle.printFamilyTree(3);
            sabine.printFamilyTree(3);
            wilma.printFamilyTree(2);
            ricardo.printFamilyTree(3);
            rodrigo.printFamilyTree(3);
            sigrid.printFamilyTree(2);
            martin.printFamilyTree(3);
            thomas.printFamilyTree(3);
            claudia.printFamilyTree(3);
        }
    }

