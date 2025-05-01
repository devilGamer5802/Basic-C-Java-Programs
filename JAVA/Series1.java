import java.util.Scanner;
// 1-2+3-4+.....
public class Series1{
    public static void main(String []args){
        int n,sum=0,lum=0,seriessum=0;
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the n th number :");
        n=input.nextInt();
        for(int i=1;i<=n;i++){
            if(i%2==0){
                lum=lum+((-1)*i);
            }
            else{
                sum=sum+i;
            }
        }
        seriessum=sum+lum;
        System.out.print(seriessum);
        input.close();
    }
}
