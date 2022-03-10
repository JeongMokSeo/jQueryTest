package d.generic;

import java.io.Serializable;

public class CastingGenericDTO<T> implements Serializable {
	private T object;
	
	public T getObject() {
		return object;
	}

	public void setObject(T object) {
		this.object = object;
	}
	
}

// 제네릭타입이름
// E 에리먼트  요소
// K 키 key 
// N 숫자 number
// V 값 value
// T 타입 (첫번째)
// S 타입 (두번째)
// U 타입 (세번째)