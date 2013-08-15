package list;

import java.util.Iterator;

public class MyList<Type> implements Iterable<Type>{
	private int size;
	private MyNode<Type> head;
	private MyNode<Type> tail;
	
	public MyList() {
		size = 0;
		head = new MyNode<Type>(null);
		tail = new MyNode<Type>(null);
		head.setNext(tail);
		tail.setPrev(head);
	}
	
	public void addLast(Type aData) {
		MyNode<Type> newNode = new MyNode<Type>(aData);

		newNode.setPrev(tail.getPrev());
		newNode.setNext(tail);
		tail.getPrev().setNext(newNode);
		tail.setPrev(newNode);

		size++;
	}
	
	public void addFirst(Type aData) {
		MyNode<Type> newNode = new MyNode<Type>(aData);

		newNode.setNext(head.getNext());
		newNode.setPrev(head);
		head.getNext().setPrev(newNode);
		head.setNext(newNode);
				
		size++;
	}
	

	public boolean remove(MyNode<Type> aNode) {
		MyNode<Type> pos = this.head.getNext();
		
		while(pos != tail) {
			if(pos == aNode) {
				pos.getPrev().setNext(pos.getNext());
				pos.getNext().setPrev(pos.getPrev());
				size--;
				return true;
			}
			pos = pos.getNext();
		}
	
		return false;
	}

	public MyNode<Type> getHead() {
		return head;
	}
	
	public MyNode<Type> getTail() {
		return tail;
	}

	public int size() {
		return size;
	}
	
	@Override
	public Iterator<Type> iterator() {
		return new MyListIterator<Type>(this);
	}
}
