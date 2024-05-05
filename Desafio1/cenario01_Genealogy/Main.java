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
        Person lorena = new Person("Lorena");

        sigrid.spouse(new Person("Peter"));

        Person martin = new Person("Martin");
        Person thomas = new Person("Thomas");
        Person claudia = new Person("Claudia");

        martin.spouse(new Person("Carla"));
        martin.addChild(new Person("Nicolas"));


        lily.printFamilyTree(0);
        opa.printFamilyTree(0);
        reinhold.printFamilyTree(0);
        christian.printFamilyTree(0);
        oscar.printFamilyTree(0);
        lorena.printFamilyTree(0);
        gabrielle.printFamilyTree(0);
        sabine.printFamilyTree(0);
        wilma.printFamilyTree(0);
        ricardo.printFamilyTree(0);
        rodrigo.printFamilyTree(0);
        sigrid.printFamilyTree(0);
        martin.printFamilyTree(0);
        thomas.printFamilyTree(0);
        claudia.printFamilyTree(0);
    }
}
