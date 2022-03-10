package d.string;

public class StringTest {
	public static void main(String[] args) {
		
		StringTest obj = new StringTest();
		//obj.constructors();
		//obj.compareChk();
		//obj.equalChk();
		//obj.compareToChk();
		//obj.addressChk();
		//obj.matchChk();
		//obj.indexOfChk();
		//obj.copyValueOfChk();
		//obj.substringChk();
		//obj.splitChk();
		//obj.trimChk();
		//obj.formatChk();
		obj.valueOfChk();
		
		//System.out.println(obj.nullCheck(null));
	}

	private void constructors() {
		try {
			String str = "테스트";
			byte[] ary1 = str.getBytes();
			
			printByteAry(ary1);
			
			String str1 = new String(ary1);
			System.out.println(str1);
			
			//EUC-KR
			byte[] ary2 = str.getBytes();
			printByteAry(ary2);
			String str2 = new String(ary2,"EUC-KR");
			//String str2 = new String(ary2,"UTF-8");
			System.out.println(str2);
			
			//UTF-16 UnsupportedEncodingException
			byte[] ary3 = str.getBytes("UTF-16");
			printByteAry(ary3);
			String str3 = new String(ary3,"UTF-16");
			System.out.println(str3);			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	private void printByteAry(byte[] ary) {
		
		for(byte data: ary) {
			System.out.print(data + " ");
		}		
		System.out.println();		
	}

	public boolean nullCheck(String txt) {
		//int txtLen = txt.length();
		//System.out.println(txtLen);
		if(txt==null) return true;
		else return false;
		
	}
	
	public void compareChk() {
		//String txt = "This is String class test.";
		String txt = "";
		System.out.println("txt.length() = " + txt.length());
		System.out.println("txt.isEmpty() = " + txt.isEmpty());
	}
	
	public void equalChk() {
		String txt = "Check equal value";
		//String txt2 = "Check equal value";
		String txt2 = new String("Check equal value");
		String txt3 = "check equal value";
		
		if (txt == txt2) {
			System.out.println("txt == txt2 : same");
		} else {
			System.out.println("txt == txt2 : different");
		}
		
		if (txt.equals(txt2)) {
			System.out.println("txt.equals(txt2) : same");
		} else {
			System.out.println("txt.equals(txt2) : different");			
		}
		
		if(txt.equalsIgnoreCase(txt3)) {
			System.out.println("txt.equalsIgnoreCase(txt3) : same");
		} else {
			System.out.println("txt.equalsIgnoreCase(txt3) : different");			
		}
		
	}
	
	public void compareToChk() {
		String txt1 = "a";
		String txt2 = "b";
		String txt3 = "c";
		System.out.println(txt2.compareTo(txt1));  
		System.out.println(txt2.compareTo(txt3));  
		System.out.println(txt1.compareTo(txt3));  
	}
	
	public void addressChk() {
		String addrs[] = new String[] {"서울시 강남구 삼성동","경기도 성남시 분당구 정자동","서울시 구로구 개봉동"};
		int startCount =0, endCount=0;
		int containCount = 0;
		String startTxt = "서울시";
		String endTxt = "동";
		String containTxt = "분당";
		for (String addr: addrs) {
			if (addr.startsWith(startTxt)) startCount++;
			if (addr.endsWith(endTxt)) endCount++;
			if (addr.contains(containTxt)) containCount++;
		}
		
		System.out.println("startsWith " + startTxt + ":" + startCount);
		System.out.println("endsWith " + endTxt + ":" + endCount);
		System.out.println("contains " + containTxt + ":" + containCount);
	}
	
	public void matchChk() {
		String txt1 = "This is a text";
		String txt2 = "is";
		String txt3 = "this";
		
		System.out.println(txt1.regionMatches(2, txt2, 0, 1)); // 2:txt1의 index 2 --> i,   txt2, 0, 1 --> txt2의 index 0부터 1글자: i
		System.out.println(txt1.regionMatches(5, txt2, 0, 2));
		System.out.println(txt1.regionMatches(true,0, txt3, 0, 4));
	}
	
	public void indexOfChk() {
		String text = "In java substring returns a string that is a substring of this string";
		System.out.println(text.indexOf('a'));  //맨 앞에서 index위치  'a' 캐릭트 a  "a " 문자열
		System.out.println(text.indexOf("a "));
		System.out.println(text.indexOf('a',20));  //
		System.out.println(text.indexOf("a ",20));
		System.out.println(text.indexOf("w"));
		System.out.println("--------------------------");
		System.out.println(text.lastIndexOf('a'));  
		System.out.println(text.lastIndexOf("a "));
		System.out.println(text.lastIndexOf('a',20));  //
		System.out.println(text.lastIndexOf("a ",20));
		System.out.println(text.lastIndexOf("w"));
		System.out.println("--------------------------");
		
		System.out.println(text.charAt(text.indexOf('a')));
	
	}
	
	public void copyValueOfChk() {
		char values[] = new char[] {'a','b','c','d'};
		String text = String.copyValueOf(values);
		System.out.println(text);
	}
	
	public void substringChk() {
		String txt = "Java Project";
		String txt1 = txt.substring(5);
		System.out.println(txt1);
		String txt2 = txt.substring(5,8);
		System.out.println(txt2);
		
	}
	
	public void splitChk() {
		String text = "In java substring returns a string that is a substring of this string.";
		String[] splitArray = text.split(" ");
		for(String t: splitArray) {
			System.out.println(t);
		}
	}
	
	public void trimChk() {
		String strings[] = new String[] {"a","b ", "  c", "  d  ", "e   f","  "};
		for(String str:strings) {
			System.out.println("[" + str +"]");
			System.out.println("[" +str.trim() +"]");
		}
	}
	
	public void formatChk() {
		String fTxt = "이 대역은 %s 규격으로, 최대 %d Mbps, %f %% Ghz대를 이용함";
		//String txt = String.format(fTxt, "무선랜", 11, 2.4) ;
		//System.out.println(txt);
		System.out.format(fTxt, "무선랜", 11, 2.4) ;
	}
	
	public void valueOfChk() {
		byte b = 1;
		String byte1 = String.valueOf(b);
		String byte2 = b+ "";
		System.out.println(byte1);
		System.out.println(byte2);
	}
	
	
}