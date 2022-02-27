package nse;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class StudentListExample {

        public static void main(String[] args) {
// TODO Auto-generated method stub
            List<Student> ar = new LinkedList();
            Student stu1 = new Student(234,"roshani","roshani@20");
            Student stu2 = new Student(9021,"Sunil","Sunil@1");
            Student stu3 = new Student(5329,"Babji","Balaji@2");
            Student stu4 = new Student(2245,"John","John3");
            ar.add(stu1);
            ar.add(stu2);
            ar.add(stu3);
            ar.add(stu4);
            System.out.println(ar);
            Iterator itr = ar.iterator();
            while(itr.hasNext()) {
                Student stu = (Student) itr.next();
                System.out.println(stu.rollno+" "+stu.name+" "+stu.email);
            }
// by using the enchanced for loop
            System.out.println("By using for loop");
            for(Student e: ar) {
                System.out.println(e.rollno + " " + e.name + " " + e.email);
            }
            ar.forEach(System.out::println);
        }
}


