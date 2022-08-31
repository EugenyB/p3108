package main;

import example.Stack;
import logic.Student;
import logic.StudentRec;
import music.*;


public class Main {

    Student student;

    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
//        Student student = new Student();
//        System.out.println(student.getName());
        Instrument p = new Guitar("qwe");
        p.play("abcdef");

        Student s = new Student(17, "Vasya", 20);
        System.out.println(s);
        System.out.println(s.getName());

        StudentRec sr = new StudentRec(17, "Vasya", 20);
        System.out.println(sr);
        System.out.println(sr.name());

        Stack<Integer> stack = new Stack<>();
        stack.push(1);

    }
}

// Animal (name, age) - voice
// Cat
// Dog
// AngryDog
// Cow

// Animal[] animals