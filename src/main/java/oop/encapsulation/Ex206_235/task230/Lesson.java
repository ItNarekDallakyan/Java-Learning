package oop.encapsulation.Ex206_235.task230;

class Lesson{
    private String name;
    private int reting;
    private int appraisal;

    public Lesson() {
    }

    public Lesson(String name, int reting, int appraisal) {
        this.name = name;
        this.reting = reting;
        this.appraisal = appraisal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getReting() {
        return reting;
    }

    public void setReting(int reting) {
        this.reting = reting;
    }

    public int getAppraisal() {
        return appraisal;
    }

    public void setAppraisal(int appraisal) {
        this.appraisal = appraisal;
    }

    @Override
    public String toString() {
        return  name ;
    }
}