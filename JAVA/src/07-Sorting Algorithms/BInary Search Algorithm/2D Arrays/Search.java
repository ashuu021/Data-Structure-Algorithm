import java.util.Arrays;

public class Search {
    public static void main(String[] args) {
        int[][] arr={
            {1,3,5,7},
            {10,11,16,20},
            {23,30,34,60}
        };
        int target=16;
        int[]  ans=searchMatrix(arr, target);
        System.out.println(Arrays.toString(ans));
    }
    static int [] searchMatrix(int[][] mat, int target) {
         int row=0;
        int col=mat[0].length-1;
        while(row<mat.length && col>=0){
            if(mat[row][col]==target){
            return new int[] {row, col};
            }
             if(mat[row][col]<target){
               row++; 
            }
            else{
                col--;
            }
        }
return new int[] {-1,-1};
    }
}
