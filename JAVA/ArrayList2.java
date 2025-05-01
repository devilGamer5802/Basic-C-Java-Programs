import java.util.*;
public class ArrayList2 {
    public static void main(String []args){
        ArrayList<String> list=new ArrayList<String>(100);
        list.add("Hello");
        list.add("World");
        list.add("I");
        list.add("Love");
        list.add("Kotlin");
        //System.out.println(""+list);
        int N,choice;String E="";
        Scanner input=new Scanner(System.in);
        System.out.println("ARRAYLIST OPERATIONS");
        System.out.println("1.Print List\n2.Add an element\n3.Remove an element\n4.Access an element\n5.Change an element\n6.EXIT\n");
        System.out.print("Enter your choice:");
        choice=input.nextInt();
        switch(choice){
            case 1:
            System.out.println("List is "+list);
            case 2:
            System.out.print("Enter the position where to add:");
            N=input.nextInt();
            System.out.println();
            System.out.print("Enter the element to add:");
            E=input.next();
            if(N>=0){
            list.add(N,E);
            System.out.println("New List:"+list);
            }
            
            case 3:
            System.out.print("Enter the position to delete:");
            N=input.nextInt();
            list.remove(N);
            System.out.println("New List:"+list);
            
            case 4:
            System.out.print("Enter the position to access an element:");
            N=input.nextInt();
            System.out.println("Element at position "+N+" is "+list.get(N));
            
            case 5:
            System.out.print("Enter the position to change an element:");
            N=input.nextInt();
            System.out.print("Enter the element to change:");
            E=input.next();
            list.set(N,E);
            //list.remove(N+1);
            System.out.println(" "+list);

            case 6:
            System.out.println("Thanks!");
            break;
        }
        input.close();
    }
}
