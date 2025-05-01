import java.util.Arrays;

public class MAT {
    public static int getMinDistance(int[] center, int[] destination) {
        Arrays.sort(center);
        Arrays.sort(destination);
        
        int ans = 0;
        for (int i = 0; i < center.length; i++) {
            ans += Math.abs(destination[i] - center[i]);
        }
        
        return ans;
    }

    public static void main(String[] args) {
        int[] center = { /* add values here */ 1,2,2};
        int[] destination = { /* add values here */5,2,4 };
        System.out.println(getMinDistance(center, destination));
    }
}
