class Solution {
    public void reverseString(char[] s) {
        int start = 0;
        int end = s.length - 1;
        for(int i=0; i<s.length/2; i++){
            char temp = s[i];
            s[i]= s[s.length-1-i];
            s[s.length-1-i]=temp;
        }
    }
}