package Collections;

import java.util.*;
class Student implements Comparable<Student> {
	int rollno;
	String name;
	int age;
	Student(int rollno, String name, int age){
	this.rollno=rollno;
	this.name=name;
	this.age=age;
}
public int compareTo(Student st) {
	if (age==st.age) {
		return 0;
	}
	else if(age>st.age) {
		return 1;
	}
	else { 
		return -1;
   }		
}
}
		public class Testsort1 {
	         public static void main(String[] args) {
             ArrayList<Student>al=new ArrayList<Student>();
             al.add(new Student (10,"Vikram",12));
             al.add(new Student (20,"Vijay",22));
             al.add(new Student (30,"Surya",24));
            Collections.sort(al);
            for(Student st:al) {
	        System.out.println(st.rollno+" "+st.name+" "+st.age);
        	}
	 }
}

