import java.util.List;

public class AdvanceGardening {
    private Year year;
    private List<Student> students;

    public AdvanceGardening(Year year, List<Student> students) {
        this.year = year;
        this.students = students;
    }

    public Year getYear() {
        return year;
    }

    public List<Student> getStudents() {
        return students;
    }

    @Override
    public String toString() {
        return "AdvanceGardening{" +
                "year=" + year +
                ", students=" + students +
                '}';
    }
}
