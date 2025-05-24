package DSA.Recursion.Part2;

public class RemoveDuplicateLetter {

    // public static String removeDuplicate(String s, StringBuilder newString, int index, boolean arr[]) {
    public static String removeDuplicate(String s, String newString, int index, boolean arr[]) {
        if(index == s.length())
            return newString;
            // return newString.toString()   --- bcz return type is String;
        char ch = s.charAt(index);
        if(arr[ch - 'a'])
            return removeDuplicate(s, newString, index+1, arr);
        else {
            arr[ch-'a'] = true;
            return removeDuplicate(s, newString+ch, index+1, arr);
            // return removeDuplicate(s, newString.append(ch), index+1, arr);
        }
    }
    public static void main(String[] args) {
        String s = "helloworld";
        boolean trackAlpha[] = new boolean[26];
        System.out.println(removeDuplicate(s,"",0,trackAlpha));
        // using String Builder
        // removeDuplicate(s,new StringBuilder(""),0,trackAlpha);
    }
}
