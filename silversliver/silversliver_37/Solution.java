package silversliver.silversliver_37;

import com.alibaba.fastjson.JSON;
import java.util.*;
import qubhjava.BaseSolution;


public class Solution extends BaseSolution {
    public void solveSudoku(char[][] board) {
        
    }

    @Override
    public Object solve(String[] inputJsonValues) {
        char[][] board = jsonArrayToChar2DArray(inputJsonValues[0]);
		solveSudoku(board);
        return JSON.toJSON(board);
    }
}
