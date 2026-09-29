class Solution {
    public int[][] merge(int[][] intervals) {

        // pehle intervals ko first element ke according sort krenge
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        // pehle interval ka start aur end lenge
        int start = intervals[0][0];
        int end = intervals[0][1];

        List<int[]> ans = new ArrayList<>();

        // 1st interval already le liya hai
        // ab next intervals se compare krenge
        for(int i = 1; i < intervals.length; i++) {

            // agar next interval ka start current end ke andar aa raha hai
            // matlab overlap hai
            if(intervals[i][0] <= end) {

                // end ko maximum end tak extend krenge
                end = Math.max(end, intervals[i][1]);

            } else {

                // overlap nahi hai
                // current interval ko answer me add krenge
                ans.add(new int[]{start, end});

                // ab next interval ko new start-end bana denge
                start = intervals[i][0];
                end = intervals[i][1];
            }
        }

        // last interval bhi answer me add krenge
        ans.add(new int[]{start, end});

        return ans.toArray(new int[ans.size()][]);
    }
}