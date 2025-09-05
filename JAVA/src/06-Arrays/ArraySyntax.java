 import java.util.Arrays;
import java.util.Scanner;
public class ArraySyntax {

    public static void main(String[] args) {
        
        //Arrays of primitives
        int [] roll_num= new int[5];
        roll_num[0]=64;
        roll_num[1]=34;
        roll_num[2]=12;
        roll_num[3]=12;
        roll_num[4]=111;
        // for(int i =0;i<=4;i++){
        //     System.out.println(roll_num[i]);
        // }


        //or


       for (int i : roll_num) {
        System.out.println(i);
       }
boolean[] isLogin={true,false,true,true};
System.out.println(Arrays.toString(isLogin));
       //Arrays of objects 
        Scanner sc = new Scanner(System.in);
        String[] name=new String[5];
         for(int i=0;i<name.length;i++){
         name[i]=sc.nextLine();
   }
    for(int i =0;i<name.length;i++){
            System.out.print(name[i]+" ");
        }
        sc.close();
// System.out.println(roll_num);x[I@2a139a55


    }


}

