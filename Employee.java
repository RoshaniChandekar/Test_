package nse;




import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

    class Employee extends Object{
        int empid;
        String name;
        String dept;
        public Employee() {
        }
        public Employee(int empid, String name, String dept) {
            super();
            this.empid = empid;
            this.name = name;
            this.dept = dept;
        }
        @Override
        public String toString() {
            return "Employee [empid=" + empid + ", name=" + name + ", dept=" + dept + "]";
        }

    }
