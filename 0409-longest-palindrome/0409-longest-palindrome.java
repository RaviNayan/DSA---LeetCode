class Solution {
    public int longestPalindrome(String s) {
        int eve = 0, odd = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }
        for (Character c : map.keySet()) {
            int num = map.get(c);
            if ((num % 2 == 0) || (num != 1 && num % 2 == 1)) {
                eve += (num / 2) * 2;
            }
            if ((num == 1) || (num % 2 == 1)) {
                odd++;
            }
        }

        return odd == 0 ? eve : eve + 1;
    }
}