package pl.jakubkrys.peopleregister;

public class Person <T, C> {

    private String name;
    private String surname;
    private T identifier;
    private C postalCode;

    public Person(String name, String surname, T identifier, C postalcode) {
        this.name = name;
        this.surname = surname;
        this.identifier = identifier;
        this.postalCode = postalcode;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", identifier=" + identifier +
                ", postalCode=" + postalCode +
                '}';
    }
}
