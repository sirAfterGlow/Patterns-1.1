public class PersonBuilder {
    private String firstName;
    private String lastName;
    private Integer age;
    private String address;

    public PersonBuilder setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public PersonBuilder setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public PersonBuilder setAge(Integer age) throws IllegalArgumentException {
        if (age < 0) {
            IllegalArgumentException exception = new IllegalArgumentException("Age less than 0");
            throw exception;
        }
        this.age = age;
        return this;
    }

    public PersonBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public Person build() throws IllegalStateException {
        if (firstName == null || lastName == null) {
            IllegalStateException exception = new IllegalStateException("Person hasn't full name");
            throw exception;
        }
        Person person = new Person(firstName, lastName, age, address);
        return person;
    }
}
