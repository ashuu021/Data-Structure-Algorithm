public class MinElementIn2D {
    public static void main(String[] args) {
          int [][] arr={
            {1,2,32},
            {99,23,3,12},
            {9,6,44,8,5}
        };
        System.out.println(min(arr));
    }
    static int min(int [][] arr){
        int MinElement=Integer.MAX_VALUE;
for (int[] i : arr) {
    for (int j : i) {
        if (j<MinElement) {
            MinElement=j;
        }
    }
}
        return MinElement;
    }
}
