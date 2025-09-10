public class RichestCustomerWealth {
    public static void main(String[] args) {
        int[][] accounts = {{1,5},{7,3},{3,5}};
System.out.println(maximumWealth(accounts));
    }
    static int maximumWealth(int[][] accounts){
        int ans=0;
for (int[] customer : accounts) {
    int sum=0;//the wealth cant be negative
for (int money : customer) {
    sum+=money;
}
if (sum>ans) {
    ans=sum;
}
}
    return ans;
 }
}
