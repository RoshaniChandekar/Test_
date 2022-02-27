package nse;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorExample {
    public static void main(String[] args) {
// TODO Auto-generated method stub
        List<StudentNew> studs = new ArrayList();
        studs.add(new StudentNew(1001,"praveen","cse"));
        studs.add(new StudentNew(3021,"anil","eee"));
        studs.add(new StudentNew(2031,"kishore","mech"));
        studs.add(new StudentNew(4976,"sunny","biotech"));
        Comparator<StudentNew> c1 = (s1, s2)-> {
            if(s1.htno > s2.htno)
                return 1;
            else if(s1.htno < s2.htno)
                return -1;
            else
                return 0;
        };
        Comparator<StudentNew> c2 = (s1,s2)-> s1.name.compareTo(s2.name);
        Comparator<StudentNew> c3 = (s1,s2)-> s1.branch.compareTo(s2.branch);
//Collections.sort(studs, new HtnoComparator());
        Collections.sort(studs, c1);
        System.out.println("Sorted on htno..");
        for(StudentNew s : studs)
            System.out.println(s);
//Collections.sort(studs, new NameComparator());
        Collections.sort(studs, c2);
        System.out.println("Sorted on name basis..");
        for(StudentNew s : studs)
            System.out.println(s);

//Collections.sort(studs, new BranchComparator());
        Collections.sort(studs, c3);
        System.out.println("Sorted on branch basis..");
        for(StudentNew s : studs)
            System.out.println(s);
    }
}




