/*
 * Arrays 클래스의 메서드
 * 정렬: sort()
 * 검색: binarySerach()
 * 비교: equals(), deepEquals()
 * 데이터 변경: fill()
 * 복사: copyOf(), copyOfRange()
 * 변환: asList()
 * 해시코드: hashCode(), deepHashCode()
 * 문자열로 변환: toString()
 */

package d.util;

import java.util.Arrays;

public class ArraysTest {
	public static void main(String[] args) {
		ArraysTest obj = new ArraysTest();
		obj.chkSort();
		System.out.println("----------------------");
		obj.chkFill();
	}

	private void chkSort() {
		int[] values = new int[] {1,6,3,8,4,7,5,10,2,9};
		Arrays.sort(values);
		String stringValues = Arrays.toString(values);
		System.out.println(stringValues);
		System.out.println(stringValues.length());
		
	}
	
	public void chkFill() {
		int[] emptyArray = new int[10];
		Arrays.fill(emptyArray, 1);
		Arrays.fill(emptyArray, 0,3,9);
		String stringValues = Arrays.toString(emptyArray);	
		System.out.println(stringValues);
	}

}
