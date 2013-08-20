package tree;

public class Tree<Type extends Comparable<Type>> {

	private BNode<Type> root;
	
	public boolean add(Type value) {
		BNode<Type> newNode = new BNode<Type>(value);
		if(root == null) {
			root = newNode;
			return true;
		} else {
			return addChildNode(root, value);
		}
	}
	
	public void accept(Visitor<Type> visitor) {
		root.accept(visitor);
	}
	
	public Type search(Type value) {
		return searchChildNode(root, value);
	}
	
	
	public Type searchChildNode(BNode<Type> parent, Type value) {
		int ret = value.compareTo(parent.getValue());
		
		if(ret == 0) {
			return parent.getValue();
		} else if(ret > 0) {
			return searchFromRight(parent, value);
		} else {
			return searchFromLeft(parent, value);
		}
		
	}

	
	public boolean addChildNode(BNode<Type> parent, Type value) {
		int ret = value.compareTo(parent.getValue());
		
		if(ret == 0) {
			return false;
		} else if(ret > 0) {
			return addToRight(parent, value);
		} else {
			return addToLeft(parent, value);
		}
	}
	

	

	private Type searchFromLeft(BNode<Type> parent, Type value) {
		if(parent.hasLeftChild()) {
			return searchChildNode(parent.getLeftChild(), value);
		} else {
			return null;
		}
	}

	private Type searchFromRight(BNode<Type> parent, Type value) {
		if(parent.hasRightChild()) {
			return searchChildNode(parent.getRightChild(), value);
		} else {
			return null;
		}
	}



	private boolean addToLeft(BNode<Type> parent, Type value) {
		if(parent.hasLeftChild()) {
			return addChildNode(parent.getLeftChild(), value);
		} else {
			parent.setLeftChild(new BNode<Type>(value));
			return true;
		}
	}


	private boolean addToRight(BNode<Type> parent, Type value) {
		if(parent.hasRightChild()) {
			return addChildNode(parent.getRightChild(), value);
		} else {
			parent.setRightChild(new BNode<Type>(value));
			return true;
		}
	}

}
