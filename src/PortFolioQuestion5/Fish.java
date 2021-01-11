package PortFolioQuestion5;

public class Fish extends GameObject {

	public Fish(int x, int y, int distance) {
		super(x, y, distance);
	}
	
	@Override
	protected void move() {
//		5번 중 2번만 이동, 3번은 제자리
//		랜덤 숫자 0 ~ 4까지 발생
//		0일경우 + 방향, 1일경우 - 방향, 나머지는 정지
		int n = (int)(Math.random()*5);
		
		if (n == 0) {
			x += distance;
		}
		
		else if (n == 1) {
			x -= distance;
		}
		
		if ( x < 0 ) {
			x = 0;
		}
		
		if ( x >= Game.MAX_X) {
			x = Game.MAX_X -1;
		}
		
		n = (int)(Math.random()*5);
		if (n == 0) {
			y += distance;
		}
		
		else if (n == 1) {
			y -= distance;
		}
		
		if (y < 0 ) {
			y = 0;
		}
		
		if ( y >= Game.MAX_Y) {
			y = Game.MAX_Y-1;
		}

	}

	@Override
	protected char getShape() {
		return '@';
	}

}
	