import java.util.ArrayList;
import java.util.List;

public class Person {
    private final String name;
    private Person spouse;
    private final List<Person> children;

    public Person(String name) {
        this.name = name;
        this.children = new ArrayList<>();
    }

    public void spouse(Person spouse) {
        this.spouse = spouse;
        spouse.spouse = this;
    }

    public void addChild(Person child) {
        children.add(child);
    }

    public void printFamilyTree() {
        System.out.println("Genealogy of " + name + ":");
        printFamilyTreeRecursive(this, 0);
    }

    private void printFamilyTreeRecursive(Person person, int level) {
        StringBuilder prefix = new StringBuilder();
        for (int i = 0; i < level; i++) {
            prefix.append("    "); // Adjust the spacing as needed
        }
        System.out.println(prefix.toString() + person.getName());

        if (person.spouse != null) {
            System.out.println(prefix.toString() + " -- Married to: " + person.spouse.getName());
        }

        for (Person child : person.children) {
            printFamilyTreeRecursive(child, level + 1);
        }
    }

    public String getName() {
        return name;
    }

    public Person getSpouse() {
        return spouse;
    }

    public List<Person> getChildren() {
        return children;
    }
}