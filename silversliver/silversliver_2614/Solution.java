package silversliver.silversliver_2614;

import com.alibaba.fastjson.JSON;
import java.util.*;
import qubhjava.BaseSolution;


public class Solution extends BaseSolution {
    public int diagonalPrime(int[][] nums) {
        var m = nums.length;
        var n = nums[0].length;
        var ans = 0;
        for (var i = 0; i < m; i++){
            var tmp = nums[i][i];
            if (tmp > ans && is_prime(tmp)) ans = tmp;
            tmp = nums[i][n - 1 - i];
            if (tmp > ans && is_prime(tmp)) ans = tmp;
        }
        return ans;
    }

    private boolean is_prime(int a) {
        if (a < 2) return false;
        for (var j = 2; j <= Math.sqrt(a); j++)
            if (a % j == 0)
                return false;
        return true;
    }

    @Override
    public Object solve(String[] inputJsonValues) {
        int[][] nums = jsonArrayToInt2DArray(inputJsonValues[0]);
        return JSON.toJSON(diagonalPrime(nums));
    }
}
