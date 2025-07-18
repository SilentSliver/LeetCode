package silversliver.silversliver_1290;

import com.alibaba.fastjson.JSON;
import java.util.*;
import qubhjava.BaseSolution;
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
import qubhjava.models.ListNode;

public class Solution extends BaseSolution {
    public int getDecimalValue(ListNode head) {
        
    }

    @Override
    public Object solve(String[] inputJsonValues) {
        ListNode head = jsonArrayToListNode(inputJsonValues[0]);
        return JSON.toJSON(getDecimalValue(head));
    }
}
