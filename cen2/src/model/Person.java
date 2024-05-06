package model;

public abstract class Person {
    protected Adult father = null;
    private final int age;
    private String name;

    public int getAge() {
        return this.age;
    }
    public String getName() {
        return this.name;
    }

    public Adult getFather() {
        return father;
    }

    public Person(String name, int age, Adult father) {
        this.name = name;
        this.age = age;
        this.father = father;
    }
}
