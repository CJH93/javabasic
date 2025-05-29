package javaStudy.day11.lambda2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;

/*
 * Stream 의 ...sort() : 정렬 기능을 제공하는 스트림 메서드
 * 사용자 정의 객체(클래스)는 반드시 Comparable 을 구현한 클래스여야 정렬을 시킬 수 있음
 * 
 */

@AllArgsConstructor
@Data
class Player implements Comparable<Player> {
	
	private double wins_Rates;
	private String id;
	
	@Override
	public int compareTo(Player o) {
		return Integer.compare((int)(wins_Rates), (int)(o.wins_Rates));
	}
	
}

public class SortStreamEx {

	public static void main(String[] args) {
	
		ArrayList<Player> playerList = new ArrayList<Player>();
		playerList.add(new Player(34.3, "AA"));
		playerList.add(new Player(84.3, "BB"));
		playerList.add(new Player(24.1, "CC"));
		playerList.add(new Player(69.5, "DD"));
		
		playerList.stream()
			.sorted(Comparator.reverseOrder())
			.forEach(player -> System.out.println(player.getWins_Rates()));
		
		

	}

}
