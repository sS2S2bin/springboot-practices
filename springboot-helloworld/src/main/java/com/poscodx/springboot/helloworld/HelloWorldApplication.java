package com.poscodx.springboot.helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
/**
 * 스프링 애플리케이션의 부트스트래핑 역할 : Bootstrapping Class
 * 1. 어플리케이션 컨텍스트(Application COntext, Spring Container)생성
 * 2. 만약, 웹애플리케이션이면 웹애플리케이션 타입 결정(SpringMVC, Reactive) 
 * 3. 어노테이션 스캐 + configuration class 통해서 빈 생성/등록/와이어링 
 * 4. 만약 웹 어플리케이션이고 타입이 Spring MVC 이면
 * 	- 내장(embeded) 서버(TomcatEmbededServiceServletContainer) 인스턴스 생성
 * 	- 서버 인스턴스에 웹애플리케이션을 배포
 *  - 서버 인스턴스 실행
 * 5. ApplicationRunner 인터페이스를 구현한 빈을 Application Context에서 찾아
 */
@SpringBootApplication
public class HelloWorldApplication {

	public static void main(String[] args) {
//		ApplicationContext ac = null;
//		try {			
//		ac = SpringApplication.run(HelloWorldApplication.class,args);
//		}catch(Throwable ex){
//			
//		}finally {
//			((ConfigurableApplicationContext)ac).close();
//		}
		
		try(
				// 생성 코드 아님 jdbc코드 다 이래 
				ConfigurableApplicationContext ac = SpringApplication.run(HelloWorldApplication.class,args);
		){
			
		}
		

	}

}
