package collection.arrraylist;

import java.util.ArrayList;
import java.util.Iterator;

import collection.Member;

public class MemberArrayList {
	private ArrayList<Member> arrayList;	//ArrayList 선언
	
	public MemberArrayList() {
		arrayList = new ArrayList<Member>();	//Member형으로 선언한 ArrayList 생성
	}
	
	public void addMember(Member member) {
		arrayList.add(member);
	}
	
	public boolean removeMember(int memberId) {
		Iterator<Member> ir = arrayList.iterator();	//Iterator 반환
		while(ir.hasNext()) {						//요소가 있는 동안
			Member member = ir.next();				//다음 회원을 반환 받음
			int tempId = member.getMemberId();
			if(tempId == memberId) {				//회원 아이디가 매개변수와 일치하면
				arrayList.remove(member);			//해당 회원 삭제
				return true;
			}
		}
		System.out.println(memberId + "가 존재하지 않습니다.");		//반복문이 끝날 때까지 아이를 찾지 못한 경우
		return false;
	}
	
	public void showAllMember() {
		for(Member member : arrayList) {
			System.out.println(member);
		}
		System.out.println();
	}
}
