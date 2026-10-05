class Solution {
    public boolean isAnagram(String s, String t) 
    {
        HashMap<Character,Integer> map=new HashMap<>();
        HashMap<Character,Integer> map1=new HashMap<>();
        int i=0;
        while(i<s.length()||i<t.length())
        {
            if(i<s.length())
            {
                char c1=s.charAt(i);
                map.put(c1,map.getOrDefault(c1,0)+1);
            }
            if(i<t.length())
            {
                char c1=t.charAt(i);
                map1.put(c1,map1.getOrDefault(c1,0)+1);
            }
            i++;
        }
        if(!map.equals(map1))
        {
            return false;
        }
        return true;

    }
}