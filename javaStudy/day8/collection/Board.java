package javaStudy.day8.collection;


import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Board implements Comparable<Board>{

	@Override
	public int compareTo(Board o) {
		if (o.num < this.num)
		{
			return 1;
		}
		else if(o.num > this.num)
		{
			return -1;
		}
		return 0;
	}

	private String subject; // 제목
	private String content;
	private String writer;
	private int num;
	
	
}
