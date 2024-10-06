package demo.java;

import java.util.Objects;

public class Worker {
    private String name;
    private int age;

    public Worker(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Worker worker)) return false;
        return age == worker.age && Objects.equals(name, worker.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
