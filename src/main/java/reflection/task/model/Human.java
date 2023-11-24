package reflection.task.model;

public class Human {
    private String name;
    private String lastName;
    private int age;
    private String sex;
    private boolean is_married;

    public Human() {
    }

    public Human(String name, String lastName, int age, String sex, boolean is_married) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.sex = sex;
        this.is_married = is_married;
    }

    public Human(String name, String lastName, int age) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getSex() {
        return sex;
    }

    public boolean isIs_married() {
        return is_married;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", is_married=" + is_married +
                '}';
    }
}