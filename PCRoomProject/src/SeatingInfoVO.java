
public class SeatingInfoVO {
	
	private String seatNum;
	private String currentTime;
	private String usingTime;
	
	public SeatingInfoVO() {
		super();
	}
	
	public SeatingInfoVO(String seatNum, String currntTime, String usingTime) {
		this.seatNum = seatNum;
		this.currentTime = currntTime;
		this.usingTime = usingTime;
	}

	public String getSeatNum() {
		return seatNum;
	}

	public void setSeatNum(String seatNum) {
		this.seatNum = seatNum;
	}

	public String getCurrentTime() {
		return currentTime;
	}

	public void setCurrentTime(String currentTime) {
		this.currentTime = currentTime;
	}

	public String getUsingTime() {
		return usingTime;
	}

	public void setUsingTime(String usingTime) {
		this.usingTime = usingTime;
	}

	@Override
	public String toString() {
		return "SeatingInfoVO [seatNum=" + seatNum + ", currentTime=" + currentTime + ", usingTime=" + usingTime + "]";
	}
	
}
