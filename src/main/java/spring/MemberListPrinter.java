package spring;

import java.util.Collection;

// DI 방식 1 - 생성자 방식. 생성자로 두 개의 파라미터를 전달받는 클래스. 한 클래스의 인스턴스를 만드는 생성자의 파라미터로 다른 클래스들의 인스턴스 생성자를 주입받아 의존관계 형성.
public class MemberListPrinter {
	
	private MemberDao memberDao;
	private MemberPrinter printer;
	
	// 생성자에 두 개의 파라미터를 전달받음. 
	public MemberListPrinter(MemberDao memberDao, MemberPrinter printer) {
		this.memberDao = memberDao;
		this.printer = printer;
	}
	
	public void printAll() {
		Collection<Member> members = memberDao.selectAll();
		members.forEach(m -> printer.print(m));
	}
}
