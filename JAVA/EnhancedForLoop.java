public class EnhancedForLoop {
    public static void main(String []args){
        /*for (int k=0;k<=3;k++){
            if(a[k]>5&&a[k]<13{
                System.out.println(a[k]);
            })
        } */
        // using enhanced for loop instead of upper program
        int a[]={10,12,15};
            for(int k :a){
                if(k>5&&k<13){
                    System.out.println(k);
                }
            }
        }
    }