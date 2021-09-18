package config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import spring.ChangePasswordService;
import spring.MemberDao;
import spring.MemberInfoPrinter;
import spring.MemberListPrinter;
import spring.MemberPrinter;
import spring.MemberRegisterService;
import spring.VersionPrinter;

@Configuration
public class AppConf2 {
	
	@Autowired
	private MemberDao memberDao;
	@Autowired
	private MemberPrinter memberPrinter;
	
	@Bean
	public MemberRegisterService memberRegSvc() {
		return new MemberRegisterService(memberDao);
	}
	
	@Bean
	public ChangePasswordService changePwdSvc() {
		ChangePasswordService pwdSvc = new ChangePasswordService();
		pwdSvc.setMemberDao(memberDao);  // *** 스프링 컨테이너가 생성한 빈은 싱글톤 객체이므로 다른 설정 메서드에서 몇번을 호출하더라도 항상 같은 객체를 리턴한다. ***
		return pwdSvc;
	}
	
	@Bean
	public MemberListPrinter listPrinter() {
		return new MemberListPrinter(memberDao, memberPrinter);  // 생성자 방식으로 DI 주입하는 설정. 두 개 이상의 인자를 받는 생성자를 사용하는 경우
	}
	
	@Bean
	public MemberInfoPrinter infoPrinter() { // setter 메서드로 DI 주입하는 설정.
		MemberInfoPrinter infoPrinter = new MemberInfoPrinter();
		//infoPrinter.setMemberDao(memberDao); @Autowired를 붙이고 생략
		//infoPrinter.setPrinter(memberPrinter);
		return infoPrinter;
	}
	
	@Bean
	public VersionPrinter versionPrinter() {
		VersionPrinter versionPrinter = new VersionPrinter();
		versionPrinter.setMajorVersion(5);  // 기본 데이터 타입 값 설정 
		versionPrinter.setMinorVersion(0);
		return versionPrinter;
	}
}
