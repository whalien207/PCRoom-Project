import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

import javax.swing.JOptionPane;

/*
 * 좌석 정보를 가져와서.
 * 사용 시간이 다 되었다면 알람을 보내준다.
 * 알람을 보내준 후 ArrayList 에서 삭제.
 */

public class Timer extends Thread{

	public Timer() {
		Thread t1 = new Thread(this);
		t1.start();
	}

	@Override
	public void run() {

		while(true) {
			try {
				Thread.sleep(1000);
				
				ArrayList<SeatingInfoVO> cur_seatingInfo = Main.s.getSeatingInfo();
				for(int i = 0; i < cur_seatingInfo.size(); i++) {
					SeatingInfoVO seatinfo = cur_seatingInfo.get(i);
					String endTime = seatinfo.getUsingTime();

					if(getCurrentTime().equals(endTime)) {
						int usingSeatNum = Integer.parseInt(seatinfo.getSeatNum()) + 1;
						JOptionPane.showMessageDialog(null, usingSeatNum+"번 좌석 사용 시간이 끝났습니다.");
						Main.s.delSeatingInfo(i);
					}
				}

			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	/*현재 시간 받아오기*/
	public String getCurrentTime() {
		//시간 포맷 설정
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdformat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

		//현재 시간
		String currentTime = sdformat.format(cal.getTime());

		return currentTime;
	}

}
