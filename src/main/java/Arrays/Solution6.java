package Arrays;
// Time complexity O(N) we can increase speed using chars[]
// Space complexity O(N)
public class Solution6 {
    public String removeStars(String s) {
        String ns = "";
        int count = 0;
        for (int i = s.length() -1 ; i >= 0; i--){
            if (s.charAt(i) == '*'){
                count++;
                continue;
            }
            if (count > 0){
                count--;
                continue;
            }
            ns+=s.charAt(i);
        }
        StringBuilder sb=new StringBuilder(ns);

        return sb.reverse().toString();
    }
}
