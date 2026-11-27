class Solution {
    public String gcdOfStrings(String str1, String str2) {
        int min=Math.min(str1.length(),str2.length());
        
        for( int i=min;i>=1;i--)
        {
            String s=str1.substring(0,i);
            if(str1.replace(s,"").isEmpty() && str2.replace(s,"").isEmpty())
            {
                return s;
            }
        }
        return "";

        
    }
}