package nse;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StudentNew {
        int htno;
        String name;
        String branch;
        public StudentNew(int htno, String name, String branch) {
            super();
            this.htno = htno;
            this.name = name;
            this.branch = branch;
        }
        @Override
        public String toString() {
            return "Student [htno=" + htno + ", name=" + name + ", branch=" + branch + "]";
        }

    }

    class HtnoComparator implements Comparator<StudentNew>{
        @Override
        public int compare(StudentNew o1, StudentNew o2) {
// TODO Auto-generated method stub
            if(o1.htno> o2.htno)
                return 1;
            else if(o1.htno < o2.htno)
                return -1;
            else
                return 0;
        }
    }
    class NameComparator implements Comparator<StudentNew>{
        @Override
        public int compare(StudentNew o1, StudentNew o2) {
// TODO Auto-generated method stub
            return o1.name.compareTo(o2.name);
        }
    }
    class BranchComparator implements Comparator<StudentNew>{
        @Override
        public int compare(StudentNew o1, StudentNew o2) {
// TODO Auto-generated method stub
            return o1.branch.compareTo(o2.branch);
        }
    }
