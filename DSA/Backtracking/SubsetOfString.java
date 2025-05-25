package DSA.Backtracking;

public class SubsetOfString {
    public static void findSubset(String s, String newStr, int index) {
        if(s.length() == index) {
            if(newStr == "") {
                System.out.println("NULL");
                return;
            }
            System.out.println(newStr);
            return;
        }
        char c = s.charAt(index);
        // yes
        findSubset(s, newStr+c, index+1);
        // no
        findSubset(s, newStr, index+1);
    }
    public static void main(String[] args) {
        String s = "abc";
        findSubset(s,"",0);
    }
}
