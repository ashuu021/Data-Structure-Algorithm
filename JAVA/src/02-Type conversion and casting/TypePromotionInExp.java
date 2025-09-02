public class TypePromotionInExp {
   public static void main(String[] args) {
        byte b1 = 10;
        byte b2 = 20;
        // byte + byte = int
        int result = b1 + b2;  
        System.out.println(result);  // 30 
}
}