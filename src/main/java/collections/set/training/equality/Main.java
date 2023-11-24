package collections.set.training.equality;

public class Main {

    public static void main(String[] args) {

        String x = "x";
        String y = "x";
        String z = new String("x");

        System.out.println(x == y);//true
        System.out.println(x.equals(y));//true
        System.out.println(x == z);//false
        System.out.println(x.equals(z));//true

        Tsar tsar1 = new Tsar(1, "Xndzoreni");
        Tsar tsar2 = new Tsar(1, "Xndzoreni");

        System.out.println(tsar1 == tsar2);
        System.out.println(tsar1.equals(tsar2));

        Tsarik tsarik1 = new Tsarik(2, "Tandzeni");
        Tsarik tsarik2 = new Tsarik(2, "Tandzeni");


        System.out.println(tsarik1 == tsarik2);
        System.out.println(tsarik1.equals(tsarik2));

        System.out.println(tsarik1.hashCode()==tsarik2.hashCode());

    }
}
