package oop.encapsulation.Ex206_235.task229;

class Cinema{
    private String name;
    private String title;

    public Cinema() {
    }

    public Cinema(String name, String title) {
        this.name = name;
        this.title = title;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return  name ;
    }
}