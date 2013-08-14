package tree;

public interface Visitor<Type extends Comparable<Type>> {
	public void visit(BinaryNode<Type> dest);
}
