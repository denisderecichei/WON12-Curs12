package org.fasttrack.curs12.random;

import org.fasttrack.tema11.StudentGrade;

//JAVA IS ALWAYS PASS BY VALUE
public class MainRandom {

    public static void main(String[] args) {
        int age = 40;
        int b = age;
        age += 10;
        b = b + 5;
        System.out.println(age + ";" + b);

        StudentGrade grade = new StudentGrade("Denis", "Limba Romana", 7);
        StudentGrade altGrade = grade;
        System.out.println(grade);
        System.out.println(altGrade);
        grade.setGrade(4);
        System.out.println(grade);
        System.out.println(altGrade);

        Car car = new Car("BMW", "Seria 5");
    }
}
