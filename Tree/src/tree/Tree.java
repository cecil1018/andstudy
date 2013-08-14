package tree;

public class Tree<Type extends Comparable<Type>> {

	private BinaryNode<Type> root;
	
	public boolean add(Type value) {
		BinaryNode<Type> newNode = new BinaryNode<Type>(value);
		if(root == null) {
			root = newNode;
			return true;
		} else {
			return root.add(newNode);
		}
	}
	
	public void accept(Visitor<Type> visitor) {
		root.accept(visitor);
	}
}
