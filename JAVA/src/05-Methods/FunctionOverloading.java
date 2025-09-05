public class FunctionOverloading {

    public static void main(String[] args) {
      int ans= sum(23,32);
       int ans1=sum(23, 32, 232); 
       System.out.println(ans);
       System.out.println(ans1);
    }
    static int sum(int a ,int b){
        return a+b;
    }
    static int sum(int a ,int b,int c){
        return a+b+c;
    }
}
