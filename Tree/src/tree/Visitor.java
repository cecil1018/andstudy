package tree;

public interface Visitor<Type extends Comparable<Type>> {
	public void visit(BNode<Type> dest);
}
