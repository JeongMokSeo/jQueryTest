/*
 * MyPage 클래스, main()추가
 * input InputBox 클래스 변수추가
 * setUI() : 리턴값 없는 메서드
 *           input 객체를 초기화
 *           KeyEventListener 인터페이스 구현한 익명 클래스
 *             onKeyDown : "Key Down"출력
 *             onKeyUP   : "Key Up" 출력
 *           listener를 input객체의 setKeyListener()매개변수
 * pressKey() : InputBox 클래스에 선언된 listenerCalled()호출
 *              매개변수로 InputBox.KEY_DOWN , KEY_UP전달            
 */

package inner.homework;

public class MyPage {
	InputBox input;
	public static void main(String[] args) {
		MyPage page = new MyPage();
		page.setUI();
		page.pressKey();
	}
	
	public void setUI() {
		input = new InputBox();
		KeyEventListener listener = new KeyEventListener() {
			
			@Override
			public void onKeyUp() {
				System.out.println("Key Up");				
			}
			
			@Override
			public void onKeyDown() {
				System.out.println("Key Down");				
			}
		};
		input.setKeyListener(listener);
		
	}

	public void pressKey() {
		input.listenerCalled(InputBox.KEY_DOWN);
		input.listenerCalled(InputBox.KEY_UP);
	}
	
}
