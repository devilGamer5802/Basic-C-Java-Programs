public class ThreeDArray {
    public static void main(String args[]){
        int [][][]arr={{{1,2,5},{12,13,6},{32,34,6}},{{45,90,9},{32,34,43},{45,90,7}},{{32,34,6},{45,90,9},{12,67,67}}};
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                for(int k = 0; k < 3; k++){
                    System.out.print(arr[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}