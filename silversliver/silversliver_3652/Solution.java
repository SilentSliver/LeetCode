package silversliver.silversliver_3652;

import com.alibaba.fastjson.JSON;
import java.util.*;
import qubhjava.BaseSolution;


public class Solution extends BaseSolution {
    public long maxProfit(int[] prices, int[] strategy, int k) {
        
    }

    @Override
    public Object solve(String[] inputJsonValues) {
        int[] prices = jsonArrayToIntArray(inputJsonValues[0]);
		int[] strategy = jsonArrayToIntArray(inputJsonValues[1]);
		int k = Integer.parseInt(inputJsonValues[2]);
        return JSON.toJSON(maxProfit(prices, strategy, k));
    }
}
