package silversliver.silversliver_1184;

import com.alibaba.fastjson.JSON;
import java.util.*;
import qubhjava.BaseSolution;


public class Solution extends BaseSolution {
    public int distanceBetweenBusStops(int[] distance, int start, int destination) {

    }

    @Override
    public Object solve(String[] inputJsonValues) {
        int[] distance = jsonArrayToIntArray(inputJsonValues[0]);
		int start = Integer.parseInt(inputJsonValues[1]);
		int destination = Integer.parseInt(inputJsonValues[2]);
        return JSON.toJSON(distanceBetweenBusStops(distance, start, destination));
    }
}
