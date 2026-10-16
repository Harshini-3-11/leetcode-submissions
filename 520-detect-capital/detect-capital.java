class Solution {
    public boolean detectCapitalUse(String word) {
        int lower=0;
        int upper=0;
        for(int i=0;i<word.length();i++)
        {
            if(word.charAt(i)>='A' && word.charAt(i)<='Z')
            {
                upper++;
            }
            else
            {
                lower++;
            }
        }
          if (upper == word.length() || lower == word.length()
                || (upper == 1 && word.charAt(0) >= 'A'
                && word.charAt(0) <= 'Z')) {
                    return true;
                }
              
             return false;
                

        
    }
}