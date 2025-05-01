public class CLA_Average {
    public static void main(String []args){
        int sum=0;
        for(int i=0;i<args.length;i++){
            sum+=Integer.parseInt(args[i]);
        }
        int avg=sum/args.length;
        System.out.println("Average is "+avg);
    }
}
// java CLA_Average 1 2 3 4 5 6 7 8 9