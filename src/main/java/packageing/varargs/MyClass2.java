package packageing.varargs;

class MyClass2 {

     int addAll(int... numbers){
        int sum = 0;

        for (int number : numbers) {
            sum = sum + number;
            System.out.println("Adding " + number + ": get " + sum);
        }
        return sum;
    }


    /*  public void myVarArgs(String s, int... var) {
        // ...
    }*/

}