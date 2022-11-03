import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Bap {
	int count = 0;
	String show = "";
	public Bap() {

//프레임
		JFrame fr = new JFrame("봡");
		fr.setResizable(false);
		//프레임 크기 정하기
		fr.setBounds(0, 0, 450, 800);
		//원하는 위치에 화면띄우기
		fr.setLocation(700,200);
		//프레임을 닫았을 때 프로그램이 종료되도록 설정
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		
// 배열(메뉴, 가격)
		//밥 메뉴 배열
		String menu[] = { "참치김치", "스팸김치", "치킨마요", "스팸마요", "새우볶음", "알밥냠냠" };
		//밥 가격 배열
		int price[] = { 3500, 4000, 4500, 5500, 6000, 6500 };
		JButton bt[] = new JButton[menu.length];
		//수량버튼
		JTextField suja[] = new JTextField[menu.length];
		//ok메뉴 
		JButton ok[] = new JButton[menu.length];
		//마이너스
		Button minus[] = new Button[menu.length];
		//플러스 
		Button plus[] = new Button[menu.length];
		//라벨 
		JLabel l[] = new JLabel[menu.length];


//메뉴 패널
		Panel p = new Panel();
		p.setLayout(null);
		p.setSize(400, 500);



//메뉴 버튼 생성
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

			//메뉴 패널에 버튼 부착
			p.add(bt[i]);
			p.add(suja[i]);
			p.add(minus[i]);
			p.add(plus[i]);
			p.add(l[i]);
			p.add(ok[i]);
		}
		//프레임에 메뉴 패널 부착
		fr.add(p, BorderLayout.NORTH);

		//주문내용 창 생성
		TextArea ta = new TextArea("",0, 0, TextArea.SCROLLBARS_VERTICAL_ONLY);
		ta.setText("   상품명        단가        수량        합계\n\n");
		ta.setBackground(Color.white);
		ta.setEditable(false);

		fr.add(ta, BorderLayout.CENTER);



		//아래쪽 패널 생성
		Panel pOrder = new Panel();
		pOrder.setSize(10,50);

		//아래쪽 주문버튼 제작
		JButton bt1 = new JButton("주문");
		JButton bt2 = new JButton("초기화");
		JButton bt3 = new JButton("이전");
		JButton bt4 = new JButton("닫기");
		//버튼 위치지정
		bt1.setLocation(10,10);
		bt2.setLocation(30,10);
		bt3.setLocation(60,10);
		bt4.setLocation(800,10);

		//패널에 주문버튼 부착 
		pOrder.add(bt1);
		pOrder.add(bt2);
		pOrder.add(bt3);
		pOrder.add(bt4);
		//프레임에 주문버튼 부착
		fr.add(pOrder,BorderLayout.SOUTH);



		//버튼 이벤트 생성
		//주문하기 버튼 
		bt1.addActionListener(new ActionListener() {
			
				
			@Override
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(null, ta.getText() + "\n" +"주문되었습니다.");
				for (int i = 0; i < menu.length; i++) {
					bt[i].setEnabled(true);
					minus[i].setEnabled(false);
					plus[i].setEnabled(false);
					suja[i].setText("0");
				}
			}	
			
		});


		//초기화 버튼
		bt2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				for (int i = 0; i < menu.length; i++) {
					bt[i].setEnabled(true);
					minus[i].setEnabled(false);
					plus[i].setEnabled(false);
					suja[i].setText("0");
					ta.setText("   상품명        단가        수량        합계\n\n");
				}				
			}
		});

		//이전 버튼
		bt3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new menu();
				fr.setVisible(false);	

			}


		});
		//뒤로가기 버튼
		bt4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});


		//버튼 작동

		for(int i=0; i < menu.length; i++) {
			int j  = i;

			//버거 버튼 작동
			bt[i].addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					minus[j].setEnabled(true);
					plus[j].setEnabled(true);
					bt[j].setEnabled(false);
					ok[j].setEnabled(true);

					count = 0;
				}

			});

			//- 버튼 작동
			minus[i].addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {

					if(count > 0) {
						count = count - 1;
						suja[j].setText(count + "");
						ok[j].setEnabled(true);
					} else {
						minus[j].setEnabled(false);
					}
				}
			});

			//+버튼 작동
			plus[i].addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {

					count = count + 1;
					suja[j].setText(count + "");
					ok[j].setEnabled(true);

					if(count > 0) {
						minus[j].setEnabled(true);
					}
				}
			});

			//확인 버튼 작동
			ok[i].addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					show = bt[j].getActionCommand();
					ta.append("  "+ show + "        " + price[j] + "               "+ count + "           " + price[j]*count + "원" + "\n");

					ok[j].setEnabled(false);
				}
			});



		}//for문 끝



		fr.setVisible(true);
	}
}
