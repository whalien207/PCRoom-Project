import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Panel;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Bap {

	public Bap() {
		JFrame fr = new JFrame("봡");
		//fr.setResizable(false);

		//프레임 크기 정하기
		fr.setBounds(0, 0, 500, 700);

		//원하는 위치에 화면띄우기
		fr.setLocation(700,200);

		//프레임을 닫았을 때 프로그램이 종료되도록 설정
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// 배열 설정 부분
		//밥 메뉴 배열
		String menu[] = { "참치김치", "스팸김치", "치킨마요", "스팸마요", "새우볶음밥", "알밥" };
		//밥 가격 배열
		int price[] = { 5000, 5500, 6000, 6500, 7000, 7500 };

		JButton bt[] = new JButton[menu.length];

		//수량버튼
		JTextField suja[] = new JTextField[menu.length];
		//ok메뉴 배열
		JButton ok[] = new JButton[menu.length];
		//마이너스 버튼 배열
		Button minus[] = new Button[menu.length];
		//플러스 버튼 배열
		Button plus[] = new Button[menu.length];
		//라벨 버튼 배열
		JLabel l[] = new JLabel[menu.length];


		//패널생성

		Panel p = new Panel();

		p.setLayout(null);
		p.setSize(500, 500);



		//버튼 생성
		for (int i = 0; i < menu.length; i++) {

			// 밥 버튼
			bt[i] = new JButton(menu[i]);
			if (i < 3) {
				bt[i].setBounds(20 + i * 150, 50, 100, 80);
			} else {
				bt[i].setBounds(20 + (i - 3) * 150, 300, 100, 80);
			}

			// 수량 숫자 버튼 
			suja[i] = new JTextField("0");
			suja[i].setBackground(Color.white);
			suja[i].setEditable(false);
			suja[i].setBounds(bt[i].getX() + 30, bt[i].getY() + 130, 40, 20);

			// "-" 버튼
			minus[i] = new Button("-");
			minus[i].setBounds(bt[i].getX(), suja[i].getY(), 20, 20);
			minus[i].setEnabled(false);

			// "+" 버튼
			plus[i] = new Button("+");
			plus[i].setBounds(bt[i].getX() + (100 - 20), suja[i].getY(), 20, 20);
			plus[i].setEnabled(false);

			// 가격
			l[i] = new JLabel(price[i] + "원");
			l[i].setBounds(bt[i].getX() + 20, suja[i].getY() - 25, 100, 20);

			// 확인 버튼
			ok[i] = new JButton("확인");
			ok[i].setBounds(bt[i].getX(), suja[i].getY() + 30, 100, 20);
			ok[i].setEnabled(false);


			p.add(bt[i]);
			p.add(suja[i]);
			p.add(minus[i]);
			p.add(plus[i]);
			p.add(l[i]);
			p.add(ok[i]);
		}

		fr.add(p, BorderLayout.NORTH);

		//아래 주문 버튼 생성
		Panel pOrder = new Panel();
		pOrder.setSize(10,50);
		
		
			
		Button bt1 = new Button("주문");
		Button bt2 = new Button("초기화");
		Button bt3 = new Button("닫기");

		bt1.setLocation(10,10);
		bt2.setLocation(20,10);
		bt3.setLocation(30,10);
		
		bt2.setSize(10,10);
		bt3.setSize(10,10);
	
		pOrder.add(bt1);
		pOrder.add(bt2);
		pOrder.add(bt2);
		
		fr.add(pOrder,BorderLayout.SOUTH);




		fr.setVisible(true);
	}
}
