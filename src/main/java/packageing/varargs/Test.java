package packageing.varargs;


public class Test {

    public static void main(String[] args){
        MyClass obj = new MyClass();
        MyClass2 obj2 = new MyClass2();

        System.out.println(obj.addAll(1, 2));
        System.out.println(obj.addAll(1, 2, 3));

        obj2.addAll(1,2,3,4,5,6,7);

    }
}

