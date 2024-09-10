#![allow(non_snake_case)]
use serde_json::{json, Value};
use library::lib::tree_node::{TreeNode, array_to_tree};
pub struct Solution;

// Definition for a binary tree node.
// #[derive(Debug, PartialEq, Eq)]
// pub struct TreeNode {
//   pub val: i32,
//   pub left: Option<Rc<RefCell<TreeNode>>>,
//   pub right: Option<Rc<RefCell<TreeNode>>>,
// }
//
// impl TreeNode {
//   #[inline]
//   pub fn new(val: i32) -> Self {
//     TreeNode {
//       val,
//       left: None,
//       right: None
//     }
//   }
// }
use std::rc::Rc;
use std::cell::RefCell;
impl Solution {
    pub fn sum_numbers(root: Option<Rc<RefCell<TreeNode>>>) -> i32 {
        let mut ans = 0;
        fn dfs(node: &Option<Rc<RefCell<TreeNode>>>, sum: i32, ans: &mut i32) {
            if let Some(n) = node {
                let n = n.borrow();
                let sum = sum * 10 + n.val;
                if n.left.is_none() && n.right.is_none() {
                    *ans += sum;
                    return;
                }
                dfs(&n.left, sum, ans);
                dfs(&n.right, sum, ans);
            }
        }
        dfs(&root, 0, &mut ans);
        ans
    }
}

#[cfg(feature = "solution_LCR_049")]
pub fn solve(input_string: String) -> Value {
    let input_values: Vec<String> = input_string.split('\n').map(|x| x.to_string()).collect();
    let input_vec0: Vec<Option<i32>> = serde_json::from_str(&input_values[0]).expect("Failed to parse input");
    let root: Option<Rc<RefCell<TreeNode>>> = array_to_tree(&input_vec0);
    json!(Solution::sum_numbers(root))
}