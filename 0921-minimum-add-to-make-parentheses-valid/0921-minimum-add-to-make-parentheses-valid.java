class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> st = new Stack<>();
        for (int i = 0;i<s.length();i++){
            if (st.isEmpty()) {
                st.push(s.charAt(i));
                continue;
            }
            if (st.peek() == '(' && s.charAt(i) == ')'){
                st.pop();
                continue;
            }
            st.push(s.charAt(i));
        }
        int n = 0;
        for(Character x : st) n++;
        return n;
    }
}