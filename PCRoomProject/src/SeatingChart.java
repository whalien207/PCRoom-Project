import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/*
 * 좌석관리 페이지
 * 좌석을 보여주고
 * 선택된 좌석은 비활성화하여 선택할 수 없도록한다.
 * 좌석 선택시 모든 정보를 저장하여 시간을 체크하도록 한다.
 */

public class SeatingChart extends JFrame{

	public SeatingChart(int usingTime) {
		setLocation(700,200);
		setSize(500,500);
		setTitle("좌석 선택");
		setLayout(new FlowLayout(0,40,40));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		//JButton west = new JButton("통로");
		//JButton east = new JButton("통로");
		JLabel exit = new JLabel("출구");
		exit.setFont(new Font("고딕", Font.ITALIC, 25));

		JButton[] btn = new JButton[25];
		int seatNum = 1;
		int index = 0;
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				
				//좌석 25개 배치
				btn[index] = new JButton();
				btn[index].setPreferredSize(new Dimension(50,30));
				btn[index].setText("<Html><center>"+seatNum+"</center><Html>");
				add(btn[index], BorderLayout.CENTER);
				
				//seating info정보 긁어와서 화면에서 사용중인 번호 색깔 변환해주기.
				ArrayList<SeatingInfoVO> cur_seatingInfo = Main.s.getSeatingInfo();
				
				for(int s = 0; s < cur_seatingInfo.size(); s++) {
					SeatingInfoVO info = cur_seatingInfo.get(s);
					
					//seatinginfo에 정보가 있으면 사용중인 자리로 재선택을 못하도록 처리
					int num = Integer.parseInt(info.getSeatNum());
					if(num == index) {
						btn[index].setEnabled(false);
					}
				}
				
				add(exit, BorderLayout.SOUTH);
				
				//버튼 클릭시 좌석 정보 저장.
				btn[index].addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						
						//선택한 버튼이 몇번째 버튼인지 찾기
						String select = "";
						for(int i = 0; i < 25; i++) {
							if(e.getActionCommand().equals(btn[i].getText())) {
								select = String.format("%d",i);
								Calendar cal = Calendar.getInstance();
								SimpleDateFormat sdformat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
								//현재 시간
								String currentTime = sdformat.format(cal.getTime());
								//이용이 끝나는 시간
								cal.add(Calendar.MINUTE, usingTime);
								String usingTime = sdformat.format(cal.getTime());
								
								/* 이용 시간을 5초로 선택하는 테스트 확인 코드*/
								/*
								cal.add(Calendar.SECOND, 5);
								String usingTime = sdformat.format(cal.getTime());
								*/
								
								SeatingInfoVO seatingInfo = new SeatingInfoVO(select, currentTime, usingTime);
								Main.s.addSeatingInfo(seatingInfo);
							}
						}
						new Frame();
						setVisible(false);
					}
				});
				seatNum++;
				index++;
			}
		}

		setVisible(true);
	}

}
