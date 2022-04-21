package com.company;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {


        Student student1 = new Student("Tilek", 2, 1, 5);
        Student student2 = new Student("Nuria", 1, 2, 5);
        Student student3 = new Student("Nuriza", 3, 1, 5);
        Student student4 = new Student("Gulnur", 2, 1, 4);
        Student student5 = new Student("Akyl", 4, 1, 3);
        Student student6 = new Student("Bek", 5, 1, 2);
        Student student7 = new Student("Nurbek", 1, 3, 2);
        Student student8 = new Student("Aigul", 5, 1, 4);
        Student student9 = new Student("janylai", 4, 4, 3);
        Student student10 = new Student("Janysh", 3, 1, 4);

        Set<Student> students = new TreeSet<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        students.add(student6);
        students.add(student7);
        students.add(student8);
        students.add(student9);
        students.add(student10);
        System.out.println(students);


        Iterator<Student>studentIterator = students.iterator();
        while (studentIterator.hasNext()){
            if (studentIterator.next().getGrade()<=3){
                studentIterator.remove();
            }
        }
        for (Student student : students){
            System.out.println(student);
        }
    }

 }
