package d.collection;

import java.util.ArrayList;
import java.util.Stack;

public class ListTest {

	public static void main(String[] args) {
		ListTest obj = new ListTest();
		//obj.chkArrayList();
		//obj.chkArrayList2();
		//obj.chkArrayList3();
		//obj.chkArrayList4();
		obj.chkStack();
	}
	
	public void chkArrayList() {
		ArrayList<String> list1 = new ArrayList<>(50);
		//list1.add(new Object());
		list1.add("FirstData");
		//list1.add(new Double(1.1));
	}
	
	public void chkArrayList2() {
		ArrayList<String> list = new ArrayList<String>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("E");
		list.add(1,"A1");
		for (String tmp : list) {
			System.out.println(tmp);
		}
		System.out.println("--------------------------------");
		
		//ArrayList<String> list2 = new ArrayList<String>();
		ArrayList<String> list2 = new ArrayList<String>(list);
		list2.add("0");
		list2.addAll(list);
		for (String tmp : list2) {
			System.out.println("list2 " + tmp);
		}	
		
		System.out.println("--------------------------------");

		ArrayList<String> list3 = list;
		list.add("X");
		for (String tmp : list3) {
			System.out.println("list3 " + tmp);
		}			
		
		// Shallow copy  : 주소값만 copy
		// Deep copy     : 값도 새주소 복사
		// arraycopy  
		
	}
	
	
	public void chkArrayList3() {
		ArrayList<String> list = new ArrayList<String>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("E");
		int lSize = list.size();
		for ( int i = 0 ; i < lSize; i++) {
			System.out.println("list.get(" +i + ")=" +  list.get(i));
		}
		System.out.println(list.indexOf("B"));
	
		System.out.println("--------------------------------");
		//String[] strList = list.toArray(new String[0]);
		
		String[] tmpArray = new String[5];
		String[] strList = list.toArray(tmpArray);
		for (String tmp: strList) {
			System.out.println(tmp);
		}
		
	}
	
	public void chkArrayList4() {
		ArrayList<String> list = new ArrayList<String>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("E");
		list.add("A");
		//System.out.println("Removed " + list.remove(0));
		//System.out.println("Removed " + list.remove("A"));  // 첫 "A" 만 삭제
		
		ArrayList<String> tmp = new ArrayList<String>();
		tmp.add("A");
		list.removeAll(tmp);   // 모든 "A" 삭제
		
		
		
		
		for ( int i = 0 ; i < list.size(); i++) {
			System.out.println("list.get(" +i + ")=" +  list.get(i));
		}
		
		
	}
	
	public void chkStack() {
		Stack<Integer> intStack = new Stack<>() ;
		for(int i=0 ; i < 5; i++) {
			intStack.push(i);
			System.out.println(intStack.peek());
		}
		System.out.println("--------------------------------");
		while(!intStack.empty()) {
			System.out.println(intStack.pop());
		}
		
	}
	
}
