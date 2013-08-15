package main;

import java.util.Iterator;

import list.MyList;

public class TestList {
	public static void main(String args[]) {
		TestString();
		TestInteger();
	}

	public static void TestString()  {
		MyList<String> list = new MyList<String>();
		
		list.addFirst("five");
		list.addFirst("four");
		list.addFirst("three");
		list.addFirst("two");
		list.addFirst("one");		
		
		list.addLast("six");
		list.addLast("seven");
		list.addLast("eight");
		list.addLast("nine");
		list.addLast("ten");

		PrintList(list);
		
		Iterator<String> iter = list.iterator();
		
		while(iter.hasNext()) {
			if(iter.next().equals("two")) {
				iter.remove();
			}
		}
		
		PrintList(list);		
	}
	
	public static void TestInteger() {
		MyList<Integer> list = new MyList<Integer>();
		
		list.addFirst(5);
		list.addFirst(4);
		list.addFirst(3);
		list.addFirst(2);
		list.addFirst(1);		

		list.addLast(6);
		list.addLast(7);
		list.addLast(8);
		list.addLast(10);
		
		PrintList(list);
		
		Iterator<Integer> iter = list.iterator();
		
		while(iter.hasNext()) {
			if( (iter.next() % 2) == 0) {
				iter.remove();
			}
		}
		
		PrintList(list);
		
	}
	
	public static <Type>void PrintList(MyList<Type> list) {
		System.out.println("# Print list");
		for(Type value: list) {
			System.out.print(value + " ");
		}
		System.out.println("("+list.size() +")");
	}
}
