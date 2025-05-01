import java.util.*;
public class ArrayList1 {
    public static void main(String []args){
        ArrayList<Integer> list=new ArrayList<>(10);
        list.add(1);
        list.add(2);
        list.add(2,3);
        System.out.println("Array: "+list);

    }
}
