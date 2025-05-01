//concept of overloading where same object name may is used in different data types.
public class overloading1 {
    public int may(int a,int b){
        return(a+b);
    }
    public int may(int a,int b,int c){
        return(a+b+c);
    }
    public double may(double a, double b){
        return(a+b);
    }
    public static void main(String []args){
        overloading1 obj=new overloading1();
        System.out.println(obj.may(12,13));
        System.out.println(obj.may(13,12,12));
        System.out.println(obj.may(12.7,13.8));
    }
}