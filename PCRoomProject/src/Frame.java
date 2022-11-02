import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Frame extends JFrame{

	public Frame() {

		setLocation(700,200);    //내 화면의 가운데에 오게 위치값 잡아주기
		setSize(500, 500); //크기 설정
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("PC POP");
		setLayout(new FlowLayout()); //배치 관리자 설정

		//버튼만들기
		JButton signin = new JButton("회원가입");
		JButton login = new JButton("회원");
		JButton nonMember = new JButton("비회원");
		JButton store = new JButton("매점");

		//버튼 화면에 추가
		this.add(signin);
		this.add(login);
		this.add(nonMember);
		this.add(store);

		//회원가입 버튼 클릭시 이벤트 동작
		signin.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new SignIn();
				setVisible(false);
			}
		});

		//로그인 버튼 클릭시 이벤트 동작
		login.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new LogIn();
				setVisible(false);
			}
		});

		//비회원 버튼 클릭시 이벤트 동작
		nonMember.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new Price(Main.nonMemberPrice);
				setVisible(false);
			}
		});

		//매점 버튼 클릭시 이벤트 동작
		store.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//new menu();
				setVisible(false);
			}
		});

		setVisible(true);
	}

}
