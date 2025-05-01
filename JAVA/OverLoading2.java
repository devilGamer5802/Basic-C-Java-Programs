public class OverLoading2 {
    //overloading can be also used to order of parameters.
    public void school(int roll,String name){
        System.out.println("Roll No: "+roll+" Name : "+name);
    }
    public void school(String name,int roll){
        System.out.println("Name : "+name+" Roll No: "+roll);
    }
    public static void main(String []args){
        OverLoading2 obj=new OverLoading2();
        obj.school("Anand", 60005);
        obj.school(60045,"Harsh");
    }
}

