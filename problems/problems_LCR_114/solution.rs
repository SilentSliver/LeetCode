#![allow(non_snake_case)]
use serde_json::{json, Value};

pub struct Solution;

impl Solution {
    pub fn alien_order(words: Vec<String>) -> String {

    }
}

#[cfg(feature = "solution_LCR_114")]
pub fn solve(input_string: String) -> Value {
	let input_values: Vec<String> = input_string.split('\n').map(|x| x.to_string()).collect();
	let words: Vec<String> = serde_json::from_str(&input_values[0]).expect("Failed to parse input");
	json!(Solution::alien_order(words))
}
