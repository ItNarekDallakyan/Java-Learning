package reflection.task.model;

public class Student extends Human {
    private int cours;

    public void setCours(int cours) {
        this.cours = cours;
    }

    public int getCours() {
        return cours;
    }

    public boolean examen() {
        if (cours >= 2) {
            return true;
        } else {
            return false;
        }
    }

    public void studentInfo() {
        System.out.println(toString());
        System.out.println("i am study now in " + cours + " cours");
    }
}
