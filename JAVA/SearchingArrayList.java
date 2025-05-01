import java.util.*;

public class SearchingArrayList {
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        System.out.print("Provide Number of Elements:");
        int N=input.nextInt();
        ArrayList<Integer> list=new ArrayList<>(N);
        for(int i=1;i<=N;i++){
            System.out.print("Enter element "+i+" : ");
            int num=input.nextInt();
            list.add(num);
        }
        System.out.println();
        System.out.print("Enter the elemnet to be found:");
        int key=input.nextInt();
        for(int i=0;i<N;i++){
                if(list.get(i)==key){
                    System.out.println(key+" is found at index: "+i);
                }
            }
        input.close();
    }
}
