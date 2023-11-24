package packageing.varargs;

public class OtherVararg {

    public static void main(String args[]){

        display(500, "hello");//one argument
        display(1000, "my", "name", "is", "varargs");//four arguments
    }



    private static void display(int num, String... values){
        System.out.println("number is " + num);
        for (String s : values) {
            System.out.println(s);
        }
    }

}
