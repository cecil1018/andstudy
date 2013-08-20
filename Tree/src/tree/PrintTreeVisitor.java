package tree;

public class PrintTreeVisitor<Type extends Comparable<Type>> implements
		Visitor<Type> {
	private int depth;
	
	public PrintTreeVisitor() {
		depth = 0;
	}
	
	@Override
	public void visit(BNode<Type> dest) {
		
		for(int i = 0; i < depth; i++) {
			System.out.print("\t");
		}		
		System.out.println(dest.getValue());
		
		if(dest.hasLeftChild()) {
			depth ++;
			dest.getLeftChild().accept(this);
			depth --;
		}
		
		if(dest.hasRightChild()) {
			depth ++;
			dest.getRightChild().accept(this);
			depth --;
		}
		
	}

}
