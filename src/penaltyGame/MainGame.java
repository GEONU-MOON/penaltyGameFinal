package penaltyGame;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainGame {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);	// 스캐너 클래스
		
		AwayGoalkeeper agk = new AwayGoalkeeper("Liverpool", "Alisson Becker");	// 원정팀 골키퍼 객체 생성
		HomeGoalkeeper hgk = new HomeGoalkeeper("Manchester United", "David DeGea");	// 홈팀 골키퍼 객체 생성
	    
		List<HomeKicker> homeKicker = new ArrayList<HomeKicker>();	// 홈팀 이름, 키커 순번, 키커 이름 할당
		homeKicker.add(new HomeKicker("Manchester United", "1번 키커", "Marcus Rashford"));
		homeKicker.add(new HomeKicker("Manchester United", "2번 키커", "Bruno Fernands"));
		homeKicker.add(new HomeKicker("Manchester United", "3번 키커", "Casemiro"));
		homeKicker.add(new HomeKicker("Manchester United", "4번 키커", "Christian Eriksen"));
		homeKicker.add(new HomeKicker("Manchester United", "5번 키커", "Antony"));
		
		List<AwayKicker> awayKicker = new ArrayList<AwayKicker>();	// 원정팀 이름, 키커 순번, 키커 이름 할당
		awayKicker.add(new AwayKicker("Liverpool", "1번 키커", "Mohamed Salah"));
		awayKicker.add(new AwayKicker("Liverpool", "2번 키커", "Cody Gakpo"));
		awayKicker.add(new AwayKicker("Liverpool", "3번 키커", "Darwin Núñez"));
		awayKicker.add(new AwayKicker("Liverpool", "4번 키커", "Jordan Henderson"));
		awayKicker.add(new AwayKicker("Liverpool", "5번 키커", "Virgil van Dijk"));
		
		int hWin = 0;	// 홈팀 득점
		int aWin = 0;	// 원정팀 득점
		
		System.out.println(hgk.getHometeam() + " 와 " + agk.getAwayteam() + "의 경기 시작합니다!");
		System.out.print("★★★경기 방법 ");
		System.out.println(">> 좌측, 우측, 중앙 중 하나를 입력하세요.★★★");
		System.out.println("------------------------------------");
		
		try {
			Thread.sleep(1000);	
		} catch (InterruptedException e) {
			e.printStackTrace();
		}	

		for(int i = 0; i<awayKicker.size(); i++) {
			int addirection = (int)(Math.random() * 3);	// 어웨이팀 골키퍼가 다이빙 뛸 방향을 0~2까지의 난수로
			int akdirection = (int)(Math.random() * 3);	// 어웨이팀 키커가 슛팅할 방향을 0~2까지의 난수로
			String[] arr = { "좌측", "중앙", "우측" };	// 난수를 배열을 통해 문자열로 설정

			System.out.println(homeKicker.get(i));
			System.out.print("슛팅할 방향 입력 >> ");
			String str1 = scanner.nextLine();	
			
			try {
				Thread.sleep(800);	
			} catch (InterruptedException e) {
				e.printStackTrace();
			}	
				
			if(str1.equals("좌측") || str1.equals("중앙") || str1.equals("우측") ) {
				if(str1.equals(arr[addirection])) {
					System.out.println("[" + homeKicker.get(i).getName() + "]" + " " + str1 + "으로 슛팅!");
					try {
						Thread.sleep(800);	
					} catch (InterruptedException e) {
						e.printStackTrace();
					}	// 공이 날아가는 시간 표현
		    		 System.out.println("골키퍼 " + arr[addirection] + "으로 뜁니다!");	
		    		 System.out.println("[" + agk.getGoalkeeper() + "]" + " 선방입니다!!");
		    		 hWin += 0;
				}else {
		    		 System.out.println("["+homeKicker.get(i).getName() + "]" + " " + str1 + "으로 슛팅!");
						try {
							Thread.sleep(800);	
						} catch (InterruptedException e) {
							e.printStackTrace();
						}	// 공이 날아가는 시간 표현
		    		 System.out.println("골키퍼 " + arr[addirection] + "으로 뜁니다!");
		    		 System.out.println("["+homeKicker.get(i).getName() + "]" + " 득점 성공합니다!");
		    		 hWin += 1;
				} 
			} else {
				System.out.println("멀리! 아주 멀리 날아갑니다~!");
				System.out.println("실축입니다.");
				hWin += 0;
			}
				
			System.out.println("------------------------------------");
				
			System.out.println(awayKicker.get(i) + " 준비 합니다.");
			System.out.print("키퍼가 다이빙할 방향 입력 >> ");
			String str2 = scanner.nextLine();
				
			if(str2.equals("좌측") || str2.equals("중앙") || str2.equals("우측") ) {
				if(str2.equals(arr[akdirection])) {
					System.out.println("[" + awayKicker.get(i).getName() + "]" + arr[akdirection] + "으로 슛팅!");
					try {
						Thread.sleep(800);	
					} catch (InterruptedException e) {
						e.printStackTrace();
					}	// 공이 날아가는 시간 표현
		    		System.out.println("골키퍼 " + str2 + "으로 뜁니다!");	
		    		System.out.println("[" + hgk.getGoalkeeper()+"]" + " 선방입니다!!");
		    		aWin += 0;
				}else {
					System.out.println("[" + awayKicker.get(i).getName() + "]" + arr[akdirection] + "으로 슛팅!");
					try {
						Thread.sleep(800);	
					} catch (InterruptedException e) {
						e.printStackTrace();
					}	// 공이 날아가는 시간 표현
					System.out.println("골키퍼 " + str2 + "으로 뜁니다!");
					System.out.println("[" + awayKicker.get(i).getName() + "]" + " 득점 성공합니다!");
					aWin += 1;
				} 
			}else {
				System.out.println("[" + awayKicker.get(i).getName() + "]" + " 득점 성공합니다!");
				aWin += 1;
			}
			System.out.println("------------------------------------");
		}
		
		if(hWin > aWin) {
			System.out.println(hgk.getHometeam() + " 가 승리를 가져갑니다!!");
		} else if(hWin == aWin){
			System.out.println("무승부 입니다.");
		} else {
			System.out.println(agk.getAwayteam() + " 이 승리를 가져갑니다...");
		}
	      
		System.out.println("---최종 스코어---");
		System.out.println(hgk.getHometeam() + " 득점 : " + hWin);
		System.out.println(agk.getAwayteam() + " 득점 : " + aWin);
		
	}

}
