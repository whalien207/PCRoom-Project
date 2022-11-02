import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class LogIn extends JFrame {
	
	public LogIn() {
		//원하는 위치에 화면띄우기
        setLocation(700,200);
        //화면 사이즈 설정
        setSize(500,500);
        //타이틀
        setTitle("회원가입");
        //화면 사이즈 고정
        setLayout(null);
        
        /* 아이디 */
        JLabel label = new JLabel("아이디 : ");
        label.setSize(80,30);
        label.setLocation(130,30);
        label.setHorizontalAlignment(JLabel.CENTER);
        this.add(label); //JFrame에 JLabel를 추가

        JTextField id = new JTextField();
        id.setSize(130,30);
        id.setLocation(200,30);
        this.add(id);//JFrame에 JTextField를 추가
        
        /* 비밀번호 */
        label = new JLabel("비밀번호 : ");
        label.setSize(80,30);
        label.setLocation(130,70);
        this.add(label);

        JTextField pw = new JTextField();
        pw.setSize(130,30);
        pw.setLocation(200,70);
        this.add(pw);
        
        //로그인 버튼
		JButton login = new JButton("로그인");
		login.setSize(80, 30);
		login.setLocation(350,400);
		this.add(login);

		//가입버튼 클릭 시 회원 정보 저장하고 main화면으로 돌아가기.
		login.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
			
				//로그인 시도한 id와 pw를 읽어오기.
				String login_id = id.getText();
				String login_pw = pw.getText();
				
				//회원 리스트 가지고 오기.
				ArrayList<MemberVO> memberList = Main.m.getMemberList();
				
				//회원 리스트 확인
				for(int i = 0; i < memberList.size(); i++) {
					MemberVO member = memberList.get(i);
					
					//id와 pw가 일치하는 것이 있는지 확인.
					if(member.getId().equals(login_id) && member.getPw().equals(login_pw)) {
						JOptionPane.showMessageDialog(null, "회원입니다.");
						//회원 가격 페이지로 이동
						new Price(Main.memberPrice);
						setVisible(false);
					} else {
						JOptionPane.showMessageDialog(null, "정보가 없습니다. 비회원입니다.");
						//비회원 가격 페이지로 이동
						new Price(Main.nonMemberPrice);
						setVisible(false);
					}
				}
			}
		});
        
        setVisible(true);
	}

}
