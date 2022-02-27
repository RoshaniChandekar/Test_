package nse;

    import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

    class Student extends Object{
        int rollno;
        String name;
        String email;
        public Student() {
        }
        public Student(int rollno, String name, String email) {
            super();
            this.rollno = rollno;
            this.name = name;
            this.email= email;
        }
        @Override
        public String toString() {
            return "Student [rollno=" + rollno+ ", name=" + name + ", email=" + email + "]";
        }

    }


