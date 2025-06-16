import java.util.Arrays;

public class Anagram{
    public static void main(String[] args) {
        public static boolean areAnagram(String s, String t){
            if(s.length()!=t.length()) return false;
             char[] a1=s.toCharArray();
             char [] a2=t.toCharArray();
                    Arrays.sort(a1);
                     Arrays.sort(a2);
        return Arrays.equals(a1,a2);
}
    }}
