use serde_json::{json, Value};

pub struct Solution;

impl Solution {
    pub fn successful_pairs(spells: Vec<i32>, potions: Vec<i32>, success: i64) -> Vec<i32> {
        
    }
}

#[cfg(feature = "solution_2300")]
pub fn solve(input_string: String) -> Value {
	let input_values: Vec<String> = input_string.split('\n').map(|x| x.to_string()).collect();
	let spells: Vec<i32> = serde_json::from_str(&input_values[0]).expect("Failed to parse input");
	let potions: Vec<i32> = serde_json::from_str(&input_values[1]).expect("Failed to parse input");
	let success: i64 = serde_json::from_str(&input_values[2]).expect("Failed to parse input");
	json!(Solution::successful_pairs(spells, potions, success))
}
