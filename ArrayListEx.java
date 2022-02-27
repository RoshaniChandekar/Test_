package nse;


    import java.util.ArrayList;

    public class ArrayListEx {

        public static void main(String[] args) {
            // TODO Auto-generated method stub
            ArrayList<String>state=new ArrayList<>();
            //add method
            state.add("maharashtra");
            state.add("bengaluru");
            state.add("madhya pradesh");

            System.out.println("ArrayList:"+state);
            //get the elements from the arrlist
            String str=state.get(1);
            System.out.println("Elements at index 1:"+str);
            //change element of array list
            state.set(2, "javascript");
            System.out.println("Modified ArryList is:"+state);
            //remove element from index 2
            String str1=state.remove(2);
            System.out.println("updated ArrayList:"+state);
            System.out.println("Remve Elemnt:"+str);
            //iterate using for-each loop
            System.out.println("Accesing individual elements:");
            for(String str2:state)
            {
                System.out.println(str2);
                System.out.println(",");
            }
        }

    }

