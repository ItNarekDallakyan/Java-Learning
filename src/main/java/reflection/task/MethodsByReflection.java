package reflection.task;

public interface MethodsByReflection {
    int getClassConstructorCount(Object o);

    int getClassModifireType(Object o);

    String getMethodName(Object o);

    String getSuperClassName(Object o);

    String getSubClassName(Class c);

    String getMethodParametrName(Object o);

    int getMethodParametrCount(Object o);

    String getInterfaceMethods(Class cls);

    String getEnumConstant(Class en);

    void getClassNameFromPackage(Class obj);

    //
}
