package tree;

public class PostOrderVisitor<Type extends Comparable<Type>> implements
		Visitor<Type> {

	@Override
	public void visit(BinaryNode<Type> dest) {
		if(dest.hasLeftChild()) {
			dest.getLeftChild().accept(this);
		}
		
		if(dest.hasRightChild()) {
			dest.getRightChild().accept(this);
		}
		System.out.println(dest.getValue());
	}
}
