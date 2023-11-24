package collections.list.arraylist.mobile_contacts;

 class Contact {
    private String name;
    private String phoneNumber;

     private Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

     String getName() {
        return name;
    }

     String getPhoneNumber() {
        return phoneNumber;
    }

     static Contact createContact(String name, String phoneNumber) {
        return new Contact(name, phoneNumber);
    }
}
