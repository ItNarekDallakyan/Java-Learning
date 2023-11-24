package oop.aggregation;

import java.util.*;

class Aggregation{
  public static void main(String[] args){
    Employee e1 = new Employee("Shamlikhan","CP",1214,"Trainee");
    Employee e2 = new Employee("Amal","Karayi",1215,"Trainee");
    Employee e3 = new Employee("Lixo","George",214,"PM");
    Employee e4 = new Employee("Rony","Cherian",714,"Developer");
    Employee e5 = new Employee("Nithin","Govind",1218,"QA");

    List<Employee> empTR = new ArrayList<>();
    empTR.add(e1);
    empTR.add(e2);

    List<Employee> empPM = new ArrayList<>();
    empPM.add(e3);

    List<Employee> empDV = new ArrayList<>();
    empDV.add(e4);

    List<Employee> empQA = new ArrayList<>();
    empQA.add(e5);

    EmpRole TR = new EmpRole("Trainee",empTR);
    EmpRole PM = new EmpRole("ProjectManager",empPM);
    EmpRole QA = new EmpRole("QualityAssurance",empQA);
    EmpRole DV = new EmpRole("Developer",empDV);

    List<EmpRole> koratty = new ArrayList<>();
    koratty.add(TR);
    koratty.add(PM);
    koratty.add(QA);
    koratty.add(DV);

    Company it = new Company("IT-Home",koratty);

    System.out.print("Total number of employees in "+it.getName()+" is: ");
    System.out.print(it.getTotalEmployeeCount()+"\n");
  }
}
