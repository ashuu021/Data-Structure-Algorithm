import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        fun(2,112,233,1,3,1341,0);
    }
    static void fun(int ...arr){
        System.out.println(Arrays.toString(arr));
    }
}
