package Menu;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class menu extends JFrame {

	//화면 생성
	public menu(){
		setTitle("Menu");
		setSize(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane(); //컨텐트팬 - 어떤 위치에 컨포넌트를 추가하겠다
		c.setLayout(new FlowLayout()); //FlowLayout() 은 기본적인 창화면에다가 배치
		
		JButton j = new JButton("추가");
		JButton j2 = new JButton("결제");
		
		c.add(j);
		c.add(j2);
		
		setVisible(true);	
	}
	
	

	//화면 실행
	public static void main(String[] args) {
		new menu();
	}
}
