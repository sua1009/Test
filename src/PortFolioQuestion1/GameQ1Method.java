package PortFolioQuestion1;
import java.util.Scanner;

public class GameQ1Method {
	Scanner sc = new Scanner(System.in);
	String user1;
	String user2;
    	int num1;
    	int num2;
    	
	public void soo() {
		System.out.println("철수 >>");
		user1 = sc.next();
		
		switch (user1) {
		case "가위": 
			this.num1 = 1;
			break;
		
		case "바위": 
			this.num1 = 2;
			break;
			
		case "보": 
			this.num1 = 3;
			break;
			
		default :
			System.out.println("잘못입력하였습니다.");
			return;
		}
		
	}
		
	public void young() {
		System.out.println("영희 >>");
		user2 = sc.next();
		
		switch (user2) {
		case "가위": 
			this.num2 = 1;
			break;
		
		case "바위": 
			this.num2 = 2;
			break;
			
		case "보": 
			this.num2 = 3;
			break;
			
		default :
			System.out.println("잘못입력하였습니다.");
			return;	
		}	
	}
		
	public void printer() {
		if ((num1 == 1 && num2 == 1) || (num1 == 2 && num2 == 2) || (num1 == 3 && num2 == 3)) { 
			System.out.println("비겼습니다."); } 
	    else if ((num1 == 1 && num2 == 2) || (num1 == 2 && num2 == 3) || (num1 == 3 && num2 == 1)) {
			System.out.println("영희가 이겼습니다."); } 
	    else if ((num1 == 1 && num2 == 3) || (num1 == 2 && num2 == 1) || (num1 == 3 && num2 == 2)) {
			System.out.println("철수가 이겼습니다."); } 
	
		}
	
	
}
