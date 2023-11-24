package oop.aggregation;

import java.util.List;

class Company {
    private String name;
    private List<EmpRole> roleList;

    public String getName(){
        return name;
    }

    Company(String name, List<EmpRole> roleList){
        this.name = name;
        this.roleList = roleList;
    }

    int getTotalEmployeeCount(){

        int count = 0;
        List<Employee> empList;

        for (EmpRole empRole : roleList) {
            empList = empRole.getEmpList();
            for (Employee e : empList) {
                count++;
            }
        }
        return count;
    }
}