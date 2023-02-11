import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Student student = new Student();
        student.setFullName("Abdugani uulu Manasbek");
        student.setDateOfBirth(LocalDate.of(1995,8,26));
        student.setEmail("cool.mega007@gmail.com");

        Student student1 = new Student();
        student1.setFullName("Bek Sultanov");
        student1.setDateOfBirth(LocalDate.of(1995,8,26));
        student1.setEmail("cool.mega007@gmail.com");
        Student[] students = {student,student1};

        Group group = new Group();
        group.setStudent(students);
        group.setDateOfStart(LocalDate.of(2023,01,01));
        group.setLearning("Programming");

        Group[] groups = {group};

        Course course = new Course();
        course.setName("Peaksoft");
        course.setNumber(0221234323);
        course.setNameOfTeacher("Ulan Kubanychbekov");
        course.setGroup(groups);
        System.out.println(course.toString());

    }
}