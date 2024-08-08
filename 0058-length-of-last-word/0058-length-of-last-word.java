class Solution {
    public int lengthOfLastWord(String s) {
        int ans=0;
        int n=s.length()-1;

        //skip spaces
        while(n>=0 && s.charAt(n)==' '){
            n--;
        }
        //count character of the last word
        while(n>=0 && s.charAt(n)!=' '){
            ans++;
            n--;
           }return ans; 
       }  
    }
    
