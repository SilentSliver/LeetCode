package javaProblem.javaProblem_2766;

import com.alibaba.fastjson.JSON;
import java.util.*;
import qubhjava.BaseSolution;


public class Solution extends BaseSolution {
    public List<Integer> relocateMarbles(int[] nums, int[] moveFrom, int[] moveTo) {
        var set = new HashSet<Integer>();
        for(var num:nums)set.add(num);
        for(int i = 0; i < moveFrom.length; i ++){
            set.remove(moveFrom[i]);
            set.add(moveTo[i]);
        }
        var ans = new ArrayList<Integer>(set);
        ans.sort(Comparator.naturalOrder());
        return ans;
    }

    @Override
    public Object solve(String[] inputJsonValues) {
        int[] nums = jsonArrayToIntArray(inputJsonValues[0]);
		int[] moveFrom = jsonArrayToIntArray(inputJsonValues[1]);
		int[] moveTo = jsonArrayToIntArray(inputJsonValues[2]);
        return JSON.toJSON(relocateMarbles(nums, moveFrom, moveTo));
    }
}
