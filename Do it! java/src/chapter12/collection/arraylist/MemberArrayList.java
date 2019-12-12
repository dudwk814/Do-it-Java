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
			Member member = arrayList.get(i);	//get( ) �޼���� ȸ���� ���������� ������
			int tempId = member.getMemberId();
			if(tempId == memberId) {
				arrayList.remove(i);	//�Ű������� ���� ���̵�� ���� ���̵� ã�� ��� ����Ʈ���� ����
				return true;
			}
		}
		System.out.println(memberId + " �� �������� �ʽ��ϴ�.");	//�ݺ����� ���� ������ �ش� ���̵𸣸� ã�� ���� ���
		return false;
	}
	
	public void showAllMember() {	
		for(Member member : arrayList) {	//��ü ��� ������ ���
			System.out.println(member);
		}
		System.out.println();
	}
	
	public void insertMember(Member member, int index) {
		arrayList.add(index, member);
	}
}
