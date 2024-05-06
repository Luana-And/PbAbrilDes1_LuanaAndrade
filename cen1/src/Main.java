import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Person lily = new Person("Lily");
        lily.spouse(new Person("Wilhelm"));
        // Patriarch and matriarch
        Person opa = new Person("Opa", lily);
        opa.spouse(new Person("Oma"));
        // Children of Oma and Opa
        Person reinhold = new Person("Reinhold", opa);
        Person wilma = new Person("Wilma", opa);
        Person sigrid = new Person("Sigrid", opa);
        // Children and spouse of Reinhold
        reinhold.spouse(new Person("Sonia"));
        Person christian = new Person("Christian", reinhold);
        Person gabrielle = new Person("Gabrielle", reinhold);
        Person sabine = new Person("Sabine", reinhold);
        // Children and spouse of Wilma
        wilma.spouse(new Person("Rodolfo"));
        Person ricardo = new Person("Ricardo", wilma);
        Person rodrigo = new Person("Rodrigo", wilma);
        // Ricardo and spouse
        ricardo.spouse(new Person("Debora"));
        // Children and spouse of Christian
        christian.spouse(new Person("Monica"));
        Person oscar = new Person("Oscar", christian);
        Person lorena = new Person("Lorena", christian);
        // Children and spouse of Sigrid
        sigrid.spouse(new Person("Peter"));
        Person martin = new Person("Martin", sigrid);
        Person thomas = new Person("Thomas", sigrid);
        Person claudia = new Person("Claudia", sigrid);
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
