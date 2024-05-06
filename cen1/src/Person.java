import java.util.ArrayList;
import java.util.List;

public class Person {
    private final String name; // Declaring a private final variable to store the name of the person.

    private Person spouse; // Declaring a private variable to store the spouse of the person.

    private final List<Person> children; // Declaring a private final list to store the children of the person.

    public Person(String name) { // Constructor to initialize a Person object with only a name.
        this.name = name;
        this.children = new ArrayList<>(); // Initializing the list of children as an empty ArrayList.
    }

    public Person(String name, Person spouse) { // Constructor to initialize a Person object with a name and a spouse.
        this.name = name;
        this.spouse = spouse;
        this.children = new ArrayList<>(); // Initializing the list of children as an empty ArrayList.
    }

    public void spouse(Person spouse) { // Method to set the spouse of the person.
        this.spouse = spouse; // Setting the spouse of the current person.
        spouse.spouse = this; // Setting the spouse's spouse as the current person (making it reciprocal).
    }

    public void addChild(Person child) { // Method to add a child to the person's list of children.
        children.add(child); // Adding the child to the list of children.
    }

    public void printFamilyTree(int level) { // Method to print the family tree of the person.
        String prefix = "    ".repeat(level); // Generating indentation based on the level in the family tree.
        System.out.println(prefix + name + " -- Married to: " + (spouse != null ? spouse.name : "Single") + (children.isEmpty() ? "" : " -- Children:")); // Printing the person's name, spouse's name (if any), and children (if any).
        for (Person child : children) { // Iterating through each child of the person.
            child.printFamilyTree(level + 1); // Recursively printing the family tree of each child with increased indentation level.
        }
    }
}

}
