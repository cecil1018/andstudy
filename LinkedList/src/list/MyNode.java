package list;

public class MyNode<Type> {
	private Type data;
	private MyNode<Type> prev;
	private MyNode<Type> next;
	
	
	public MyNode(Type data) {
		this.data = data;
		this.prev = null;
		this.next = null;
	}

	public Type getData() {
		return data;
	}

	public void setData(Type data) {
		this.data = data;
	}

	public MyNode<Type> getPrev() {
		return prev;
	}

	public void setPrev(MyNode<Type> prev) {
		this.prev = prev;
	}

	public MyNode<Type> getNext() {
		return next;
	}

	public void setNext(MyNode<Type> next) {
		this.next = next;
	}
	
	public void setPrevAndNext(MyNode<Type> prev, MyNode<Type> next) {
		setPrev(prev);
		setNext(next);
	}
}
