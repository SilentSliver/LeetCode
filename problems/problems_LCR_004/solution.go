package problemLCR_004

import (
	"encoding/json"
	"log"
	"strings"
)

func singleNumber(nums []int) int {

}

func Solve(inputJsonValues string) interface{} {
	inputValues := strings.Split(inputJsonValues, "\n")
	var nums []int

	if err := json.Unmarshal([]byte(inputValues[0]), &nums); err != nil {
		log.Fatal(err)
	}

	return singleNumber(nums)
}
