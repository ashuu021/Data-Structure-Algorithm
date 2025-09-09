public class isElementFind {
    public static void main(String[] args) {
    int[] nums={1,23,4,5,6,32,78,4,32};
    int target=2;
   boolean  ans=linearSearch(nums,target);
   if (ans==true) {
    System.out.println("Element found");
   }
   else{
System.out.println("Element not found");
   }
 
}
static boolean linearSearch(int[] arr,int target){
if (arr.length==0) {
    return false;
}
for (int i : arr) {
    if (i==target) {
        return true;
        
    }
}

return false;
}
}
