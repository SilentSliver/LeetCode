package silversliver.silversliver_2502;

import com.alibaba.fastjson.JSON;
import java.util.*;
import qubhjava.BaseSolution;


class Allocator {
	private final int[] memory;

	public Allocator(int n) {
		memory = new int[n];
	}

	public int allocate(int size, int mID) {
		int free = 0;
		for (int i = 0; i < memory.length; i++) {
			if (memory[i] > 0) {
				free = 0;
				continue;
			}
			free++;
			if (free == size) {
				Arrays.fill(memory, i - size + 1, i + 1, mID);
				return i - size + 1;
			}
		}
		return -1; // 无法分配内存
	}

	public int freeMemory(int mID) {
		int ans = 0;
		for (int i = 0; i < memory.length; i++) {
			if (memory[i] == mID) {
				ans++;
				memory[i] = 0; // 标记为空闲内存
			}
		}
		return ans;
	}
}

/**
 * Your Allocator object will be instantiated and called as such:
 * Allocator obj = new Allocator(n);
 * int param_1 = obj.allocate(size,mID);
 * int param_2 = obj.freeMemory(mID);
 */

public class Solution extends BaseSolution {


    @Override
    public Object solve(String[] inputJsonValues) {
        String[] operators = jsonArrayToStringArray(inputJsonValues[0]);
		String[][] opValues = jsonArrayToString2DArray(inputJsonValues[1]);
		int n = Integer.parseInt(opValues[0][0]);
		Allocator obj = new Allocator(n);
		List<Object> ans = new ArrayList<>(operators.length);
		ans.add(null);
		for (int i = 1; i < operators.length; i++) {
			if (operators[i].compareTo("allocate") == 0) {
				int size = Integer.parseInt(opValues[i][0]);
				int mID = Integer.parseInt(opValues[i][1]);
				ans.add(obj.allocate(size, mID));
				continue;
			}
			if (operators[i].compareTo("freeMemory") == 0) {
				int mID = Integer.parseInt(opValues[i][0]);
				ans.add(obj.freeMemory(mID));
				continue;
			}
			ans.add(null);
		}
        return JSON.toJSON(ans);
    }
}
