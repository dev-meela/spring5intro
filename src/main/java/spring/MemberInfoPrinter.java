package spring;

import org.springframework.beans.factory.annotation.Autowired;

// DI 방식2- 세터 메서드 방식. 한 클래스의 인스턴스가 갖게되는 변수에 대한 세터 메서드의 파라미터로 다른 클래스의 객체(인스턴스?)를 주입받아서 주입받은 클래스의 인스턴스가 다른 클래스의 인스턴스를 사용하게되는 의존관계를 형성.
public class MemberInfoPrinter {
	
	@Autowired
	private MemberDao memDao;
	@Autowired
	private MemberPrinter printer;
	
	public void printMemberInfo(String email) {
		Member member = memDao.selectByEmail(email);
		if (member == null) {
			System.out.println("데이터 없음\n");
			return; 
		}
		printer.print(member);
		System.out.println();
	}
	/* @Autowired 이후 생략 
	// 세터 메서드에서 의존객체를 주입
	public void setMemberDao(MemberDao memberDao) {
		this.memDao = memberDao;
	}
	
	public void setPrinter(MemberPrinter printer) {
		this.printer = printer;
	}
	*/
}
