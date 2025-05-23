package problem208

import (
	"encoding/json"
	"log"
	"strings"
)

type Trie struct {
	Root map[rune]any
}

func Constructor() Trie {
	return Trie{Root: map[rune]any{}}
}

func (this *Trie) Insert(word string) {
	node := this.Root
	for _, r := range word {
		if _, ok := node[r]; !ok {
			node[r] = map[rune]any{}
		}
		node = node[r].(map[rune]any)
	}
	node['#'] = nil
}

func (this *Trie) serachNode(word string) map[rune]any {
	node := this.Root
	for _, r := range word {
		if _, ok := node[r]; !ok {
			return nil
		}
		node = node[r].(map[rune]any)
	}
	return node
}

func (this *Trie) Search(word string) bool {
	if node := this.serachNode(word); node != nil {
		if _, ok := node['#']; ok {
			return true
		}
	}
	return false
}

func (this *Trie) StartsWith(prefix string) bool {
	return this.serachNode(prefix) != nil
}

/**
 * Your Trie object will be instantiated and called as such:
 * obj := Constructor();
 * obj.Insert(word);
 * param_2 := obj.Search(word);
 * param_3 := obj.StartsWith(prefix);
 */

func Solve(inputJsonValues string) any {
	inputValues := strings.Split(inputJsonValues, "\n")
	var operators []string
	var opValues [][]any
	var ans []any
	if err := json.Unmarshal([]byte(inputValues[0]), &operators); err != nil {
		log.Println(err)
		return nil
	}
	if err := json.Unmarshal([]byte(inputValues[1]), &opValues); err != nil {
		log.Println(err)
		return nil
	}
	obj := Constructor()
	ans = append(ans, nil)
	for i := 1; i < len(operators); i++ {
		var res any
		switch operators[i] {
		case "insert", "Insert":
			res = nil
			obj.Insert(opValues[i][0].(string))
		case "search", "Search":
			res = obj.Search(opValues[i][0].(string))
		case "startsWith", "StartsWith":
			res = obj.StartsWith(opValues[i][0].(string))
		default:
			res = nil
		}
		ans = append(ans, res)
	}

	return ans
}
