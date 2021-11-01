public class Student {
    private String name;
    private String id;
    private Year year;

    public Student(String name, String id, Year year) {
        this.name = name;
        this.id = id;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public Year getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", year=" + year +
                '}' + '\n';
    }
}
