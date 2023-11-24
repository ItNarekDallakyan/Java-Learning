package reflection.task.controller;

import reflection.task.Example;
import reflection.task.MethodsByReflection;
import reflection.task.model.Human;
import reflection.task.model.Information;
import reflection.task.model.Student;
import reflection.task.UserPass;

import java.io.File;
import java.io.InputStream;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.*;

public class Controller extends Information implements MethodsByReflection {
    private int tarberak;
    private int tarberak_interface_enum;
    private ArrayList<String> methodsName = new ArrayList<>();
    private ArrayList<String> iterface_enum_info_name = new ArrayList<>();
    private ArrayList<Object> objects = new ArrayList<>();
    private ArrayList<Class> interfacesName = new ArrayList<>();
    private Class c;
    private Class interfase;
    private Class a_bstract;
    private Class enam;
    private Information information = new Information();

    public void realisation() {
        methodsName.add("Constructor Count");
        methodsName.add("Class Modifier Type");
        methodsName.add("Method Name");
        methodsName.add("Super Class Name");
        methodsName.add("Sub Class Name");
        methodsName.add("Method Parameter Name");
        methodsName.add("Method Parameter Count");

        iterface_enum_info_name.add("Interface Methods");
        iterface_enum_info_name.add("Enum Constants");
        iterface_enum_info_name.add("Class Name From Package");

        interfacesName.add(MethodsByReflection.class);
        interfacesName.add(Example.class);
        interfacesName.add(UserPass.class);
        interfacesName.add(Comparator.class);
        interfacesName.add(Comparable.class);
        interfacesName.add(Runnable.class);
        interfacesName.add(Enum.class);
        interfacesName.add(Serializable.class);
        interfacesName.add(Cloneable.class);
        interfacesName.add(InputStream.class);

        objects.add(new Human());
        objects.add(new Student());
        objects.add(new ArrayList<>());
        objects.add(new Object());
        objects.add(new Information());
        objects.add(new Controller());
        objects.add(new Thread());
        objects.add(new File("a"));

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter class name");
        String name = scanner.next();
        int index = 0;
        interfase = information.getInterface(interfacesName, name);
        enam = information.getEnum(interfacesName, name);
        a_bstract = information.getAbstract(interfacesName, name);
        for (; ; ) {
            if (interfase != null) {
                tarberak_interface_enum++;
                break;
            } else if (a_bstract != null) {
                tarberak_interface_enum++;
                break;
            } else if (enam != null) {
                tarberak_interface_enum++;
                break;
            } else {
                tarberak_interface_enum = 0;
            }
            for (int i = 0; i < objects.size(); i++) {
                c = objects.get(i).getClass();
                index = i;
                if (c.getName().contains(name)) {
                    tarberak++;
                    break;
                } else {
                    tarberak = 0;
                }
            }
            if (tarberak == 0 || tarberak == 1 || tarberak_interface_enum == 0 || tarberak_interface_enum == 1) {
                break;
            }
        }

        if (tarberak_interface_enum == 1) {
            System.out.println("Choose Class information type \nInput number");
            for (int j = 0; j < iterface_enum_info_name.size(); j++) {
                System.out.println(j + " " + iterface_enum_info_name.get(j));
            }
        } else if (tarberak == 1) {
            System.out.println("Choose Class information type \nInput number");
            for (int j = 0; j < methodsName.size(); j++) {
                System.out.println(j + " " + methodsName.get(j));
            }
        } else {
            System.out.println("Wrong class name");
            System.exit(0);
        }
        int num = scanner.nextByte();
        if (num == 0 && tarberak == 1) {
            System.out.println("In this class we have " + getClassConstructorCount(objects.get(index)) + " constructors");
        } else if (num == 1 && tarberak == 1) {
            if (Modifier.isPublic(getClassModifireType(objects.get(index)))) {
                System.out.println("In this class we have Public Modifier");
            }
            if (Modifier.isAbstract(getClassModifireType(objects.get(index)))) {
                System.out.println("In this class we have Abstract Modifier");
            }
            if (Modifier.isFinal(getClassModifireType(objects.get(index)))) {
                System.out.println("In this class we have Final Modifier");
            }
        } else if (num == 2 && tarberak == 1) {
            System.out.println("In this class we have\n" + getMethodName(objects.get(index)) + "methods");
        } else if (num == 3 && tarberak == 1) {
            System.out.println("This class super class name is:\n" + getSuperClassName(objects.get(index)));
        } else if (num == 4 && tarberak == 1) {
            System.out.println("This class sub class name is:\n" + getSubClassName(objects.get(index).getClass()));
        } else if (num == 5 && tarberak == 1) {
            System.out.println("This class Method Parameters name is:\n" + getMethodParametrName(objects.get(index)));
        } else if (num == 6 && tarberak == 1) {
            System.out.println("This class Method Parameters count is:\n" + getMethodParametrCount(objects.get(index)));
        }
        if (num == 0 && tarberak_interface_enum == 1) {
            System.out.println("This class is an interface and its methods are:\n" + getInterfaceMethods(interfase));
        } else if (num == 1 && tarberak_interface_enum == 1) {
            System.out.println("This class is an enum class ant its Constants name is:\n" + getEnumConstant(enam));
        } else if (num == 2 && tarberak_interface_enum == 1) {
            getClassNameFromPackage(a_bstract);
        }
    }

