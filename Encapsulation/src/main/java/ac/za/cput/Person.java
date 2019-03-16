package ac.za.cput;

public class Person {

    private String name = "Thando";
    private String surname = "Mzwakali";
    private int age = 23;
    private boolean isStudent = true;

    public Person() {
    }

    public Person(String name, String surname, int age, boolean isStudent) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.isStudent = isStudent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isStudent() {
        return isStudent;
    }

    public void setStudent(boolean student) {
        isStudent = student;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", isStudent=" + isStudent +
                '}';
    }
}
