package silversliver.silversliver_2069;

import com.alibaba.fastjson.JSON;
import java.util.*;
import qubhjava.BaseSolution;


class Robot {

    public Robot(int width, int height) {
        
    }
    
    public void step(int num) {
        
    }
    
    public int[] getPos() {
        
    }
    
    public String getDir() {
        
    }
}

/**
 * Your Robot object will be instantiated and called as such:
 * Robot obj = new Robot(width, height);
 * obj.step(num);
 * int[] param_2 = obj.getPos();
 * String param_3 = obj.getDir();
 */

public class Solution extends BaseSolution {


    @Override
    public Object solve(String[] inputJsonValues) {
        String[] operators = jsonArrayToStringArray(inputJsonValues[0]);
		String[][] opValues = jsonArrayToString2DArray(inputJsonValues[1]);
		int width = Integer.parseInt(opValues[0][0]);
		int height = Integer.parseInt(opValues[0][1]);
		Robot obj = new Robot(width, height);
		List<Object> ans = new ArrayList<>(operators.length);
		ans.add(null);
		for (int i = 1; i < operators.length; i++) {
			if (operators[i].compareTo("step") == 0) {
				int num = Integer.parseInt(opValues[i][0]);
				obj.step(num);
				ans.add(null);
				continue;
			}
			if (operators[i].compareTo("getPos") == 0) {
				
				ans.add(obj.getPos());
				continue;
			}
			if (operators[i].compareTo("getDir") == 0) {
				
				ans.add(obj.getDir());
				continue;
			}
			ans.add(null);
		}
        return JSON.toJSON(ans);
    }
}
