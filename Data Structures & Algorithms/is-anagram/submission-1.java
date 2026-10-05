class Solution {
    public boolean isAnagram(String s, String t) 
    {
        HashMap<Character,Integer> map=new HashMap<>();
        int i=0;
        if(s.length()!=t.length())
        {
            return false;
        }
        for(char ch:s.toCharArray())
        {
            map.put(ch,map.getOrDefault(ch,0)+1);
            if(i<t.length())
            {
            char c=t.charAt(i);
            map.put(c,map.getOrDefault(c,0)-1);
            i++;
            }
        }
        for(int val:map.values())
        {
            if(val!=0)
            {
                return false;
            }
        }
        return true;

    }
}
