package tree;


public class PreOrderVisitor<Type extends Comparable<Type>> implements
		Visitor<Type> {

	@Override
	public void visit(BNode<Type> dest) {
		System.out.println(dest.getValue());
		if(dest.hasLeftChild()) {
			dest.getLeftChild().accept(this);
		}
		
		if(dest.hasRightChild()) {
			dest.getRightChild().accept(this);
		}
		
	}

}
