package javaStudy.day11.lambda2;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import lombok.AllArgsConstructor;
import lombok.Data;

/*
 * collect() : 이 메서드를 이용하면 스트림에서 처리된 요소를 담은
 * 새로운 collection 으로 되돌리도록 정의된 메서드
 */

@Data
@AllArgsConstructor
class BoardDTO {
	private String id;
	private String subject;
	private String content;
	
}

public class CollectExam {

	public static void main(String[] args) {
	
		List<BoardDTO> dtos = new ArrayList<BoardDTO>();
		
		dtos.add(new BoardDTO("st1", "자바 언제 끝남?", "30일에 끝남?"));
		dtos.add(new BoardDTO("te", "30일에 끝나요", "아마도 30일에 끝날거예요"));
		dtos.add(new BoardDTO("st2", "자바 다시 안해줌?", "너무 어려워"));
		dtos.add(new BoardDTO("te2", "못해줌", "다른거 하느라 바쁨"));
		
		List<BoardDTO> collectionList = dtos.stream()
			.filter(dto -> dto.getId().equals("te"))
			.collect(Collectors.toList());
		
		collectionList.stream()
			.forEach(t -> System.out.println(t));
		
		System.out.println();
		
		Map<String, String> map = dtos.stream()
			.filter(dto -> dto.getId().equals("te"))
			.collect(Collectors.toMap(dto -> dto.getId(), dto -> dto.getSubject()));
		
		
		
	}

}
