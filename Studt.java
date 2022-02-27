package nse;

    import java.util.PriorityQueue;
    class Studt implements Comparable<Studt>{
        int htno;
        String name;
        String branch;
        public Studt(int htno, String name, String branch) {
            super();
            this.htno = htno;
            this.name = name;
            this.branch = branch;
        }
        @Override
        public String toString() {
            return "Studt [htno=" + htno + ", name=" + name + ", branch=" + branch + "]";
        }
        @Override
        public int compareTo(Studt o) {
// TODO Auto-generated method stub
            return this.name.compareTo(o.name);
        }

    }

