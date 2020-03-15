package collection.arrraylist;

import java.util.ArrayList;
import java.util.Iterator;

import collection.Member;

public class MemberArrayList {
	private ArrayList<Member> arrayList;	//ArrayList ����
	
	public MemberArrayList() {
		arrayList = new ArrayList<Member>();	//Member������ ������ ArrayList ����
	}
	
	public void addMember(Member member) {
		arrayList.add(member);
	}
	
	public boolean removeMember(int memberId) {
		Iterator<Member> ir = arrayList.iterator();	//Iterator ��ȯ
		while(ir.hasNext()) {						//��Ұ� �ִ� ����
			Member member = ir.next();				//���� ȸ���� ��ȯ ����
			int tempId = member.getMemberId();
			if(tempId == memberId) {				//ȸ�� ���̵� �Ű������� ��ġ�ϸ�
				arrayList.remove(member);			//�ش� ȸ�� ����
				return true;
			}
		}
		System.out.println(memberId + "�� �������� �ʽ��ϴ�.");		//�ݺ����� ���� ������ ���̸� ã�� ���� ���
		return false;
	}
	
	public void showAllMember() {
		for(Member member : arrayList) {
			System.out.println(member);
		}
		System.out.println();
	}
}
