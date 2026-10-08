class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int n:nums)
        {
            map.put(n,map.getOrDefault(n,0)+1);
        }
        List<Integer>[] bucket=new ArrayList[nums.length+1];
        for(Map.Entry<Integer,Integer> entry: map.entrySet())
        {
            int frequency=entry.getValue();
            int number=entry.getKey();
            if(bucket[frequency]==null)
            {
                bucket[frequency]=new ArrayList<>();
            }
            bucket[frequency].add(number);
        }
        int[] result=new int[k];
        int index=0;
        for(int freq=nums.length;freq>=1;freq--)
        {
            if (bucket[freq] != null) {

                for (int number : bucket[freq]) {

                    result[index] = number;
                    index++;

                    if (index == k) {
                        return result;}
                }
            }
        }
        return result;
    }
}
