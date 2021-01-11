package PortFolioQuestion5;
/*
 이 게임에는 Bear와 Fish 객체가 등장하며, 이들은 10행 20열의 격자판에서 각각 정해진 규칙에 의해
움직인다. Bear는 사용자의 키에 의해 왼쪽(a 키), 아래(s 키), 위(w 키), 오른쪽(d 키)으로 한 칸씩
움직이고, Fish는 다섯번 중 세번은 제자리에 있고, 나머지 두 번은 4가지 방향 중 한 칸씩 랜덤하게
움직인다. 게임은 Bear가 Fish를 먹으면 (Fish의 자리로 이동) 성공으로 끝난다. 다음은 각 객체의
이동을 정의하는 move()와 각 객체의 모양을 정의하는 getShape()을 추상 메소드로 가진 추상 클래스
GameObject 이다. GameObject를 상속받아 Bear와 Fish 클래스를 작성하라. 그리고 전체적인 게임을
진행하는 Game 클래스와 main() 함수를 작성하고 프로그램을 완성하시오 
*/

public abstract class GameObject {
	protected int distance; // 한번 이동 거리
	protected int x;
	protected int y;
	
//	초기 위치와 이동거리 설정 
	public GameObject( int startX, int startY, int distance) {
		this.x = startX;
		this.y = startY;
		this.distance = distance;
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
//	Bear와 Fish가 충돌하는지 확인하는 메서드
//	충돌 시 true, 아니면 false
	public boolean collide(GameObject p) {
		if (this.x == p.getX() && this.y == p.getY()) {
			return true;
		}
		else {
			return false;
		}
	}
	
//	이동한 후의 새로운 위치로 x, y 변경
	protected abstract void move();
//	객체의 모양을 나타내는 문자 리턴
	protected abstract char getShape();
}
