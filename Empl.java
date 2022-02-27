package nse;

import java.util.Set;
import java.util.TreeSet;

    class Empl implements Comparable<Empl>{
        int empid;
        String name;
        String dept;
        public Empl() {
        }
        public Empl(int empid, String name, String dept) {
            super();
            this.empid = empid;
            this.name = name;
            this.dept = dept;
        }
        @Override
        public String toString() {
            return "Employee [empid=" + empid + ", name=" + name + ", dept=" + dept + "]";
        }
        @Override
        public int compareTo(Empl o) {
// TODO Auto-generated method stub
            if( this.dept.compareTo(o.dept) < 0)
                return -1;
            else if (this.dept.compareTo(o.dept) > 0)
                return 1;
            else
                return 0;
        }

    }


