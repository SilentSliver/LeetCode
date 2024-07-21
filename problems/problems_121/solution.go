package problem121

import (
	"encoding/json"
	"log"
	"strings"
)

func maxProfit(prices []int) int {

}

func Solve(inputJsonValues string) interface{} {
	inputValues := strings.Split(inputJsonValues, "\n")
	var prices []int

	if err := json.Unmarshal([]byte(inputValues[0]), &prices); err != nil {
		log.Fatal(err)
	}

	return maxProfit(prices)
}