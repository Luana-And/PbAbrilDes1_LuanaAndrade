public class Child {
    private final String name;
    private final int age;
    private final Adult father;

    public Child(String name, int age, Adult father) {
        this.name = name;
        this.age = age;
        this.father = father;
    }

    public Child(String name, int age) {
        this.name = name;
        this.age = age;
        this.father = null;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Adult getFather() {
        return father;
    }
}

