package exceptions.training.runtimeExceptionsExamples;

public class ClassNotFound {
    public static void main(String[] args){
        String name = "training.uncheckedExceptionExample.animals.AnimalA";
        try {
            doForName1(name);
            System.out.println("Option 1 success");
        } catch (ClassNotFoundException e) {
            System.out.println("Option 1 error");
        }
        System.out.println("End of option 1");
        doForName2(name);
        System.out.println("End of option 2");
    }

    public static void doForName1(String name) throws ClassNotFoundException{
        Class.forName(name);
        System.out.println("Option 1 success");
        System.out.println("End of doForName1()");
    }

    public static void doForName2(String name){
        try {
            Class.forName(name);
            System.out.println("Option 2 success");
        } catch (ClassNotFoundException e) {
            System.out.println("Option 2 error");
        }
        System.out.println("End of doForName2()");
    }
}
