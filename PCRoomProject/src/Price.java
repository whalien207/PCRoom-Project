import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Price extends JFrame{
	
	public Price(String[] price) {
        setLocation(700,200);
        setSize(500,500);
        setTitle("가격");
        setLayout(null);
        
        JPanel panel = new JPanel();
        JButton[] btn = new JButton[6];
        
        GridLayout grid = new GridLayout(2, 3);
        panel.setLayout(grid);

        String[] priceList = {"40분","1시간 20분","2시간","4시간","8시간","종일권"};
        String[] set_price = price;
        
        for (int i = 0; i < btn.length; i++) {
        	btn[i] = new JButton();
        	btn[i].setText("<Html><center>"+priceList[i]+"<br>"+set_price[i]+"</center></Html>");
            panel.add(btn[i]);
        }

        panel.add(btn[0]);
        panel.add(btn[1]);
        panel.add(btn[2]);
        panel.add(btn[3]);
        panel.add(btn[4]);
        panel.add(btn[5]);

        setContentPane(panel);
        setVisible(true);
	}

}
