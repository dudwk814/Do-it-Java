package chapter12.collection.treeset;

import chapter12.collection.Member;

public class MemberTreeSetTest {

	public static void main(String[] args) {
		MemberTreeSet treeSet = new MemberTreeSet();
		
		Member memberPark = new Member(1003, "������");
		Member memberLee = new Member(1001, "������");
		Member memberSon = new Member(1002, "�����");
		
		treeSet.addMember(memberLee);
		treeSet.addMember(memberPark);
		treeSet.addMember(memberSon);
		treeSet.showAllMember();
		
		Member memberHong = new Member(1003, "ȫ�浿");
		treeSet.addMember(memberHong);
		treeSet.showAllMember();

	}

}
