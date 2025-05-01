public class HighestOccurence {
    public static void main(String []args){
        int max=0,freq=0,i,j;
        int arr[]=new int[]{2,2,2,2,2,7,7,1,1};
        for(i=0;i<arr.length;i++){
            int count=0;
            for(j=0;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            if (count>max){
                max=count;
                freq=arr[i];
            }
        }
        System.out.print("highest occurence of element:"+freq);
    }
}

