package packageing.autoboxing_unboxing.autoboxing.jdk;

public class Main {
    public static void main(String[] args){
        Integer iOb = 10;
        method(iOb);
    }

    public static void method(int i){
        System.out.println("int");
    }

    public static void method(Integer iOb){ //KKanchvi hetevyal metodn
        System.out.println("Integer");

    }

    //vat artadroxakanutyun
    public static Integer sumBeforeInclusive(Integer number) {
        Integer iOb = number;
        if (number > 1) iOb += sumBeforeInclusive(number - 1);
        return iOb;
    }
}