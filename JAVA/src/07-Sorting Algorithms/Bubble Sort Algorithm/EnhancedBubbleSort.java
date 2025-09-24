import java.util.Arrays;

public class EnhancedBubbleSort {
     public static void main(String[] args) {
       int [] arr={2,7,4,1,3,6} ;
       bubbleSort(arr);
       System.out.println(Arrays.toString(arr));

    }
static void  bubbleSort(int [] arr){
for (int i = 0; i < arr.length; i++) {
    boolean Swapp=false;
    for (int j = 1; j < arr.length; j++) {
        
        if (arr[j]<arr[j-1]) {
          int temp=arr[j];
          arr[j]=arr[j-1];
          arr[j-1]=temp;   
          Swapp=true;
        }

    }
    if (!Swapp) {
        break;
    }
}
}
}
