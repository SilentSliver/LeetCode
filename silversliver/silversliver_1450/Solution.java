package silversliver.silversliver_1450;

import com.alibaba.fastjson.JSON;
import java.util.*;
import qubhjava.BaseSolution;


public class Solution extends BaseSolution {
    public int busyStudent(int[] startTime, int[] endTime, int queryTime) {

    }

    @Override
    public Object solve(String[] inputJsonValues) {
        int[] startTime = jsonArrayToIntArray(inputJsonValues[0]);
		int[] endTime = jsonArrayToIntArray(inputJsonValues[1]);
		int queryTime = Integer.parseInt(inputJsonValues[2]);
        return JSON.toJSON(busyStudent(startTime, endTime, queryTime));
    }
}
