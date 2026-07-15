class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums){
            if (map.containsKey(num)){
                map.put(num, map.getOrDefault(num, 0)+1);
            }
            else{
                map.put(num, 1);
            }
        }
        int Max = 0;
        for (int num : map.keySet()){
            Max = Math.max(Max, map.get(num));
        }
        int Key=0;
        for (int num : map.keySet()){
            if (map.get(num) == Max){
                Key = num; break;
            }
        }
        return Key;
    }
}