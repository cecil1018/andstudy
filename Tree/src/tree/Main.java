package tree;

public class Main {
	public static void main(String [] args) {
		Tree<Integer> tree = new Tree<Integer>();
		
		tree.add(5);
		tree.add(3);
		tree.add(6);
		tree.add(2);
		tree.add(1);
		tree.add(0);
		
		System.out.println("###### PreOrder");
		tree.accept(new PreOrderVisitor<Integer>());
		System.out.println("###### InOrder");
		tree.accept(new InOrderVisitor<Integer>());
	}
}
