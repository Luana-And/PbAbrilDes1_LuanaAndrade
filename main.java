public class main {
    public static void main(String[] args) {

        Person lily = new Person("Lily");
        lily.spouse(new Person("Wilhelm"));

        // Patriarch and matriarch
        Person opa = new Person("Opa");
        opa.spouse(new Person("Oma"));

        // Children of Oma and Opa
        Person reinhold = new Person("Reinhold");
        reinhold.spouse(new Person("Sonia"));
        opa.addChild(reinhold);

        Person wilma = new Person("Wilma");
        wilma.spouse(new Person("Rodolfo"));
        opa.addChild(wilma);

        Person sigrid = new Person("Sigrid");
        sigrid.spouse(new Person("Peter"));
        opa.addChild(sigrid);

        // Children and spouse of Reinhold
        Person christian = new Person("Christian");
        reinhold.addChild(christian);

        Person gabrielle = new Person("Gabrielle");
        reinhold.addChild(gabrielle);

        Person sabine = new Person("Sabine");
        reinhold.addChild(sabine);

        // Children and spouse of Wilma
        Person ricardo = new Person("Ricardo");
        wilma.addChild(ricardo);

        Person rodrigo = new Person("Rodrigo");
        wilma.addChild(rodrigo);

        // Ricardo and spouse
        ricardo.spouse(new Person("Debora"));

        // Children and spouse of Christian
        Person oscar = new Person("Oscar");
        christian.addChild(oscar);

        Person lorena = new Person("Lorena");
        christian.addChild(lorena);
        christian.spouse(new Person("Monica"));

        // Children and spouse of Sigrid
        Person martin = new Person("Martin");
        sigrid.addChild(martin);
        martin.spouse(new Person("Carla"));
        martin.addChild(new Person("Nicolas"));

        Person thomas = new Person("Thomas");
        sigrid.addChild(thomas);

        Person claudia = new Person("Claudia");
        sigrid.addChild(claudia);

        lily.printFamilyTree();
        opa.printFamilyTree();
        reinhold.printFamilyTree();
        wilma.printFamilyTree();
        sigrid.printFamilyTree();
        christian.printFamilyTree();
        ricardo.printFamilyTree();
        rodrigo.printFamilyTree();
        gabrielle.printFamilyTree();
        sabine.printFamilyTree();
        oscar.printFamilyTree();
        lorena.printFamilyTree();
        martin.printFamilyTree();
        thomas.printFamilyTree();
        claudia.printFamilyTree();
    }
}
