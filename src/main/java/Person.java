public class Person {

    private String firstName;
    private String lastName;
    private Integer age;
    private String address;

    public Person(String firstName, String lastName, Integer age, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.address = address;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public void happyBirthday() {
        age++;
    }

    public boolean hasAge() {
        return age != null;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean hasAddress() {
        return address != null;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }

    public PersonBuilder newChildBuilder() {
        PersonBuilder personBuilder = new PersonBuilder()
                .setLastName(this.lastName)
                .setAge(0)
                .setAddress(this.address);
        return personBuilder;

    }
}
