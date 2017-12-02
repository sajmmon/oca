package _subclass;

public class Overloading {

    public static void main(String[] args) {
        Person p1 = new Student();
        Student s1 = new Student();
        s1.compare(p1); // Prints Person
    }
}

class Person {
    void compare(Person p){
        System.out.println("Person");
    }
}

class Student extends Person{
    void compare(Student s){ //Shadow because usage is determined in compile time
        System.out.println("Student");
    }
}