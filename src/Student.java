import java.time.LocalDate;
import java.time.Period;

public class Student {
    private String fullName;
    private LocalDate dateOfBirth;
    private String email;
    private int age;

    public Student() {
    }

    public Student(String fullName, LocalDate dateOfBirth, String email) {
        this.fullName = fullName;
        this.dateOfBirth = dateOfBirth;
        this.email = email;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.age= Period.between(LocalDate.now(),dateOfBirth).getYears();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "\nfullName='" + fullName + '\'' +
                ",\n dateOfBirth=" + age +
                ",\n email='" + email + '\'' +
                ",\n age=" + age +
                '}';
    }
}
