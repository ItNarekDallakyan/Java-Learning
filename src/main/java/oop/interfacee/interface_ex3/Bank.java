package oop.interfacee.interface_ex3;

interface Bank {
    float rateOfInterest();
}

class Ameria implements Bank {
    public float rateOfInterest(){
        return 9.15f;
    }
}

class VTB implements Bank {
    public float rateOfInterest(){
        return 9.7f;
    }
}

class TestInterface2 {
    public static void main(String[] args){
        Bank b = new Ameria();
        System.out.println("ROI: " + b.rateOfInterest());
    }
}