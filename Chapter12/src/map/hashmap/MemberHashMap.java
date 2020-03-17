package map.hashmap;

import java.util.HashMap;
import java.util.Iterator;

import collection.Member;

public class MemberHashMap {
	private HashMap<Integer, Member> hashMap;
	
	public MemberHashMap() {
		hashMap = new HashMap<Integer, Member>();
	}
	
	public void addMember(Member member) {	//HashMap�� ȸ�� �߰�
		hashMap.put(member.getMemberId(), member);	//key-value ������ �߰�
	}
	
	public boolean removeMember(int memberId) {
		if(hashMap.containsKey(memberId)) {	//HashMap�� �Ű������� ���� Ű ���� ȸ�� ���̵� �ִٸ�
			hashMap.remove(memberId);
			return true;
		}
		System.out.println(memberId + "�� �������� �ʽ��ϴ�.");
		return false;
	}
	
	public void showAllMember() {
		Iterator<Integer> ir = hashMap.keySet().iterator();
		while(ir.hasNext()) {		//���� key�� ������
			int key = ir.next();	//key ���� �����ͼ�
			Member member = hashMap.get(key);	//key�κ��� value ��������
			System.out.println(member);
		}
		System.out.println();
	}
}
