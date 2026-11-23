class Solution {
    public boolean checkString(String s) {
        boolean foundB=false;
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(c=='b')
            {
               foundB=true;
            }
            else if(c == 'a' && foundB == true)
            {
                return false;
            }

        }
        return true;
        
    }
}