const PROBLEMS: [[&str; 2]; 1] = [["problems", "279"]];


#[cfg(test)]
mod test {
    use test_executor::run_test::run_test;
    use crate::PROBLEMS;

    use solution_279 as solution0;

    #[test]
    fn test_solutions() {
        for (i, problem) in PROBLEMS.iter().enumerate() {
            let (folder, id) = (problem[0], problem[1]);
            run_test(id, folder, match i {
                0 => solution0::solve,
                _ => panic!("Unknown solution"),
            });
        }
    }
}