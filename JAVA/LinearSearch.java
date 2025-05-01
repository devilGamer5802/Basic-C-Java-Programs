public class LinearSearch {
    public static void main(String args[]){
        int []arr={1,2,3,4,5,7,8};
        int key =7;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                System.out.println(key+" is found at index: "+i);
            }
        }
    }
}
