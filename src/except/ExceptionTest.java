package except;

public class ExceptionTest {
	//public static void main(String[] args) throws Exception {
	public static void main(String[] args) {
		ExceptionTest test = new ExceptionTest();
		//test.arrayOutOfBound();
		//test.finallyMethod();
		//test.multiCatch();
		//test.throwable();
		
		try {
			//test.throwException(6);			
			test.throwException2(6);			
		} catch (NewException e) {
			e.printStackTrace();
		}
	}

	private void arrayOutOfBound() {
		int[] intArray = null;
		try {
			intArray = new int[3];
			System.out.println(intArray[9]);
			System.out.println("This is try part....");
		} catch (Exception e) {
			System.out.println("This is catch part....");
			System.out.println(intArray.length);
			
		}
		System.out.println("Next of try catch block....");
		
	}
	private void finallyMethod() {
		int[] intArray = null;
		try {
			intArray = new int[3];
			System.out.println(intArray[3]);
		} catch (Exception e) {
			System.out.println(intArray.length);
			
		} finally {
			System.out.println("Here is finally.");			
		}
		System.out.println("This code should run.");
		
	}
	
	private void multiCatch() {
		int[] intArray = new int[3];
		try {
			//intArray = null;
			System.out.println(intArray[0]);
			System.out.println(intArray[3]);
		} catch (NullPointerException ne) {
			System.out.println("NullPointerException");
		} catch (ArrayIndexOutOfBoundsException ae) {
			System.out.println("ArrayIndexOutOfBoundsException");
		} catch (Exception e) {
			System.out.println("Exception");	
		}		
	}
	
	public void throwable() {
		
		int[] intArray = new int[3];
		try {
			intArray = null;
			System.out.println(intArray[3]);			
		} catch (Throwable t) {
			t.printStackTrace();
			//System.out.println(t.getMessage());
			//System.out.println(t.toString());
		}
		
	}
	
	public void throwException(int number) throws Exception {
		//try {
			if (number > 5) {
				throw new Exception("Number is over then 5");
			}
			
			
		//} catch (Exception e) {
		//	e.printStackTrace();
		//}
	}
	
	
	public void throwException2(int number) throws NewException {
		try {
			if (number > 5) {
				throw new Exception("Number is over then 5");
			}
			
			
		} catch (Exception e) {
			//System.out.println("y");
			e.printStackTrace();
		}
	}	
}
