class Solution {
    public int trap(int[] height) {
        int n=height.length;
        int maxWater=0;
        // Task 1 — declare leftMax[] and rightMax[] of size n
        int[] leftMax=new int[n];
        int[] rightMax=new int[n];
        // Task 2 — fill leftMax left to right
        leftMax[0]=height[0];
        for(int i=1;i<n;i++){   
            leftMax[i]=Math.max(leftMax[i-1],height[i]);
        }
        // Task 3 — fill rightMax right to left
        rightMax[n-1]=height[n-1];
        for(int i=n-2;i>=0;i--){   
            rightMax[i]=Math.max(rightMax[i+1],height[i]);
        }
        // Task 4 — loop each index, add min(leftMax[i], rightMax[i]) - height[i] to answer
        for(int i=0;i<n;i++){
            maxWater+=(Math.min(leftMax[i],rightMax[i])-height[i]);
        }
        // Task 5 — return answer
        return maxWater;
    }
}
