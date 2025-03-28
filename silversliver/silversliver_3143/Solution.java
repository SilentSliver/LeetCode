package silversliver.silversliver_3143;

import com.alibaba.fastjson.JSON;
import java.util.*;
import qubhjava.BaseSolution;


public class Solution extends BaseSolution {
    private int ans;

    public int maxPointsInsideSquare(int[][] points, String str) {
        char[] s = str.toCharArray();
        int left = -1;
        int right = 1_000_000_001;
        while (left + 1 < right) {
            int mid = (left + right) >>> 1;
            if (check(mid, points, s))
                left = mid;
            else
                right = mid;
        }
        return ans;
    }

    boolean check(int size, int[][] points, char[] s) {
        int vis = 0;
        for (int i = 0; i < points.length; i++) {
            int x = points[i][0];
            int y = points[i][1];
            int c = s[i] - 'a';
            if (Math.abs(x) <= size && Math.abs(y) <= size) {
                if ((vis >> c & 1) > 0)
                    return false;
                vis |= 1 << c;
            }
        }
        ans = Integer.bitCount(vis);
        return true;
    }



    @Override
    public Object solve(String[] inputJsonValues) {
        int[][] points = jsonArrayToInt2DArray(inputJsonValues[0]);
		String s = jsonStringToString(inputJsonValues[1]);
        return JSON.toJSON(maxPointsInsideSquare(points, s));
    }
}
