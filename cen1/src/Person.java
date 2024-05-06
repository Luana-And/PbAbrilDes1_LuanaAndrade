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

    public Person(String name, Person spouse) {
        this.name = name;
        this.spouse = spouse;
        this.children = new ArrayList<>();
    }

    public void spouse(Person spouse) {
        this.spouse = spouse;
        spouse.spouse = this;
    }

    public void addChild(Person child) {
        children.add(child);
    }

    public void printFamilyTree(int level) {
        String prefix = "    ".repeat(level);
        System.out.println(prefix + name + " -- Married to: " + (spouse != null ? spouse.name : "Single") + (children.isEmpty() ? "" : " -- Children:"));
        for (Person child : children) {
            child.printFamilyTree(level + 1);
        }
    }
}