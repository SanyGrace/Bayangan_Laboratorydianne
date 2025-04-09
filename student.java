public class person {
    private String name;
    private int age;
    protected double gradelevel;

    public person(String name, int age, double gradelevel) {
        this.name = name;
        this.age = age;
        this.gradelevel = gradelevel;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public double getGradeLevel() {
        return this.gradelevel;
    }

    public static void main(String[] args) {
        person student = new person("Dianne", 24, 3.5);

        System.out.println("Name: " + student.getName());
        System.out.println("Age: " + student.getAge());
        System.out.println("Grade Level: " + student.getGradeLevel());
    }
}
