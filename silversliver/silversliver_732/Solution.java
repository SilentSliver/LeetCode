package silversliver.silversliver_732;

import com.alibaba.fastjson.JSON;
import java.util.*;
import qubhjava.BaseSolution;


class MyCalendarThree {

    public MyCalendarThree() {
        
    }
    
    public int book(int startTime, int endTime) {
        
    }
}

/**
 * Your MyCalendarThree object will be instantiated and called as such:
 * MyCalendarThree obj = new MyCalendarThree();
 * int param_1 = obj.book(startTime,endTime);
 */

public class Solution extends BaseSolution {


    @Override
    public Object solve(String[] inputJsonValues) {
        String[] operators = jsonArrayToStringArray(inputJsonValues[0]);
		String[][] opValues = jsonArrayToString2DArray(inputJsonValues[1]);
		
		MyCalendarThree obj = new MyCalendarThree();
		List<Object> ans = new ArrayList<>(operators.length);
		ans.add(null);
		for (int i = 1; i < operators.length; i++) {
			if (operators[i].compareTo("book") == 0) {
				int startTime = Integer.parseInt(opValues[i][0]);
				int endTime = Integer.parseInt(opValues[i][1]);
				ans.add(obj.book(startTime, endTime));
				continue;
			}
			ans.add(null);
		}
        return JSON.toJSON(ans);
    }
}
