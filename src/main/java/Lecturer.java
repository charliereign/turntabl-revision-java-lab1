public class Lecturer {
    private String name;
    private Lectures lectures;

    public Lecturer(String name, Lectures lectures) {
        this.name = name;
        this.lectures = lectures;
    }

    public String getName() {
        return name;
    }

    public Lectures getLectures() {
        return lectures;
    }

    @Override
    public String toString() {
        return "Lecturer{" +
                "name='" + name + '\'' +
                ", lectures=" + lectures +
                '}';
    }
}
