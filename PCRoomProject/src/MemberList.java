import java.util.ArrayList;

public class MemberList {
	
	private ArrayList<MemberVO> memberList;
	
	public MemberList() {
		super();
		this.memberList = new ArrayList<>();
	}
	
	public MemberList(MemberVO newMember) {
		super();
		this.memberList.add(newMember);
	}

	public ArrayList<MemberVO> getMemberList() {
		return memberList;
	}

	public void setMemberList(ArrayList<MemberVO> memberList) {
		this.memberList = memberList;
	}
	
	public void addMemberList(MemberVO newMember) {
		this.memberList.add(newMember);
	}

	@Override
	public String toString() {
		return "MemberList [memberList=" + memberList + "]";
	}
	
}
