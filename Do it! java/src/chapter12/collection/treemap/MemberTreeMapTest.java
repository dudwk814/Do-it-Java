package chapter12.collection.treemap;

import chapter12.collection.Member;

public class MemberTreeMapTest {

	public static void main(String[] args) {
		MemberTreeMap memberTreeMap = new MemberTreeMap();
		Member memberLee = new Member(1001, "������");
		Member memberSon = new Member(1002, "�����");
		Member memberPark = new Member(1003, "������");
		Member memberHong = new Member(1004, "ȫ�浿");
		memberTreeMap.addMember(memberHong);
		memberTreeMap.addMember(memberLee);
		memberTreeMap.addMember(memberSon);
		memberTreeMap.addMember(memberPark);
		
		memberTreeMap.showAllMember();
		
		memberTreeMap.removeMember(1004);
		memberTreeMap.showAllMember();
	}

}
