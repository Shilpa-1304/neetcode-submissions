class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n=nums.length;
        int[] ans=new int[n-k+1];
        int index=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<k;i++){
            max=Math.max(max,nums[i]);
        }
        ans[index++]=max;
        for(int i=1;i<n-k+1;i++){
            max=Integer.MIN_VALUE;
            for(int j=i;j<i+k;j++){
                max=Math.max(max,nums[j]);
            }
            ans[index++]=max;
        }

        return ans;
    }
}
