package d.util;

import java.util.StringTokenizer;

public class StringTokenizerTest {
	public static void main(String[] args) {
		StringTokenizerTest obj = new StringTokenizerTest();
		String data = "This is a test";
		obj.parseStringWithSplit(data);
		System.out.println("-------------");
		obj.parseStringWithSplit2(data);
	}

	private void parseStringWithSplit(String data) {
		StringTokenizer st = new StringTokenizer(data, "s");
		while(st.hasMoreElements()) {
			String tmp = st.nextToken();
			System.out.println("[" + tmp + "]");
		}
		
	}
	
	public void parseStringWithSplit2(String data) {
		String[] splitString = data.split("\\s");
		for (String tmp: splitString) {
			System.out.println("[" + tmp + "]");
		}
		
	}
}
