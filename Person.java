package com.company;

import java.sql.SQLOutput;

public class Person extends Utility {
    protected String name;
    protected int age;
    protected double wage;
    protected double [] grades_array;
    protected String [] grades_names;


    public Person(){ //constructor
        name = null;
        age = 0;
        wage = 0.0;
        grades_array = null;
        grades_names = null;

    }

    public void set_person() {
        System.out.println("ENTER A NAME: ");
       // name = new String();
        name = input.next();
        input.nextLine();

        System.out.println("ENTER AN AGE: ");
        age = input.nextInt();
        input.nextLine();

       System.out.println("ENTER A WAGE: ");
       wage = input.nextInt();
       input.nextLine();

        System.out.println("ENTER HOW MANY GRADES: ");
        int num = input.nextInt();
        grades_array = new double[num];

        grades_names = new String[num];

        for( int i = 0; i < num; ++i){
            System.out.println("Enter grade" + i + ": ");
            grades_array[i] = input.nextInt();
            System.out.println("Enter what assignment this grade is for: ");
            grades_names[i] = input.next();
        }

    }

    public void display(){
        System.out.println("NAME: " + name);

        System.out.println("AGE: " + age);

        System.out.println("WAGE: " + wage);

        int num = grades_array.length;
        for(int i = 0; i < num; ++i) {
            System.out.println("GRADE " + i + 1 + ": " + grades_array[i]);
            System.out.println("ASSIGNMENT " + i + 1 + ": " + grades_names[i]);
        }

    }

    public boolean compare_person(String to_compare){
       return this.name.equals(to_compare);

    }
}
