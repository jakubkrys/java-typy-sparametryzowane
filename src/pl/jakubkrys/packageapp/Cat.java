package pl.jakubkrys.packageapp;

public class Cat {

    private String breed;
    private int age;

    public Cat(String breed, int age) {
        this.breed = breed;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "breed='" + breed + '\'' +
                ", age=" + age +
                '}';
    }
}
