package kr.co.softsoldesk.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import kr.co.softsoldesk.beans.TestBean1;
import kr.co.softsoldesk.beans.TestBean2;
import kr.co.softsoldesk.beans2.TestBean4;

@Configuration
@ComponentScan(basePackages = "kr.co.softsoldesk.beans2") // basePackages에 있는 Component를 스캔하여 자동으로 등록
@ComponentScan(basePackages = "kr.co.softsoldesk.beans3")
//@ComponentScan(basePackages = "kr.co.softsoldesk")
public class BeanConfigClass {
	
	//Type
	@Bean
	public TestBean1 java1() {
		return new TestBean1();
	}
	//Name
	@Bean
	public TestBean2 java2() {
		return new TestBean2();
	}
	@Bean
	public TestBean2 java3() {
		return new TestBean2();
	}
	//Component 클래스를 이름으로 식별하여 여러개 주입할 경우
	@Bean
	public TestBean4 java100() {
		return new TestBean4();
	}
	@Bean
	public TestBean4 java200() {
		return new TestBean4();
	}
	
	
}
