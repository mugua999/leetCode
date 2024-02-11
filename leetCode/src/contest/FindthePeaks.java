package contest;

import java.util.ArrayList;
import java.util.List;

public class FindthePeaks {
    public List<Integer> findPeaks(int[] mountain) {
    	List<Integer> ans = new ArrayList<>();
    	
        for (int i = 1; i < mountain.length - 1; i++) {
        	if(mountain[i] > mountain[i-1] && mountain[i] > mountain[i+1]) {
        		ans.add(i);
        	}
		}
        
        return ans;
    }
}