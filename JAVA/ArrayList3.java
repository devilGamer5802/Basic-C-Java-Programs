import java.util.*;
public class ArrayList3 {
    public static void main(String []args){
        ArrayList<Integer> list=new ArrayList<>(10);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(55);  
        list.add(34);  
        list.add(98);  
        list.add(67);  
        list.add(39);  
        list.add(76);  
        list.add(81); 
        System.out.println("Array: "+list);
        Collections.sort(list);
        System.out.println("After sorting");
        System.out.println("Array: "+list);
    }
}
