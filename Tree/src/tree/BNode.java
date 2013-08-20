package tree;

public class BNode<Type extends Comparable<Type>> {
	private Type data;
	private BNode<Type> leftChild;
	private BNode<Type> rightChild;
	
	public BNode(Type value) {
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
	
	public BNode<Type> getLeftChild() {
		return leftChild;
	}
	
	public BNode<Type> getRightChild() {
		return rightChild;
	}

	
	public void accept(Visitor<Type> visitor) {
		visitor.visit(this);
	}
	
	
	public Type getValue() {		
		return data;
	}
	


	public void setLeftChild(BNode<Type> leftChild) {
		this.leftChild = leftChild;
	}

	public void setRightChild(BNode<Type> rightChild) {
		this.rightChild = rightChild;
	}
}
