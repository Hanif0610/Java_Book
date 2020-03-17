package map.treemap;

import collection.Member;

public class MemberTreeMapTest {
	public static void main(String[] args) {
		MemberTreeMap memberTreeMap = new MemberTreeMap();

		Member memberPark = new Member(1003, "¹Ú¼­ÈÍ");
		Member memberLee = new Member(1001, "ÀÌÁö¿ø");
		Member memberHong = new Member(1004, "È«±æµ¿");
		Member memberSon = new Member(1002, "¼Õ¹Î±¹");

		memberTreeMap.addMember(memberPark);
		memberTreeMap.addMember(memberLee);
		memberTreeMap.addMember(memberHong);
		memberTreeMap.addMember(memberSon);
		
		memberTreeMap.showAllMember();
		
		memberTreeMap.removeMember(1004);
		memberTreeMap.showAllMember();
	}
}
