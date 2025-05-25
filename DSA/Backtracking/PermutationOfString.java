package DSA.Backtracking;

public class PermutationOfString {

    public static void findPermutation(String s, String newStr) {
        if(s.length() == 0) {
            System.out.println(newStr);
            return;
        }
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            String str = s.substring(0,i) + s.substring(i+1);
            findPermutation(str, newStr+c);
        }
    }
    public static void main(String[] args) {
        String s = "abc";
        findPermutation(s, "");
    }
}
