import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class SignIn extends JFrame{
	
	public SignIn() {
		//원하는 위치에 화면띄우기
        setLocation(700,200);
        //화면 사이즈 설정
        setSize(500,500);
        //타이틀
        setTitle("로그인");
        //화면 사이즈 고정
        setLayout(null);
        
        /* 아이디 */
        JLabel label = new JLabel("아이디 : ");
        label.setSize(80,30);
        label.setLocation(130,30);
        label.setHorizontalAlignment(JLabel.CENTER);
        this.add(label); //JFrame에 JLabel를 추가

        JTextField textFiled = new JTextField();
        textFiled.setSize(130,30);
        textFiled.setLocation(200,30);
        this.add(textFiled);//JFrame에 JTextField를 추가
        
        /* 비밀번호 */
        label = new JLabel("비밀번호 : ");
        label.setSize(80,30);
        label.setLocation(130,70);
        this.add(label);

        textFiled = new JTextField();
        textFiled.setSize(130,30);
        textFiled.setLocation(200,70);
        this.add(textFiled);
        
        /* 이름 */
        label = new JLabel("이름 : ");
        label.setSize(80,30);
        label.setLocation(155,110);
        this.add(label);

        textFiled = new JTextField();
        textFiled.setSize(130,30);
        textFiled.setLocation(200,110);
        this.add(textFiled);
        
        /* 전화번호 */
        label = new JLabel("전화번호 : ");
        label.setSize(80,30);    
        
        
        
        label.setLocation(130,150);
        this.add(label);

        textFiled = new JTextField();
        textFiled.setSize(130,30);
        textFiled.setLocation(200,150);
        this.add(textFiled);
        
		
		JButton join = new JButton("가입");
		join.setSize(70, 30);
		join.setLocation(350,400);
		
		this.add(join);

		join.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new Frame();
                setVisible(false);
			}
		});
		
		setVisible(true);
	}
	
	
}
