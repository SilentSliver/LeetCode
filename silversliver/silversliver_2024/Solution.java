package silversliver.silversliver_2024;

import com.alibaba.fastjson.JSON;
import java.util.*;
import qubhjava.BaseSolution;


public class Solution extends BaseSolution {
    public int maxConsecutiveAnswers(String answerKey, int k) {

    }

    @Override
    public Object solve(String[] inputJsonValues) {
        String answerKey = jsonStringToString(inputJsonValues[0]);
		int k = Integer.parseInt(inputJsonValues[1]);
        return JSON.toJSON(maxConsecutiveAnswers(answerKey, k));
    }
}
