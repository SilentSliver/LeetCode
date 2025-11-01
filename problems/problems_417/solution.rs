use serde_json::{json, Value};

pub struct Solution;

impl Solution {
    pub fn pacific_atlantic(heights: Vec<Vec<i32>>) -> Vec<Vec<i32>> {
        
    }
}

#[cfg(feature = "solution_417")]
pub fn solve(input_string: String) -> Value {
	let input_values: Vec<String> = input_string.split('\n').map(|x| x.to_string()).collect();
	let heights: Vec<Vec<i32>> = serde_json::from_str(&input_values[0]).expect("Failed to parse input");
	json!(Solution::pacific_atlantic(heights))
}
