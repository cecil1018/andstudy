package main

import (
		"fmt"
		"./list"
)

func main() {
	list := list.New()

	list.AddFirst(4)
	list.AddFirst(3)
	list.AddFirst(2)
	list.AddFirst(1)
	list.AddLast("A")
	list.AddLast("B")
	list.AddLast("C")
	list.AddLast("D")
	list.AddLast("E")

	for i := 0; i < list.GetSize(); i++ {
		fmt.Println(list.GetAt(i))
	}
}
