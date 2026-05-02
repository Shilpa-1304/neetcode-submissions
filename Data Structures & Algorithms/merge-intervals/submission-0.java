class Solution {
    public int[][] merge(int[][] intervals) {
        int n=intervals.length;
        //  1. Sort 
        Arrays.sort(intervals,(a,b)->{
            return a[0]-b[0];
        });
        //  2. Declare result arraylist
        ArrayList<int[]> list=new ArrayList<>();
        //  3. Point first element as current inerval;
        int[] current=intervals[0];
        //  4. Loop over intervals and check if it is merged or not.
        for(int i=1;i<n;i++){
            if(intervals[i][0] <= current[1]){
                //Merged
                current=new int[]{current[0], (current[1] > intervals[i][1]) ? current[1] : intervals[i][1]};
            }
            else{
                list.add(current);
                current=intervals[i];
            }
        }
        // 5. Pass the last current in list
        list.add(current);
        //6. return the arr[][]
        return list.toArray(new int[list.size()][]);
    }
}
