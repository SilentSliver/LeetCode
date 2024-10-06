use serde_json::{json, Value};

pub struct Solution;

impl Solution {
    pub fn min_speed_on_time(dist: Vec<i32>, hour: f64) -> i32 {

    }
}

#[cfg(feature = "solution_1870")]
pub fn solve(input_string: String) -> Value {
	let input_values: Vec<String> = input_string.split('\n').map(|x| x.to_string()).collect();
	let dist: Vec<i32> = serde_json::from_str(&input_values[0]).expect("Failed to parse input");
	let hour: f64 = serde_json::from_str(&input_values[1]).expect("Failed to parse input");
	json!(Solution::min_speed_on_time(dist, hour))
}