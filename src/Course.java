import java.time.LocalDate;
import java.util.Arrays;

public class Course {
           private  String name;
           private long number;
           private String nameOfTeacher;
           private Group[] group;

    public Course() {
    }

    public Course(String name, long number, String nameOfTeacher, Group[] group) {
        this.name = name;
        this.number = number;
        this.nameOfTeacher = nameOfTeacher;
        this.group = group;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public String getNameOfTeacher() {
        return nameOfTeacher;
    }

    public void setNameOfTeacher(String nameOfTeacher) {
        this.nameOfTeacher = nameOfTeacher;
    }

    public Group[] getGroup() {
        return group;
    }

    public void setGroup(Group[] group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return "Course{" +
                "\nname='" + name + '\'' +
                ",\n number=" + number +
                ",\n nameOfTeacher='" + nameOfTeacher + '\'' +
                ",\n group=" + Arrays.toString(group) +
                '}';
    }
}
