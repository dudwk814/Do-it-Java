package chapter12.collection.arraylist;

import java.util.ArrayList;

import chapter12.collection.Member;

public class MemberArrayList {
	private ArrayList<Member> arrayList;
	
	public MemberArrayList() {
		arrayList = new ArrayList<Member>();
	}
	
	public void addMember(Member member) {
		arrayList.add(member);
	}
	
	public boolean removeMember(int memberId) {
		for(int i = 0; i < arrayList.size(); i++) {
			Member member = arrayList.get(i);	//get( ) 메서드로 회원을 순차적으로 가져옴
			int tempId = member.getMemberId();
			if(tempId == memberId) {
				arrayList.remove(i);	//매개변수로 받은 아이디와 같은 아이디를 찾은 경우 리스트에서 삭제
				return true;
			}
		}
		System.out.println(memberId + " 가 존재하지 않습니다.");	//반복문이 끝날 때까지 해당 아이디르르 찾지 못한 경우
		return false;
	}
	
	public void showAllMember() {	
		for(Member member : arrayList) {	//전체 멤버 정보를 출력
			System.out.println(member);
		}
		System.out.println();
	}
	
	public void insertMember(Member member, int index) {
		arrayList.add(index, member);
	}
}
