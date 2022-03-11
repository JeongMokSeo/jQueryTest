package d.collection;

import java.util.LinkedList;

public class QueueTest {

	public static void main(String[] args) {
		QueueTest obj = new QueueTest();
		obj.chkLinkedList();
	}

	private void chkLinkedList() {
		LinkedList<String> link = new LinkedList<>();
		link.add("A");
		link.addFirst("B");
		System.out.println(link);
		link.offerFirst("C");   // = addFirst
		System.out.println(link);
		link.addLast("D");
		System.out.println(link);
		link.offer("E");
		System.out.println(link);
		link.offerLast("F");
		System.out.println(link);
		link.push("G");
		System.out.println(link);
		link.add(0,"H");
		System.out.println(link);
		System.out.println("set:" +link.set(0, "I"));
		System.out.println(link);
		
		System.out.println("A contains:" +link.contains("A"));
		System.out.println("A indexOf:" +link.indexOf("A"));
		System.out.println("Z indexOf:" +link.indexOf("Z"));
		link.add("C");
		link.add("D");
		System.out.println(link);
		System.out.println("C lastIndexOf:" +link.lastIndexOf("C"));
		
		link.remove();
		System.out.println(link);
		
		
	}
}
