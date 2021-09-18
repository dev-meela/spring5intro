package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import spring.ChangePasswordService;
import spring.MemberDao;
import spring.MemberInfoPrinter;
import spring.MemberListPrinter;
import spring.MemberPrinter;
import spring.MemberRegisterService;
import spring.VersionPrinter;
/*
// 스프링을 사용하기 위해 스프링이 어떤 객체를 생성하고, 의존을 어떻게 주입할지를 정의한 설정 정보
@Configuration
public class AppCtx {

	@Bean  // 스프링 컨테이너는 @Bean이 붙은 메서드에 대해 한개의 객체만 생성함. 스프링 컨테이너가 생성한 빈은 싱글톤 객체임.  
	public MemberDao memberDao() {
		return new MemberDao();
	}
	
	@Bean
	public MemberRegisterService memberRegSvc() {
		return new MemberRegisterService(memberDao()); // *** 스프링 컨테이너가 생성한 빈은 싱글톤 객체이므로 다른 설정 메서드에서 몇번을 호출하더라도 항상 같은 객체를 리턴한다. ***
	}
	
	@Bean
	public ChangePasswordService changePwdSvc() {
		ChangePasswordService pwdSvc = new ChangePasswordService();
		pwdSvc.setMemberDao(memberDao());  // *** 스프링 컨테이너가 생성한 빈은 싱글톤 객체이므로 다른 설정 메서드에서 몇번을 호출하더라도 항상 같은 객체를 리턴한다. ***
		return pwdSvc;
	}
	
	@Bean
	public MemberPrinter memberPrinter() {
		return new MemberPrinter();
	}
	
	@Bean
	public MemberListPrinter listPrinter() {
		return new MemberListPrinter(memberDao(), memberPrinter());  // 생성자 방식으로 DI 주입하는 설정. 두 개 이상의 인자를 받는 생성자를 사용하는 경우
	}
	
	@Bean
	public MemberInfoPrinter infoPrinter() { // setter 메서드로 DI 주입하는 설정.
		MemberInfoPrinter infoPrinter = new MemberInfoPrinter();
		infoPrinter.setMemberDao(memberDao());
		infoPrinter.setPrinter(memberPrinter());
		return infoPrinter;
	}
	
	@Bean
	public VersionPrinter versionPrinter() {
		VersionPrinter versionPrinter = new VersionPrinter();
		versionPrinter.setMajorVersion(5);  // 기본 데이터 타입 값 설정 
		versionPrinter.setMinorVersion(0);
		return versionPrinter;
	}
}*/
