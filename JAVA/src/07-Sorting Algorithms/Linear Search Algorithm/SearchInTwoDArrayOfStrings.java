import java.util.Arrays;

public class SearchInTwoDArrayOfStrings {
    public static void main(String[] args) {
        String [][] name={
            {"Anshu","Aman","Ashuu"},
            {"A"},
            {"Ajy","Ankesh","Ankit"}
        };
        String target ="A";
   System.out.println(Arrays.toString(nameSearch(name, target)));
    }
    static int[] nameSearch(String[][]name,String target){
        for (int i = 0; i < name.length; i++) {
            for (int j = 0; j < name[i].length; j++) {
                if (name[i][j]==target) //(name[i][j].equals(target))
                {
                    return new int []{i,j};
                }
            }
        }
        return new int []{-1,-1};//target not found
    }
}
