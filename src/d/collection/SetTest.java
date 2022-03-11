package d.collection;

import java.util.HashSet;
import java.util.Iterator;

public class SetTest {
	public static void main(String[] args) {
		SetTest obj = new SetTest();
		String[] fruits = new String[] {"Banana","Melon","Mango","Kiwi","Tomato","Pear","Papaya",
				"Lemon","Tomato","Orange","Strawberry","apple","Mango","Grape","Watermelon","peach","Banana" };		
		System.out.println(obj.getFruitKinds(fruits));

	}

	public int getFruitKinds(String[] fruits) {
		if (fruits == null) return 0;
		if (fruits.length==1) return 1;
		
		HashSet<String> fSet = new HashSet<>();
		for (String fruit: fruits) {
			fSet.add(fruit);
		}
		printFruitSet(fSet);
		printFruitSet2(fSet);
		return fSet.size();
	}
	
	public void printFruitSet(HashSet<String> fSet) {
		for (String tmp: fSet) {
			System.out.print(tmp + " ");
		}
		System.out.println();
	}
	
	public void printFruitSet2(HashSet<String> fSet) {
		
		System.out.println("------------------------------");
		
		Iterator<String> iter = fSet.iterator();
		while(iter.hasNext()) {
			System.out.print(iter.next() + " ");
		}
		System.out.println();
	}
	
}