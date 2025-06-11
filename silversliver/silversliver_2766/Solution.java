package silversliver.silversliver_2766;

import com.alibaba.fastjson.JSON;
import java.util.*;
import java.util.stream.Collectors;

import qubhjava.BaseSolution;


public class Solution extends BaseSolution {
    public List<Integer> relocateMarbles(int[] nums, int[] moveFrom, int[] moveTo) {
        var nums_set = Arrays.stream(nums).boxed().collect(Collectors.toCollection(HashSet::new));
        var n = moveFrom.length;
        for (int i = 0; i < n; i++) {
            nums_set.remove(moveFrom[i]);
            nums_set.add(moveTo[i]);
        }
        var ans = new ArrayList<>(nums_set);
        ans.sort((a, b) -> a - b);
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
