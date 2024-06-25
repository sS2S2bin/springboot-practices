package ex04;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import ex03.component.MyComponent;


/* @SpringBootApplication 메타 어노테이션
 * 
 * 
 * + @SpringBootConfiguration: ex) ex01,ex02
 * + @ComponentScan: 패키지 ex04를 포함, 하부 패키지를 스캔한다
 * + @EnableAutoConfiguration : 
 * 		1. MVC, AOP, Security, JPA 등을 자동으로 설정
 * 		2. 발견된 Starter Dependency(Library)기반으로 설정(관례를 따르는 default설정)
 * 		3. application.properties or application.yml 안
 * 		4. Spring boot의 며새 채랴
 * */
@SpringBootApplication
public class MyApplication {
	
	public static void main(String[] args) {
		try(ConfigurableApplicationContext ac = SpringApplication.run(MyApplication.class,args);){
			MyComponent myComponent = ac.getBean(MyComponent.class);
			System.out.println(myComponent);
		}
		
	}
}
