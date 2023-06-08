import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MergeIntervals {
    public static void main(String[] args) {
        Interval[] intervals = new Interval[2];
        intervals[0] = new Interval(1, 3);
        intervals[1] = new Interval(2, 5);

        List<Interval> merged = mergeIntervals(intervals);
        for (Interval interval : merged) {
            System.out.println(interval.toString());
        }
    }

    public static List<Interval> mergeIntervals(Interval[] intervals) {
        int n = intervals.length;
        List<Interval> ans = new ArrayList<>();

        Arrays.sort(intervals, new Comparator<Interval>() {
            public int compare(Interval a, Interval b) {
                return a.start - b.start;
            }
        });

        ans.add(new Interval(intervals[0].start, intervals[0].finish));

        for (int i = 1; i < n; i++) {
            Interval prev = ans.get(ans.size() - 1);
            if (intervals[i].start <= prev.finish) {
                int currMin = Math.min(intervals[i].start, prev.start);
                int currMax = Math.max(intervals[i].finish, prev.finish);
                ans.set(ans.size() - 1, new Interval(currMin, currMax));
            } else {
                ans.add(new Interval(intervals[i].start, intervals[i].finish));
            }
        }
        return ans;
    }
}
