package practice.solutions.easy.leetcode;

import java.util.ArrayList;
import java.util.List;

public class MergeIntervals {
	
	public static void main(String[] args) {
		List<Interval> intervals = new ArrayList<>();
		Interval interv = new Interval(1, 3);
		intervals.add(interv);
		interv = new Interval(2, 6);
		intervals.add(interv);
		interv = new Interval(8, 10);
		intervals.add(interv);
		interv = new Interval(15, 18);
		intervals.add(interv);
		MergeIntervals mi = new MergeIntervals();
		List<Interval> mergedIntervals = mi.merge(intervals);
		
		for(Interval interval: mergedIntervals){
			System.out.println("["+interval.start+","+interval.end+"]");
		}
		
	}
	
	
	public List<Interval> merge(List<Interval> intervals) {
	        List<Interval> mergedIntervals = new ArrayList<>();
	        
	        
	        return mergedIntervals;
	    }
}


class Interval {
	int start;
	int end;
	Interval() {
		start = 0; end = 0;
	}
	
	Interval(int s, int e) { 
		start = s; end = e; 
	}
}
 
