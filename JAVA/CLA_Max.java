public class CLA_Max {
    public static void main(String []args){
        int max=0,z,i;
        for(i=0;i<args.length;i++){
            z=Integer.parseInt(args[i]);
            if(max<z){
                max=z;
            }
        }
        System.out.println("MAXIMUM:"+max);
    }
}

// java CLA_Max 1 2 344 567
