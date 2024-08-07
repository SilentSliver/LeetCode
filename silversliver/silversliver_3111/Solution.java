package silversliver.silversliver_3111;

import com.alibaba.fastjson.JSON;
import java.util.*;
import qubhjava.BaseSolution;


public class Solution extends BaseSolution {
    public int minRectanglesToCoverPoints(int[][] points, int w) {
        Arrays.sort(points, (a, b) -> a[0] - b[0]);
        int ans = 0, x1 = -1;
        for (int[] p : points) {
            var x = p[0];
            if (x > x1) {
                ++ans;
                x1 = x + w;
            }
        }
        return ans;
    }

    @Override
    public Object solve(String[] inputJsonValues) {
        int[][] points = jsonArrayToInt2DArray(inputJsonValues[0]);
		int w = Integer.parseInt(inputJsonValues[1]);
        return JSON.toJSON(minRectanglesToCoverPoints(points, w));
    }
}
