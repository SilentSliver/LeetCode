package silversliver.silversliver_2894;

import com.alibaba.fastjson.JSON;
import java.util.*;
import java.util.stream.IntStream;

import qubhjava.BaseSolution;


public class Solution extends BaseSolution {
    public int differenceOfSums(int n, int m) {
        return n * (n + 1) / 2 - n / m * (n / m + 1) * m;
    }

    @Override
    public Object solve(String[] inputJsonValues) {
        int n = Integer.parseInt(inputJsonValues[0]);
		int m = Integer.parseInt(inputJsonValues[1]);
        return JSON.toJSON(differenceOfSums(n, m));
    }
}
