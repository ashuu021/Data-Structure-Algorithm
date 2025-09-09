public class SearchInRange  {
    public static void main(String[] args) {
    int[] nums={1,23,4,5,6,32,78,4,32};
    int target=2;

   if (linearSearch(nums,target,1,5)) {
    System.out.println("Element found");
   }
   else{
System.out.println("Element not found");
   }
 
}
static boolean linearSearch(int[] arr,int target, int start,int end){
if (arr.length==0) {
    return false;
}
for(int i=start;i<=end;i++){
        if (i==target) {
        return true;
    }
    
}

return false;
}
}

    

