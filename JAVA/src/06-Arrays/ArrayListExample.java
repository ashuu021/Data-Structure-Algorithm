
import java.util.Scanner;
import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        
        
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            list.add(sc.nextInt());
        }
        sc.close();
        System.out.println(list);
    }
}
