import java.util.Arrays;

public class SearchInString2 {
    public static void main(String[] args) {
        String name="anshu";
        char target='h';
        System.out.println(Arrays.toString(name.toCharArray()));

    if (search(name,target)) {
        System.out.println("Character is found");
    }else{
        System.out.println("Character is not found");
    }
}
static boolean search(String str, char target){
    if (str.length()==0) {
        return false;
    }
    for (char c :str.toCharArray()) {
        if (c==target) {
            return true;
        }
    }
return false;
}
}
