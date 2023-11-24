package reflection.task.model;

import java.lang.reflect.Modifier;
import java.util.ArrayList;

public class Information {
    public Class getInterface(ArrayList<Class> interfacesName, String name) {
        Class interfase = interfacesName.get(0);
        for (int i = 0; i < interfacesName.size(); i++) {
            if (interfacesName.get(i).getName().contains(name)) {
                if (Modifier.isInterface(interfacesName.get(i).getModifiers())) {
                    interfase = interfacesName.get(i);
                    break;
                } else {
                    interfase = null;
                }
            } else {
                interfase = null;
            }
        }
        return interfase;
    }

    public Class getAbstract(ArrayList<Class> abstractName, String name) {
        Class abstruct_class = abstractName.get(0);
        for (int i = 0; i < abstractName.size(); i++) {
            if (abstractName.get(i).getName().contains(name)) {
                if (Modifier.isAbstract(abstractName.get(i).getModifiers())) {
                    abstruct_class = abstractName.get(i);
                    break;
                } else {
                    abstruct_class = null;
                }
            } else {
                abstruct_class = null;
            }
        }
        return abstruct_class;
    }

    public Class getEnum(ArrayList<Class> enumName, String name) {
        Class enam = enumName.get(0);
        for (int i = 0; i < enumName.size(); i++) {
            if (enumName.get(i).getName().contains(name)) {
                if (enumName.get(i).isEnum()) {
                    enam = enumName.get(i);
                    break;
                } else {
                    enam = null;
                }
            } else {
                enam = null;
            }
        }
        return enam;
    }
}
