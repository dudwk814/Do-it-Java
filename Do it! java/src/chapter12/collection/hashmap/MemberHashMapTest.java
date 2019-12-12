package chapter12.collection.hashmap;

import chapter12.collection.Member;

public class MemberHashMapTest {

	public static void main(String[] args) {
		MemberHashMap memberHashMap = new MemberHashMap();
		Member memberLee = new Member(1001, "ÀÌÁö¿ø");
		Member memberSon = new Member(1002, "¼ÕÈï¹Î");
		Member memberPark = new Member(1003, "¹ÚÂù¾ç");
		Member memberHong = new Member(1004, "È«±æµ¿");
		memberHashMap.addMember(memberHong);
		memberHashMap.addMember(memberLee);
		memberHashMap.addMember(memberSon);
		memberHashMap.addMember(memberPark);
		
		memberHashMap.showAllMember();
		
		memberHashMap.removeMember(1004);
		memberHashMap.showAllMember();
	}

}
