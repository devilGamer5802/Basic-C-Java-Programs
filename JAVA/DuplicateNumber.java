public class DuplicateNumber {
    public static void main(String []args){
        int i,j;
        int arr[]=new int[]{1,1,2,2,3,5,5,7,0};
        System.out.print("Duplicate elements are ");

        for(i=0;i<arr.length;i++)
        for(j=i+1;j<arr.length;j++)
        if(arr[j]==arr[i]){
            //System.out.print(" "+arr[i]);
            if((arr[i]==arr[i+j])&&((i+j)<arr.length)){
                System.out.println(arr[i+j]);
            }
        }
    }
}

// this program can only be use for 2 same elements.