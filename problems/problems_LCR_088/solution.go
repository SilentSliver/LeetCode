package problemLCR_088

import (
	"encoding/json"
	"log"
	"strings"
)

func minCostClimbingStairs(cost []int) int {
	n := len(cost)
	dp := make([]int, n+1)
	for i := 2; i <= n; i++ {
		dp[i] = min(dp[i-1]+cost[i-1], dp[i-2]+cost[i-2])
	}
	return dp[n]
}

func Solve(inputJsonValues string) any {
	inputValues := strings.Split(inputJsonValues, "\n")
	var cost []int

	if err := json.Unmarshal([]byte(inputValues[0]), &cost); err != nil {
		log.Fatal(err)
	}

	return minCostClimbingStairs(cost)
}
