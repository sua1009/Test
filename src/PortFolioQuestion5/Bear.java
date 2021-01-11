package PortFolioQuestion5;
import java.util.Scanner;

public class Bear extends GameObject {

	public Bear(int startX, int startY, int distance) {
		super(startX, startY, distance);
	}

	@Override
	protected void move() {
		System.out.println("상(w), 하(s), 좌(a), 우(d)를 입력하세요 ");
		Scanner sc = new Scanner(System.in);
		
		char input = sc.next().charAt(0);
		
		switch (input) {
		case 'a' : // 왼쪽 
			x --;
			if ( x < 0 ) {
				x = 0;
			}
			break;
			
		case 's' :  // 아래
			y ++;
			if ( y >= Game.MAX_Y) {
				y = Game.MAX_Y -1;
			}
			break;
		
		case 'd' :  // 오른쪽
			x ++;
			if ( x >= Game.MAX_X) {
				x = Game.MAX_X;
			}
			break;
			
		case 'w' :  //위 
			y --;
			if ( y < 0) {
				y = 0;
			}
			break;
			
		default :
			System.out.println(" 잘못 입력하셨습니다. 다시입력해주세요 ");
			System.out.println("상(w), 하(s), 좌(a), 우(d)를 입력하세요 ");
		}

	}

	@Override
	protected char getShape() {
		return 'B';
	}

}
