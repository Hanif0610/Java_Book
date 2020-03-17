package map.treemap;

import collection.Member;

public class MemberTreeMapTest {
	public static void main(String[] args) {
		MemberTreeMap memberTreeMap = new MemberTreeMap();

		Member memberPark = new Member(1003, "�ڼ���");
		Member memberLee = new Member(1001, "������");
		Member memberHong = new Member(1004, "ȫ�浿");
		Member memberSon = new Member(1002, "�չα�");

		memberTreeMap.addMember(memberPark);
		memberTreeMap.addMember(memberLee);
		memberTreeMap.addMember(memberHong);
		memberTreeMap.addMember(memberSon);
		
		memberTreeMap.showAllMember();
		
		memberTreeMap.removeMember(1004);
		memberTreeMap.showAllMember();
	}
}
