package hometask;

import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) throws Exception{
        File file = new File("serialize.txt");
        Employee employee = new Employee("John", 12, 244.5);
        Methods.serialize(file, employee);
        System.out.println(Methods.deserialize(file));

        System.out.println("====================");

        File fileS = new File("serializeList.txt");
        List<Employee> list = new ArrayList<>();
        list.add(new Employee("Victor", 22, 123.4));
        list.add(new Employee("Oleksiy", 242, 100));
        list.add(new Employee("Yan", 2, 12325.3));
        Methods.serialize(fileS, (Serializable) list);
        System.out.println(Methods.deserialize(fileS));
    }
}
