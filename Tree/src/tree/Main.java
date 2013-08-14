package tree;

public class Main {
	public static void main(String [] args) {
		integerTest();
		stringTest();
	}



	private static <Type extends Comparable<Type>> void printResult(Tree<Type> tree) {
		System.out.println("###### Print Tree");
		tree.accept(new PrintTreeVisitor<Type>());
		System.out.println("###### PreOrder");
		tree.accept(new PreOrderVisitor<Type>());
		System.out.println("###### InOrder");
		tree.accept(new InOrderVisitor<Type>());
		System.out.println("###### PostOrder");
		tree.accept(new PostOrderVisitor<Type>());
	}

	private static void stringTest() {
		Tree<String> tree = new Tree<String>();
		
		tree.add("Fxx");
		tree.add("Cxx");
		tree.add("Bxx");
		tree.add("Dxx");
		tree.add("Hxx");
		tree.add("Gxx");
		tree.add("Ixx");
		
		printResult(tree);
	}
	
	private static void integerTest() {
		Tree<Integer> tree = new Tree<Integer>();
		
		tree.add(5);
		tree.add(3);
		tree.add(1);
		tree.add(4);
		tree.add(7);
		tree.add(6);
		tree.add(8);
		
		printResult(tree);
	}
}
