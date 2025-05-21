package javaStudy.day5.nestedClassEx;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyActionListener implements ActionListener {
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("클릭했냐??");
		
	}
}

public class MyGUI {

	public static void main(String[] args) {
		
		Frame f = new Frame("이건 프레임");
		Button btn = new Button("hi~");
		
//		btn.addActionListener(new MyActionListener());
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
				
			}
		});
		f.setSize(300, 300);
		f.setLocation(200, 200);
		f.add(btn);
		
		f.setVisible(true);
		
		

	}

}
