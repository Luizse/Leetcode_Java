class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        char c1[] = strs[0].toCharArray(); 
        char c2[] = strs[strs.length-1].toCharArray();

        StringBuilder s= new StringBuilder();

        for(int i=0;i<c1.length;i++){
            if(c1[i]!=c2[i]){
                break;
            }else{
                s.append(c1[i]);
            } 
        }return s.toString();
    }
}