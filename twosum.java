class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int Element = 0;
        for(int index = 0 ; index < nums.length ; index++){
            if(map.containsKey(target - nums[index])){
                return new int[]{index,map.get(target-nums[index])};
            }
            map.put( nums[index], index);
        }
        return null;
    }
}
