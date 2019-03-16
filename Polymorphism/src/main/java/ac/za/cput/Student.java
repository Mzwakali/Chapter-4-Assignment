package ac.za.cput;

public class Student extends Enrollment implements Department{

    private String name;
    private String surname;
    private String course;

    public Student(String name, String surname) {
        this.name = name;
        this.surname = surname;
        this.course = course();
    }

    public String enrol(){
        return super.enrol() + " at CPUT, District Six Campus";
    }

    @Override
    public String course() {
        return "Candidate";
    }
}
