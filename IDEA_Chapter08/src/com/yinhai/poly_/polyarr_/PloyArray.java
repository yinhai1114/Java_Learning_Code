package com.yinhai.poly_.polyarr_;

public class PloyArray {
    public static void main(String[] args) {
        Person[] persons = new Person[5];//dynamic array
        persons[0] = new Person("JACK",20);
        persons[1] = new Student("xiaoming",18,60);
        persons[2] = new Student("xiaohuang",20,99);
        persons[3] = new Teacher("Mr.huang",26,9000);
        persons[4] = new Teacher("Ms.wang",26,7000);
        //iterate over array to running 'say' method
        for(int i = 0;i < persons.length;i++){
            //compilation type of person[i] is fixed,but run type is dynamic
            System.out.println(persons[i].say());
            if(persons[i] instanceof Student){//to use for unique method of subclass
                //use the instanceof statement to determine if this is the same type or subclasses
                Student student = (Student) persons[i];
                student.study();//transition down to use method of subclasses
                //((Student) persons[i]).study();
                // can also use this statement ,that also can output the study method
            } else if(persons[i] instanceof Teacher){
                //same above if statement
                Teacher teacher = (Teacher) persons[i];
                teacher.teach();//same above
                //((Teacher) persons[i]).teach();//same above
            }else if (persons[i] instanceof Person){

            }
            else{
                System.out.println("Have one data is neither student " +
                        "nor teacher,please check correctness of the data ");
            }
        }

    }
}
