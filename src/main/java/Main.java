import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[]args){
        List<Student>students = List.of(
                new Student("Charles","001",Year.Fourth),
                new Student("Jelani","003",Year.First),
                new Student("David","006",Year.Second),
                new Student("Andy","008",Year.Third),
                new Student("Irene","011",Year.Third),
                new Student("Ben","012",Year.Second),
                new Student("Bless","015",Year.Third)
        );

        Lecturer lecturer = new Lecturer("Charlie",Lectures.EnglishLanguage);

        Course course = new Course(lecturer,students,Year.First);

        System.out.println(course.intro_to_programming(students));
    }
}
