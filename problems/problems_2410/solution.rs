use serde_json::{json, Value};

pub struct Solution;

impl Solution {
    pub fn match_players_and_trainers(players: Vec<i32>, trainers: Vec<i32>) -> i32 {
        
    }
}

#[cfg(feature = "solution_2410")]
pub fn solve(input_string: String) -> Value {
	let input_values: Vec<String> = input_string.split('\n').map(|x| x.to_string()).collect();
	let players: Vec<i32> = serde_json::from_str(&input_values[0]).expect("Failed to parse input");
	let trainers: Vec<i32> = serde_json::from_str(&input_values[1]).expect("Failed to parse input");
	json!(Solution::match_players_and_trainers(players, trainers))
}
