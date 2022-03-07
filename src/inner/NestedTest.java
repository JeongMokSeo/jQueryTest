package inner;

public class NestedTest {

	public static void main(String[] args) {
		NestedTest nt = new NestedTest();
		nt.makeStaticNestedObject();
		nt.makeInnerObject();
		nt.setButtonListener();
	}

	private void makeStaticNestedObject() {
		OuterOfStatic.StaticNested staticNested = new OuterOfStatic.StaticNested();  //inner클래스 생성자 호출해서 생성
		staticNested.setValue(7);
		System.out.println(staticNested.getValue());
		
	}
	private void makeInnerObject() {
		OuterOfInner outer = new OuterOfInner();
		OuterOfInner.Inner inner = outer.new Inner();  //캡슐화
		
		inner.setValue(10);
		System.out.println(inner.getValue());
		
	}
	
	public void setButtonListener() {
		AutoBtn button = new AutoBtn();
		
		//AutoBtnListener listener = new AutoBtnListener();
		//button.setListener(listener);
		//button.onClickProcess();
		
		//button.setListener(new EventListener() {
		//	public void OnClick() {     //익명클래스
		//		System.out.println("Auto Button Clicked");
		//	}
		//});
		//button.onClickProcess();
		
		EventListener listener = new EventListener() {
			public void OnClick() {
				System.out.println("Auto Button Clicked");
			}
		};
		button.setListener(listener);
		button.onClickProcess();
	}

	
	class AutoBtnListener implements EventListener {
		public void OnClick() {
			System.out.println("Auto Button Clicked");
		}
	}
}
