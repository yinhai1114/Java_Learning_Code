package com.yinhai.homework_.homework03;

public class Homework03 {
    public static void main(String[] args) {
        Professor professor = new Professor("xiaowang",18,2000);
        professor.introduce();
        AssociateProfessor laowang = new AssociateProfessor("laowang", 50, 50000);
        laowang.introduce();
        Lecturer lecturer = new Lecturer("yinhai",18,7000);
        lecturer.introduce();
        Teacher teacher = new Teacher("test",00);
        teacher.introduce();

    }
}

