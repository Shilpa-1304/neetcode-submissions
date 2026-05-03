class Solution {
    public String longestCommonPrefix(String[] strs) {
        int n=strs.length;
        // Task 1 — Take first string as prefix
            String prefix=strs[0];
        // Task 2 — Loop from index 1 to end of array
        // Task 3 — Inside loop, use while to shrink prefix:
        for(int i=1;i<n;i++){
            while(!strs[i].startsWith(prefix)){
                prefix=prefix.substring(0, prefix.length()-1);
            }
        }
        // Task 4 — After loop return prefix
        return prefix;
    }
}