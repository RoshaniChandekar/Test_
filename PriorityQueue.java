package nse;

public class PriorityQueue {
        public static void main(String[] args) {
// TODO Auto-generated method stub
            java.util.PriorityQueue pq = new java.util.PriorityQueue();
            pq.add(10);
            pq.add(30);
            pq.add(5);
            pq.add(45);
            System.out.println(pq);
            pq.add(2);
            pq.add(30);
            System.out.println(pq);
            pq.remove();
            System.out.println(pq);
            pq.remove();
            System.out.println(pq);
            pq.remove();
            System.out.println(pq);
            java.util.PriorityQueue<Studt> studs = new java.util.PriorityQueue();
            studs.add(new Studt(1001,"praveen","cse"));
            studs.add(new Studt(3021,"anil","eee"));
            studs.add(new Studt(2031,"kishore","mech"));
            studs.add(new Studt(4976,"sunny","biotech"));
            for(Studt s : studs)
                System.out.println(s);
            studs.remove();
            System.out.println("After removal ");
            for(Studt s : studs)
                System.out.println(s);
        }
    }



