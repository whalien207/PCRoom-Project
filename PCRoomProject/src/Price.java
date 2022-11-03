import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/*
 * 가격페이지 
 * 가격리스트를 String 배열로 받아서
 * 화면에 보여준다.
 */

public class Price extends JFrame{

	public Price(String[] price) {
		setLocation(700,200);
		setSize(500,500);
		setTitle("가격");
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel panel = new JPanel();
		JButton[] btn = new JButton[6];

		GridLayout grid = new GridLayout(2, 3);
		panel.setLayout(grid);
 
		String[] priceList = {"40분","1시간 20분","2시간","4시간","8시간","종일권"};
		int[] usingTime = {40, 80, 120, 240, 480, 1440};
		String[] set_price = price;

		for (int i = 0; i < btn.length; i++) {
			btn[i] = new JButton();
			btn[i].setText("<Html><center>"+priceList[i]+"<br>"+set_price[i]+"</center></Html>");
			panel.add(btn[i]);

			btn[i].addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					//선택한 버튼이 몇번째 버튼인지 찾기
					int select = 0;
					for(int i = 0; i < btn.length; i++) {
						if(e.getActionCommand().equals(btn[i].getText())) {
							select = i;
						}
					}
					//몇분을 선택했는지 좌석선택시 선택한 시간을 함께 넘겨준다.
					new SeatingChart(usingTime[select]);
					setVisible(false);
				}
			});

		}

		setContentPane(panel);
		setVisible(true);
	}

}
