
public class Main {
	
	//고정 값.(상수 설정) - 회원가, 비회원가 지정.
	public static final String[] nonMemberPrice = {"2000","4000","6000","8000","10000","15000"};
	public static final String[] memberPrice = {"1000","2000","4000","6000","8000","10000"};
	
	//회원 가입정보와 좌석 사용 정보를 저장.
	public static MemberList m = new MemberList();
	public static SeatingInfo s = new SeatingInfo();

	public static void main(String[] args) {
		//메인 프레임 화면 출력
		new Frame();
		//타이머 동작 - 사용 시간이 만료되었는지 체크
		new Timer();
	}
	
}