    @Override
    public int getClassConstructorCount(Object o) {
        Class c = o.getClass();
        Constructor[] constructors = c.getConstructors();
        int l = constructors.length;
        return l;
    }

    @Override
    public int getClassModifireType(Object o) {
        Class c = o.getClass();
        int modifer = c.getModifiers();
        return modifer;
    }

    @Override
    public String getMethodName(Object o) {
        Class c = o.getClass();
        Method[] methods = c.getMethods();
        String methodName = "";
        for (int i = 0; i < methods.length; i++) {
            methodName += methods[i] + "\n";
        }
        return methodName;
    }

    @Override
    public String getSuperClassName(Object o) {
        Class c = o.getClass();
        Class superName = c.getSuperclass();
        return superName.getName();
    }

    @Override
    public String getSubClassName(Class c) {
        Class b = c.asSubclass(c.getSuperclass());
        String name = b.getName();
        return name;
    }

    @Override
    public String getMethodParametrName(Object o) {
        Class c = o.getClass();
        Method[] methods = c.getMethods();
        List<String> list = new ArrayList<>();
        for (int i = 0; i < methods.length - 9; i++) {
            for (int j = 0; j < methods[i].getParameterTypes().length; j++) {
                list.add(methods[i].getParameterTypes()[j].getName());
            }
        }
        String paramNames = "";
        for (int i = 0; i < list.size(); i++) {
            paramNames += list.get(i) + "\n";
        }
        return paramNames;
    }

    @Override
    public int getMethodParametrCount(Object o) {
        Class c = o.getClass();
        Method[] methods = c.getMethods();
        int sum = 0;
        for (int i = 0; i < methods.length - 9; i++) {
            sum += methods[i].getParameterCount();
        }
        return sum;
    }

    @Override
    public String getEnumConstant(Class cls) {
        Object[] objects = cls.getEnumConstants();
        String enumConstantName = "";
        for (int i = 0; i < objects.length; i++) {
            enumConstantName += objects[i].toString() + "\n";
        }
        return enumConstantName;
    }

    public String getInterfaceMethods(Class cls) {
        Method[] c = cls.getMethods();
        String interfaceMethodName = "";
        for (int i = 0; i < c.length; i++) {
            interfaceMethodName += c[i].getName() + "\n";
        }
        return interfaceMethodName;
    }

    public void getClassNameFromPackage(Class obj) {

        Class c = obj.getEnclosingClass();
        String nameOfSimple = obj.toString();
        String s = obj.getCanonicalName();
        if (c != null) {
            System.out.println(c.getName() + " " + nameOfSimple + " " + s);
        } else {
            System.out.println(getClass().getName());
            System.out.println(nameOfSimple);
            System.out.println(s);
        }
        try {
            Class.forName("com.company");
        } catch (ClassNotFoundException e) {
            System.out.println("my class isn't there!");
        }
    }
}