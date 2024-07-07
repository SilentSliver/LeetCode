package silversliver.silversliver_1958;

import com.alibaba.fastjson.JSON;
import java.util.*;
import qubhjava.BaseSolution;


public class Solution extends BaseSolution {
    static final int[][]dirs = {
            {1, 1},
            {1, 0},
            {1, -1},
            {0 , 1},
            {0, -1},
            {-1, -1},
            {-1, 0},
            {-1, 1}
    };

    public boolean checkMove(char[][] board, int rMove, int cMove, char color) {
        // 从 x 轴正方向开始逆时针枚举 8 个方向
        for (int[] dir: dirs)
            if (check(board, rMove, cMove, color, dir[0], dir[1]))
                return true;
        return false;
    }

    public boolean check(char[][] board, int rMove, int cMove, char color, int dx, int dy) {
        var x = rMove + dx;
        var y = cMove + dy;
        for (var step = 0; x >= 0 && x < 8 && y >= 0 && y < 8 && step >= 0; step++) {
            if (step == 0) {
                if (board[x][y] == '.' || board[x][y] == color)
                    return false;
            } else {
                if (board[x][y] == '.')
                    return false;
                if (board[x][y] == color)
                    return true;
            }
            x += dx; y += dy;
        }
        return false;
    }



    @Override
    public Object solve(String[] inputJsonValues) {
        char[][] board = jsonArrayToChar2DArray(inputJsonValues[0]);
		int rMove = Integer.parseInt(inputJsonValues[1]);
		int cMove = Integer.parseInt(inputJsonValues[2]);
		char color = inputJsonValues[3].length() > 1 ? inputJsonValues[3].charAt(1) : inputJsonValues[3].charAt(0);
        return JSON.toJSON(checkMove(board, rMove, cMove, color));
    }
}
