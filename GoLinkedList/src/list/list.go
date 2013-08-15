package list

// Definition of Node
type Node struct{
	prev, next *Node
	value interface{}
}

func (o *Node) Init(v interface{}) *Node {
	o.prev = nil
	o.next = nil
	o.value = v
	
	return o
}

func (o *Node) GetNext() *Node {
	return o.next
}

func (o *Node) GetPrev() *Node {
	return o.prev
}

func (o *Node) GetValue() interface{} {
	return o.value
}

func (o *Node) SetNext(next *Node) {
	o.next = next
}

func (o *Node) SetPrev(prev *Node) {
	o.prev = prev
}

func (o *Node) SetValue(v interface{}) {
	o.value = v
}


// Definition of List
type List struct{
	head, tail *Node
	size int
}

func New() *List {
	return new(List).Init()
}

func (o *List) Init() *List {
	o.head = new(Node).Init(nil)
	o.tail = new(Node).Init(nil)
	o.size = 0
	
	o.head.SetNext(o.tail)
	
	return o
}

func (o *List) AddFirst(v interface{}) {
	aNode := new(Node).Init(v)
	
	aNode.SetNext(o.head.GetNext())
	aNode.SetPrev(o.head)
	
	o.head.GetNext().SetPrev(aNode)
	o.head.SetNext(aNode)
	o.size++
}

func (o *List) AddLast(v interface{}) {
	aNode := new(Node).Init(v)
	
	aNode.SetNext(o.tail)
	aNode.SetPrev(o.tail.GetPrev())
	
	o.tail.GetPrev().SetNext(aNode)
	o.tail.SetPrev(aNode)
	o.size++
}

func (o *List) Remove(aNode *Node) *Node{	
	for pos := o.head.GetNext(); pos != o.tail; pos = pos.GetNext() {
		if pos == aNode  {
			pos.GetPrev().SetNext(pos.GetNext())
			pos.GetNext().SetPrev(pos.GetPrev())
			
			pos.SetNext(nil)
			pos.SetPrev(nil)
			o.size --;
			return pos
		}
	}
	
	return nil
}

func (o *List) GetSize() int {
	return o.size
}

func (o *List) GetAt(index int) interface {} {
	
	if index < o.size {
		cnt := 0
		for pos := o.head.GetNext() ; pos != o.tail; pos = pos.GetNext() {
			if cnt == index  {
				return pos.GetValue()
			} 
			cnt++
		}
	}
	
	return nil
}