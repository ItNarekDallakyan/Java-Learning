package packageing.autoboxing_unboxing.autoboxing.jdk;


//Minchev jdk 5
public class Example {
    public static void main(String[] args){
        Integer iOb = new Integer(7);
        Double dOb = new Double(7.0);
        Character cOb = new Character('a');
        Boolean bOb = new Boolean(true);

        method(new Integer(7));
    }

    public static void method(Integer iOb){
        System.out.println("Integer");
    }
    //////////////////////////////////////////////////////
   /* public class Mainin {
        public static void main(String[] args) {
            Integer iOb = 7;
            Double dOb = 7.0;
            Character cOb = 'a';
            Boolean bOb = true;

            method(7);
        }

        public static void method(Integer iOb) {
            System.out.println("Integer");
        }
    }*/

    //////////////////////////////////////////////////////





    Integer iOb1 = new Integer(5);
    Integer iOb2 = new Integer(7);

    {
        System.out.println(iOb1.intValue() > iOb2.intValue());
    }


    //autounboxin
    {
        System.out.println(iOb1 > iOb2);
        System.out.println(iOb1 + iOb2);
    }

    static {
        Integer iOb1 = 100; // java.lang.Integer.valueOf(int), keshing -128 127
        Integer iOb2 = 100;
        System.out.println(iOb1 == iOb2);//true

        Integer iOb3 = new Integer(120);
        Integer iOb4 = new Integer(120);
        System.out.println(iOb3 == iOb4);//false

        Integer iOb5 = 200;
        Integer iOb6 = 200;
        System.out.println(iOb5 == iOb6); //false
    }

}