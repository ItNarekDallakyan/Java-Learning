package collections.list.arraylist.ArrayListJDBC_Crud;

public class Student {

    private int rollNo;
    private String name;
    private String city;
    private String dateOfPassing;
    private String technologies;

    public Student() {
    }


    public Student(int rollNo, String name, String city, String dateOfPassing, String technologies) {
        super();
        this.rollNo = rollNo;
        this.name = name;
        this.city = city;
        this.dateOfPassing = dateOfPassing;
        this.technologies = technologies;
    }

    int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    void setCity(String city) {
        this.city = city;
    }

    public String getDateOfPassing() {
        return dateOfPassing;
    }

    void setDateOfPassing(String dateOfPassing) {
        this.dateOfPassing = dateOfPassing;
    }

    public String getTechnologies() {
        return technologies;
    }

    void setTechnologies(String technologies) {
        this.technologies = technologies;
    }


    @Override
    public String toString() {
        //TODO Auto-generated method stub
        return "\n Roll No : " + this.rollNo + ", Name :" + this.name + ", City : " + this.city + ", DateOfPassing : " + this.dateOfPassing + ", Technologies : " + this.technologies + "";

        //return Student(this.rollNo,this.name,this.city,this.dateOfPassing,this.technologies);
    }


}
