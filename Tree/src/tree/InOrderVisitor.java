package tree;

public class InOrderVisitor<Type extends Comparable<Type>> implements
		Visitor<Type> {

	@Override
	public void visit(BNode<Type> dest) {

		if(dest.hasLeftChild()) {
			dest.getLeftChild().accept(this);
		}
		System.out.println(dest.getValue());
		if(dest.hasRightChild()) {
			dest.getRightChild().accept(this);
		}
	}

}
