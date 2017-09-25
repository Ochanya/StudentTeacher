package com.company;

import java.util.*;


public class Main {

    public static void main(String[] args) {
	// write your code here
        Student student1 = new Student();
        student1.setFirstName("Tommy");
        student1.setLastName("Jones");
        student1.setId(1);
        student1.setGrade(1);

        Student student2 = new Student();
        student2.setFirstName("Mary");
        student2.setLastName("Lamb");
        student2.setId(2);
        student2.setGrade(1);

        Student student3 = new Student();
        student3.setFirstName("Linda");
        student3.setLastName("Bell");
        student3.setId(3);
        student3.setGrade(1);

        Student student4 = new Student();
        student4.setFirstName("Nicole");
        student4.setLastName("Rich");
        student4.setId(4);
        student4.setGrade(1);

        Student student5 = new Student();
        student5.setFirstName("Tony");
        student5.setLastName("Johnson");
        student5.setId(5);
        student5.setGrade(1);

        Student student6 = new Student();
        student6.setFirstName("Mark");
        student6.setLastName("Gates");
        student6.setId(6);
        student6.setGrade(1);

        Student student7 = new Student();
        student7.setFirstName("Barbie");
        student7.setLastName("Doll");
        student7.setId(7);
        student7.setGrade(1);

        Student student8 = new Student();
        student8.setFirstName("Bill");
        student8.setLastName("King");
        student8.setId(8);
        student8.setGrade(1);

        Student student9 = new Student();
        student9.setFirstName("James");
        student9.setLastName("Dean");
        student9.setId(9);
        student9.setGrade(1);

        Student student10 = new Student();
        student10.setFirstName("Jada");
        student10.setLastName("Pinkett");
        student10.setId(10);
        student10.setGrade(1);

        Student student11 = new Student();
        student11.setFirstName("Will");
        student11.setLastName("Smith");
        student11.setId(11);
        student11.setGrade(1);

        Student student12 = new Student();
        student12.setFirstName("Linda");
        student12.setLastName("Williams");
        student12.setId(12);
        student12.setGrade(1);

        Student student13 = new Student();
        student13.setFirstName("Jane");
        student13.setLastName("Austin");
        student13.setId(13);
        student13.setGrade(1);

        Student student14 = new Student();
        student14.setFirstName("Tim");
        student14.setLastName("Johnson");
        student14.setId(14);
        student14.setGrade(1);

        Student student15 = new Student();
        student15.setFirstName("Tiffany");
        student15.setLastName("Jones");
        student15.setId(15);
        student15.setGrade(1);

        List<Student>studentList = new ArrayList<>();
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);
        studentList.add(student5);
        studentList.add(student6);
        studentList.add(student7);
        studentList.add(student8);
        studentList.add(student9);
        studentList.add(student10);
        studentList.add(student11);
        studentList.add(student12);
        studentList.add(student13);
        studentList.add(student14);
        studentList.add(student15);


        Teacher teacher1 = new Teacher();
        teacher1.setFirstName("Peppa");
        teacher1.setLastName("Pig");
        teacher1.setId(1);
        teacher1.setGrade(1);

        Teacher teacher2 = new Teacher();
        teacher2.setFirstName("Suzy");
        teacher2.setLastName("Sheep");
        teacher2.setId(2);
        teacher2.setGrade(1);

        Teacher teacher3 = new Teacher();
        teacher3.setFirstName("Roger");
        teacher3.setLastName("Rabbit");
        teacher3.setId(3);
        teacher3.setGrade(1);

        List<Teacher> teacherList = new ArrayList<>();

        teacherList.add(teacher1);
        teacherList.add(teacher2);
        teacherList.add(teacher3);

        Set<Student> classStudents1 = new HashSet<>();
        Set<Student> classStudents2 = new HashSet<>();
        Set<Student> classStudents3 = new HashSet<>();

        for (int i=0 ; i< 5; i++){
            classStudents1.add(studentList.get(i));

        }

        for (int i=5 ; i< 11; i++){
            classStudents2.add(studentList.get(i));
        }
        for (int i=11 ; i< 15; i++){
            classStudents3.add(studentList.get(i));
        }

        HashMap< Teacher, HashSet> firstGrade = new HashMap<>();
//
        firstGrade.put(teacher1, (HashSet) classStudents1);
        firstGrade.put(teacher2, (HashSet) classStudents2);
        firstGrade.put(teacher3, (HashSet) classStudents3);



        for (Teacher teachers : firstGrade.keySet()) {

            System.out.println( teachers );
        }

        for (HashSet students : firstGrade.values()) {
            System.out.println(students);

        }


    }
}
//Assignment
//
//        Create a Student JavaBean (empty constructor and getters and setters)
//
//        firstName
//        lastName
//        id
//        grade
//        In the main() method of Main create an ArrayList of 15 students which represents all the 1st grade students at an elementary school. Make sure the ids are unique and set the grade to 1.
//
//        Generate equals(), hashCode() and toString() using IntelliJ. Re-write equals() and hashCode() to use the id variable.
//
//        The Teacher class is the same as the Student class (Hint: you could use this fact to save yourself some time) Teacher
//
//        firstName
//        lastName
//        id
//        grade
//        Instantiate 3 Teachers just like you did for Students and add to an ArrayList of teachers.
//
//        Code a HashMap that takes a Teacher for a key and a Set of students for the value (not a List of students). Each Teacher will have 5 different students in a HashSet.
//
//        Print out the map keys in a for loop (use the keySet() method). Print out the map values in a for loop (use the values() method).
//
//        Extras
//
//        Print out the map entries in a for loop (use the entrySet() method).