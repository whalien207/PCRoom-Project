import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class SignIn extends JFrame{
	
	public SignIn() {
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
        
        /* 이름 */
        label = new JLabel("이름 : ");
        label.setSize(80,30);
        label.setLocation(155,110);
        this.add(label);

        JTextField name = new JTextField();
        name.setSize(130,30);
        name.setLocation(200,110);
        this.add(name);
        
        /* 전화번호 */
        label = new JLabel("전화번호 : ");
        label.setSize(80,30);    
        label.setLocation(130,150);
        this.add(label);

        JTextField phone = new JTextField();
        phone.setSize(130,30);
        phone.setLocation(200,150);
        this.add(phone);
        
        //가입버튼
		JButton join = new JButton("가입");
		join.setSize(70, 30);
		join.setLocation(350,400);
		this.add(join);

		//가입버튼 클릭 시 회원 정보 저장하고 main화면으로 돌아가기.
		join.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//가입시 멤버 추가
				
				//1. 텍스트필드에 입력한 정보 읽어오기.
				String newId = id.getText();
				String newPw = pw.getText();
				String newName = name.getText();
				String newPhone = phone.getText();
				
				//2. memberVO객체 생성.
				MemberVO newMember = new MemberVO(newId, newPw, newName, newPhone);
				Main.m.addMemberList(newMember);
				
				JOptionPane.showMessageDialog(null, "가입이 완료되었습니다.");
				
				//초기화면으로 돌아가기.
				new Frame();
                setVisible(false);
			}
		});
		
		setVisible(true);
	}
	
}
