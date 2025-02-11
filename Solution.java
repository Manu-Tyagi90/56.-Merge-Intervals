import java.util.*;
public class Solution {
public static int[][] merge(int[][] intervals){
if(intervals.length == 0 || intervals.length == 1 ) return intervals;
int n = intervals.length;
List<int[]> res = new ArrayList<>();
int[] newInterval = intervals[0];
res.add(newInterval);
for(int i=1;i<intervals.length;i++){
if(intervals[i][0]<= newInterval[1]){
newInterval[1] = Math.max(intervals[i][1],newInterval[1]);
}
else{
newInterval = intervals[i];
res.add(newInterval);
}
}
return res.toArray(new int[res.size()][] );
}
}
