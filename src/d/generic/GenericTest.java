package d.generic;

public class GenericTest {
	public static void main(String[] args) {
		GenericTest obj = new GenericTest();
		obj.chkCastingDTO();
	}

	private void chkCastingDTO() {
		CastingDTO dto1 = new CastingDTO();
		dto1.setObject(new String());
		
		CastingDTO dto2 = new CastingDTO();
		dto2.setObject(new StringBuffer());
		
		CastingDTO dto3 = new CastingDTO();
		dto3.setObject(new StringBuilder());
		
/*		
		String tmp1 =(String)dto1.getObject();
		StringBuffer tmp2 =(StringBuffer)dto2.getObject();
		StringBuilder tmp3 =(StringBuilder)dto3.getObject();
		
		Object tmpObject = dto2.getObject();
		if (tmpObject instanceof StringBuilder) {
			System.out.println("StringBuffer");
		} else if (tmpObject instanceof StringBuffer) {
			System.out.println("StringBuffer");
		}
*/		
		
	}
	
	private void chkGenericDTO() {
		CastingGenericDTO<String> d1 = new CastingGenericDTO<String>();
		d1.setObject(new String());
		
		CastingGenericDTO<StringBuffer> d2 = new CastingGenericDTO<StringBuffer>();
		d2.setObject(new StringBuffer());
		
		CastingGenericDTO<StringBuilder> d3 = new CastingGenericDTO<StringBuilder>();
		d3.setObject(new StringBuilder());
		
		String tmp1 = d1.getObject();
		StringBuffer tmp2 = d2.getObject();
		StringBuilder tmp3 = d3.getObject();

	}
}
