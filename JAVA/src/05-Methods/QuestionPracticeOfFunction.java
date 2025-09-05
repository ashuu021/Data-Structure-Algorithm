import java.util.Scanner;
        
public class QuestionPracticeOfFunction {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        boolean ans=isPrime(num);
        System.out.println(ans);
        sc.close();
        boolean ans1=isArmstrong(13);
        System.out.println(ans1);
        for(int i=100;i<=1000;i++)
        {
            if (isArmstrong(i)) {
                System.out.println(i+" ");
            }
           
        }
    }
   
    static boolean isArmstrong(int n){
        int orignal=n;
        int sum=0;
        while (n>0) {
            int rem=n%10;
            sum =sum+rem*rem*rem;
            n=n/10;
           
 }
        return sum==orignal;
    }
     static boolean isPrime(int num){
      if (num<=1) {
        return false;
      }
      int i=2;
      while (i*i<=num) {
        if (num%i==0) {
            return false;
        }
        i++;
      }
      return i*i>num;
}
}