import java.util.ArrayList;
import java.util.Date;

public class SeatingInfo {
	
	//좌석 사용 정보 저장 list (좌석 번호 저장)
	private ArrayList<SeatingInfoVO> seatingInfo;
	
	public SeatingInfo() {
		super();
		this.seatingInfo = new ArrayList<>();
	}

	public SeatingInfo(SeatingInfoVO seatingInfo) {
		super();
		this.seatingInfo.add(seatingInfo);
	}

	public ArrayList<SeatingInfoVO> getSeatingInfo() {
		return seatingInfo;
	}

	public void setSeatingInfo(ArrayList<SeatingInfoVO> seatingInfo) {
		this.seatingInfo = seatingInfo;
	}
	
	public void addSeatingInfo(SeatingInfoVO seatingInfo) {
		this.seatingInfo.add(seatingInfo);
	}
	
	public void delSeatingInfo(int index) {
		this.seatingInfo.remove(index);
	}

	@Override
	public String toString() {
		return "SeatingInfo [seatingInfo=" + seatingInfo + "]";
	}
	
}
