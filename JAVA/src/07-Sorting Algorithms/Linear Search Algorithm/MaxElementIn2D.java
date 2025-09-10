public class MaxElementIn2D {
    public static void main(String[] args) {
          int [][] arr={
            {1,2,32},
            {0,23,3,12},
            {9,6,44,8,5}
        };
        System.out.println(max(arr));
    }
    static int max(int[][] arr){
        int MaxElement=Integer.MIN_VALUE;
        for (int [] i : arr) {
            for (int j : i) {
               if (j>MaxElement) {
                MaxElement=j;
               } 
            }
        }
        return MaxElement;
    }
}
