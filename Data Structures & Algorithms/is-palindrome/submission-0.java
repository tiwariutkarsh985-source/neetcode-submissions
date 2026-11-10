class Solution {
    public boolean isPalindrome(String s) {
        String str=s.trim().toLowerCase();
        str=str.replaceAll("[^a-zA-Z0-9]","");
        int j=str.length()-1;
        for(int i=0;i<str.length()/2;i++)
        {
            if(str.charAt(i)!=str.charAt(j))
            {
                return false;
            }
            j--;
        }
        return true;
        
    }
}
