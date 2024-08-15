package silversliver.silversliver_3099;

import com.alibaba.fastjson.JSON;
import java.util.*;
import qubhjava.BaseSolution;


public class Solution extends BaseSolution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        var sum = 0;
        for (var i = x; i > 0; i /= 10)
            sum += i % 10;
        return (x % sum == 0) ? sum : -1;
    }

    @Override
    public Object solve(String[] inputJsonValues) {
        int x = Integer.parseInt(inputJsonValues[0]);
        return JSON.toJSON(sumOfTheDigitsOfHarshadNumber(x));
    }
}
