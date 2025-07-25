package problems.problems_1656;

import com.alibaba.fastjson.JSON;
import java.util.*;
import qubhjava.BaseSolution;


class OrderedStream {

	private final String[] stream;
	private int ptr;

    public OrderedStream(int n) {
        stream = new String[n];
        ptr = 0;
    }
    
    public List<String> insert(int idKey, String value) {
        --idKey;
        stream[idKey] = value;
        if (ptr < idKey) {
            return Collections.emptyList();
        }
        List<String> result = new ArrayList<>();
        while (ptr < stream.length && stream[ptr] != null) {
            result.add(stream[ptr]);
            ptr++;
        }
        return result;
    }
}

/**
 * Your OrderedStream object will be instantiated and called as such:
 * OrderedStream obj = new OrderedStream(n);
 * List<String> param_1 = obj.insert(idKey,value);
 */

public class Solution extends BaseSolution {


    @Override
    public Object solve(String[] inputJsonValues) {
        String[] operators = jsonArrayToStringArray(inputJsonValues[0]);
		String[][] opValues = jsonArrayToString2DArray(inputJsonValues[1]);
		int n = Integer.parseInt(opValues[0][0]);
		OrderedStream obj = new OrderedStream(n);
		List<Object> ans = new ArrayList<>(operators.length);
		ans.add(null);
		for (int i = 1; i < operators.length; i++) {
			if (operators[i].compareTo("insert") == 0) {
				int idKey = Integer.parseInt(opValues[i][0]);
				String value = jsonStringToString(opValues[i][1]);
				ans.add(obj.insert(idKey, value));
				continue;
			}
			ans.add(null);
		}
        return JSON.toJSON(ans);
    }
}
