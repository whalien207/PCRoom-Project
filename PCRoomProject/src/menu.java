

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class menu extends JFrame {

	//화면 생성
	menu(){
		//화면 이름
		setTitle("Menu");
		
		// 프레임 크기
		setSize(500, 500);
		
		//원하는 위치에 화면띄우기
		setLocation(700,200);
 
		//프레임을 닫았을 때 프로그램이 종료되도록 설정
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		//메뉴 버튼 만들기
		JButton bap = new JButton("밥류");
		JButton ramen = new JButton("봉지라면");
		JButton snacks = new JButton("스낵");
		JButton drink = new JButton("음료");

		//버튼 화면에 추가
		c.add(bap);
		c.add(ramen);
		c.add(snacks);
		c.add(drink);	

		//밥 버튼 클릭시 이벤트 동작
		bap.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new Bap();
				setVisible(false);			
			}

		});
		setVisible(true);	
	}





}
