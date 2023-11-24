package oop.composition.my_composition;

public class Electronic {
   private Notebook notebook;
   private PC pc;

    public Electronic(){
    }

    public Electronic(Notebook notebook, PC pc){
        this.notebook = notebook;
        this.pc = pc;
    }

    public Notebook getNotebook(){
        return notebook;
    }

    public void setNotebook(Notebook notebook){
        this.notebook = notebook;
    }

    public PC getPc(){
        return pc;
    }

    public void setPc(PC pc){
        this.pc = pc;
    }

    @Override
    public String toString(){
        return "Electronic{" +
                "notebook=" + notebook +
                ", pc=" + pc +
                '}';
    }
}
