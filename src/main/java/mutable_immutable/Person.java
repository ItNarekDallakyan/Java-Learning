package mutable_immutable;

public class Person {

    private String firstname;
    private String lastname;
    private Address address;

    public Person(String firstname, String lastname, Address address){
        this.firstname = firstname;
        this.lastname = lastname;
        this.address = address;
    }

    public String getFirstname(){
        return firstname;
    }

    public String getLastname(){
        return lastname;
    }

    public Address getAddress(){
        return address;
    }

    public void setAddress(Address address){
        this.address = address;
    }

    @Override
    public String toString(){
        return "Person{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", address=" + address +
                '}';
    }
}
