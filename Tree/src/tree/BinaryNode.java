package tree;

public class BinaryNode<Type extends Comparable<Type>> {
	private Type data;
	private BinaryNode<Type> leftChild;
	private BinaryNode<Type> rightChild;
	
	public BinaryNode(Type value) {
		this.data = value;
		leftChild = null;
		rightChild = null;
	}
	
	public boolean hasLeftChild() {
		return (leftChild != null);
	}
	
	public boolean hasRightChild() {
		return (rightChild != null);
	}
	
	public BinaryNode<Type> getLeftChild() {
		return leftChild;
	}
	
	public BinaryNode<Type> getRightChild() {
		return rightChild;
	}

	public void setLeftChild(BinaryNode<Type> leftChild) {
		this.leftChild = leftChild;
	}

	public void setRightChild(BinaryNode<Type> rightChild) {
		this.rightChild = rightChild;
	}
	
	public void accept(Visitor<Type> visitor) {
		visitor.visit(this);
	}
	
	public boolean add(BinaryNode<Type> newNode) {
		int ret = data.compareTo(newNode.getValue());
		
		if(ret == 0) {
			return false;
		} else if(ret > 0) {
			return addToLeft(newNode);
		} else {
			return addToRight(newNode);
		}
	}

	public Type getValue() {		
		return data;
	}

	private boolean addToLeft(BinaryNode<Type> newNode) {
		if(hasLeftChild()) {
			return leftChild.add(newNode);
		} else {
			setLeftChild(newNode);
			return true;
		}
	}


	private boolean addToRight(BinaryNode<Type> newNode) {
		if(hasRightChild()) {
			return rightChild.add(newNode);
		} else {
			setRightChild(newNode);
			return true;
		}
	}


}
