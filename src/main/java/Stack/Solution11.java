package Stack;

import java.util.ArrayDeque;
import java.util.Deque;
// Time complexity O(N)
// Space complexity O(n)
public class Solution11 {
    public boolean isValid(String s) {
        Deque<Integer> stack = new ArrayDeque<>();
        for (char c: s.toCharArray()){

            if (!stack.isEmpty()){
                if (stack.peek() < c && c - stack.peek() < 3){
                    stack.pop();
                    continue;
                }
            }
            stack.push((int) c);
        }
        return stack.isEmpty();
    }
}
