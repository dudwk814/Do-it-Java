package chapter12.collection;

import java.util.Comparator;

public class Member2 implements Comparator<Member>{
	private int memberId;	//ȸ�� ���̵�
	private String memberName; //ȸ�� �̸�
	
	public Member2(int memberId, String memberName) {
		this.memberId = memberId;
		this.memberName = memberName;
	}

	public int getMemberId() {
		return memberId;
	}

	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	
	@Override
	public String toString() {
		return memberName + " ȸ������ �Ƶ�� " + memberId + "�Դϴ�.";
	}
	
	@Override
	public int hashCode() {
		return memberId;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member2) {
			Member2 member = (Member2)obj;
			if(this.memberId == member.memberId) {
				return true;
			} else {
				return false;
			}
		}
		return false;
	}


	@Override
	public int compare(Member mem1, Member mem2) {
		return (mem1.getMemberId() - mem2.getMemberId());
	}

}