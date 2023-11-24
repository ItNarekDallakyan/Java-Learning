package oop.inheritance.level_2.task9;

public class WorkerProfession {
    protected String profession;

    public WorkerProfession() {
    }

    public WorkerProfession(String profession) {
        this.profession = profession;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    @Override
    public String toString() {
        return "WorkerProfession{" +
                "profession='" + profession + '\'' +
                '}';
    }
}