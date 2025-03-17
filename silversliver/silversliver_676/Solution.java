package silversliver.silversliver_676;

import com.alibaba.fastjson.JSON;
import java.util.*;
import qubhjava.BaseSolution;


class MagicDictionary {
	static final int N = 100 * 100, M = 26;
	int idx = 0;
	int[][] trie = new int[N][M];
	boolean[] isEnd = new boolean[N * M];

	void add(String cur) {
		var p = 0;
		for (var i = 0; i < cur.length(); i++) {
			int u = cur.charAt(i) - 'a';
			if (trie[p][u] == 0) trie[p][u] = ++idx;
			p = trie[p][u];
		}
		isEnd[p] = true;
	}

	boolean query(String cur, int idx, int p, int limit) {
		if (limit < 0) return false;
		if (idx == cur.length()) return isEnd[p] && limit == 0;
		var u = cur.charAt(idx) - 'a';
		for (var i = 0; i < 26; i++) {
			if (trie[p][i] == 0) continue;
			if (query(cur, idx + 1, trie[p][i], i == u ? limit : limit - 1)) return true;
		}
		return false;
	}

	public void buildDict(String[] dictionary) {
		for (var cur: dictionary) add(cur);
	}

	public boolean search(String searchWord) {
		return query(searchWord, 0, 0, 1);
	}
}

/**
 * Your MagicDictionary object will be instantiated and called as such:
 * MagicDictionary obj = new MagicDictionary();
 * obj.buildDict(dictionary);
 * boolean param_2 = obj.search(searchWord);
 */
/**
 * Your MagicDictionary object will be instantiated and called as such:
 * MagicDictionary obj = new MagicDictionary();
 * obj.buildDict(dictionary);
 * boolean param_2 = obj.search(searchWord);
 */

public class Solution extends BaseSolution {


    @Override
    public Object solve(String[] inputJsonValues) {
        String[] operators = jsonArrayToStringArray(inputJsonValues[0]);
		String[][] opValues = jsonArrayToString2DArray(inputJsonValues[1]);
		
		MagicDictionary obj = new MagicDictionary();
		List<Object> ans = new ArrayList<>(operators.length);
		ans.add(null);
		for (int i = 1; i < operators.length; i++) {
			if (operators[i].compareTo("buildDict") == 0) {
				String[] dictionary = jsonArrayToStringArray(opValues[i][0]);
				obj.buildDict(dictionary);
				ans.add(null);
				continue;
			}
			if (operators[i].compareTo("search") == 0) {
				String searchWord = jsonStringToString(opValues[i][0]);
				ans.add(obj.search(searchWord));
				continue;
			}
			ans.add(null);
		}
        return JSON.toJSON(ans);
    }
}
