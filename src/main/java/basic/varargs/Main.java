package basic.varargs;

public class Main {
    public static void main(String[] args){

    Varargs varargs = new Varargs();
    varargs.addAll(1);
    varargs.addAll(1,2);
//    varargs.addAll(1,2,3);
//    varargs.addAll(1,2,3,4);
//    varargs.addAll(1,2,3,4,5);


    }

}


class Varargs{
    void addAll(int... numbers)
    {
        int sum = 0;

        for (int number : numbers) {
            sum = sum + number;
            System.out.println("Adding " + number + ": get " + sum);
        }
    }

}