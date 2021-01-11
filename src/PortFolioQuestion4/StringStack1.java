package PortFolioQuestion4;

// stack이란 ? 
/* 
 * 데이터를 한쪽 끝에서만 자료를 넣거나 뺄 수 있는 선형구조로 되어있다. 자료를 넣는 것을 (push)라고하며
 * 빼는 것을 팝(pop)이라고 하고, 꺼내지는 자료는 가장 최근에 푸쉬한 자료부터 나오게 된다.
 * 이처럼 나중에 넣은 값이 먼저 나오는 것을 LIFO 구조라고 한다.
 * */

/*
 자바에서는 스택 자료구조가 존재하지 않음 
 배열을 가지고 스택 자료구조를 만들어서 사용해야 함 
 스택 자료구조를 배열을 가지고 만들어서 하용할 수 있음 
*/
public class StringStack1 implements Stack1 {

	private String[] arrStack; //스택을 구현할 배열
	private int top; // 데이터가 저장될 위치
	
	public StringStack1(int capacity) {
		arrStack = new String[capacity];
		top = -1;  //top을 출력시 -1이면 비어있음 
	}
	
//	스택에 저장된 데이터의 개수
	@Override
	public int length() {
		return top+1;  //top의 기본값을 -1로 줬기 때문에 저장된 데이터 수를 출력시 +1을 해줌
	}

//	스택에 저장할 수 있는 데이터의 개수
	@Override
	public int capacity() {
		return arrStack.length;
	}

//	스택에 저장된 데이터를 출력
	@Override
	public String pop() {
//		top을 확인 후 크기가 -1이 아닐경우 top의 위치에서 데이터 출력
		if(top == -1) {
			return null;
		}
		String item = arrStack[top];
		top--;
		return item;
		
	}

//	스택에 데이터를 저장
	@Override
	public boolean push(String val) {
		if (top == arrStack.length -1) {
			return false;
		}
		else {
			top ++;
			arrStack[top] = val;
			return true;
			
		}
		
	}

}
