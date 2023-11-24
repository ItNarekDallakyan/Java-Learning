package collections.set.training.pkg4;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.TreeSet;
import java.util.function.Consumer;

public class MyCompUserDefine {
    public static void main(String[] args) {

        TreeSet<Empl> nameComp = new TreeSet<>(new MyNameComp());
        nameComp.add(new Empl("Aram", 6000));
        nameComp.add(new Empl("Artur", 4000));
        nameComp.add(new Empl("Arayik", 5000));
        nameComp.add(new Empl("Ruben", 8000));
        for (Empl e : nameComp){
            System.out.println(e);
        }
        System.out.println("============");
        TreeSet<Empl> salComp = new TreeSet<>(new MySalaryComp());
       salComp.add(new Empl("Aram", 6000));
       salComp.add(new Empl("Artur", 4000));
       salComp.add(new Empl("Arayik", 5000));
       salComp.add(new Empl("Ruben", 8000));
        for (Empl e1 : salComp){
            System.out.println(e1);
        }
        //TODO Petqa tvyal avelacnem inch vor kod

    }
}

class MyNameComp implements Comparator<Empl> {

    @Override
    public int compare(Empl o1, Empl o2) {
        return o1.getName().compareTo(o2.getName());
    }
}

class MySalaryComp implements Comparator<Empl> {


    @Override
    public int compare(Empl o1, Empl o2) {
        if (o1.getSalary() > o2.getSalary()) {
            return 1;
        } else {
            return -1;
        }
    }
}

class Empl {
    private String name;
    private int salary;

    public Empl(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Empl{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
