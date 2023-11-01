package com.yinhai.map_;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;


/**
 * @author 银海
 * @version 1.0
 */
public class MapExercise {
    public static void main(String[] args) {
        Map map = new HashMap();
        // System.out.println(map.getClass());
        Employee xiaohua = new Employee("xiaohua", 1444, "114514");
        Employee xiaowang = new Employee("xiaowang", 20000, "11451419");
        Employee xiaoming = new Employee("xiaoming", 190000, "1145141989");
        map.put(xiaohua.getId(),xiaohua);
        map.put(xiaowang.getId(),xiaowang);
        map.put(xiaoming.getId(),xiaoming);
        //两种方式遍历取出 通过key值取出KeySet
        Set keyset = map.keySet();
        for (Object o : keyset) {
            Employee employee = (Employee) map.get(o);
            if (employee.getSalary() > 18000){
                System.out.println(o + " - " +  map.get(o));
            }
        }
        //2通过Entry取出
        Set entrySet = map.entrySet();
        Iterator iterator = entrySet.iterator();
        while (iterator.hasNext()) {
            Map.Entry entry =  (Map.Entry)iterator.next();
            Employee employee = (Employee)entry.getValue();
            if(employee.getSalary() > 18000){
                System.out.println(employee);
            }

        }

    }
}

class Employee {
    private String name;
    private int salary;
    private String id;

    public String getId() {
        return id;
    }

    public Employee(String name, int salary, String id) {
        this.name = name;
        this.salary = salary;
        this.id = id;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "\tname=" + name +
                "\tsalary=" + salary +
                "\tid=" + id +
                '\n';
    }
}
