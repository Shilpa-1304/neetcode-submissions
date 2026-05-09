class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        // char[] arr=s.toCharArray();
        int i=0;int j=0;
        String str="";
        int len=0;
        int maxLen=0;
        while(i<=j && j<n){
            if(!str.contains(String.valueOf(s.charAt(j)))){
                str+=(s.charAt(j));
                j++;
            }
            else{
                while(str.contains(String.valueOf(s.charAt(j)))){
                    str=str.substring(1);
                    i++;
                }
                str+=(s.charAt(j));
                j++;
            }
            maxLen=Math.max(str.length(),maxLen);
        }
        return maxLen;
    }
}
