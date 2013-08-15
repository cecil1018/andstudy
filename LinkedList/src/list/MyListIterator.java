package list;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class MyListIterator<Type> implements Iterator<Type>{
	private MyList<Type> list;
	private MyNode<Type> curNode;
	
	public MyListIterator(MyList<Type> list) {
		this.list = list;
		this.curNode = list.getHead();
	}

	@Override
	public boolean hasNext() {
		return (curNode.getNext() != list.getTail());
	}

	@Override
	public Type next() {
		if(!hasNext()) {
			throw new NoSuchElementException();
		}
		curNode = curNode.getNext();
		return curNode.getData();
	}

	@Override
	public void remove() {
		MyNode<Type> target = curNode;
		curNode = curNode.getPrev();
		list.remove(target);
	}
}
