use serde_json::{json, Value};

pub struct Solution;

impl Solution {
    pub fn is_valid(word: String) -> bool {
        
    }
}

#[cfg(feature = "solution_3136")]
pub fn solve(input_string: String) -> Value {
	let input_values: Vec<String> = input_string.split('\n').map(|x| x.to_string()).collect();
	let word: String = serde_json::from_str(&input_values[0]).expect("Failed to parse input");
	json!(Solution::is_valid(word))
}
