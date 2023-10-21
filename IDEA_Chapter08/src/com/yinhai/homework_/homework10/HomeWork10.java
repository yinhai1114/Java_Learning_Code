package com.yinhai.homework_.homework10;

public class HomeWork10 {
    public static void main(String[] args) {
        Doctor doctor1 = new Doctor("xiaowang", 20, "doctor", "nan", 2000);
        Doctor doctor2 = new Doctor("xiaowang", 20, "doctor", "nan", 2000);
        Doctor doctor3 = new Doctor("xiaowang", 21, "doctor", "nan", 2000);
        Doctor doctor4 = doctor1;

        Teacher teacher = new Teacher("xiaowang", 20, "doctor", "nan", 2000);
        System.out.println(doctor1.equals(doctor2));
        System.out.println(doctor1.equals(doctor3));
        System.out.println(doctor1.equals(doctor4));
        System.out.println(doctor1.equals(teacher));
    }
}
