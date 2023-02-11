import java.time.LocalDate;
import java.util.Arrays;

public class Group {
    private Student[] student;
    private String learning;
    private LocalDate dateOfStart;

    public Group() {
    }

    public Group(Student[] student, String learning, LocalDate dateOfStart) {
        this.student = student;
        this.learning = learning;
        this.dateOfStart = dateOfStart;
    }

    public Student[] getStudent() {
        return student;
    }

    public void setStudent(Student[] student) {
        this.student = student;
    }

    public String getLearning() {
        return learning;
    }

    public void setLearning(String learning) {
        this.learning = learning;
    }

    public LocalDate getDateOfStart() {
        return dateOfStart;
    }

    public void setDateOfStart(LocalDate dateOfStart) {
        this.dateOfStart = dateOfStart;
    }

    @Override
    public String toString() {
        return "Group{" +
                "\nstudent=" + Arrays.toString(student) +
                ", \nlearning='" + learning + '\'' +
                ",\n dateOfStart=" + dateOfStart +
                '}';
    }
}
