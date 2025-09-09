public class SeachInStrArr{
public static void main(String[] args) {
     String [] name={"Anshu","Aman","Ajy","Ankesh","Ankit","Abhiraj"};
 String target="Ankesh";
boolean ans=isNameFound(name,target);
System.out.println(ans);


}
static boolean isNameFound(String arr[],String target){
 if (arr.length==0) {
    return false;
 }
 for (int i = 0; i < arr.length; i++) {
    if (target==arr[i]) {
        return true;
    }
 }
    return false;
}
}

