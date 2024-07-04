package com.shreyans.spring_boot_complete;

import com.shreyans.spring_boot_complete.model.MyClass;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootCompleteApplication {

	public static void main(String[] args) {
		var ctx= SpringApplication.run(SpringBootCompleteApplication.class, args);
		MyClass myObj= ctx.getBean("myClass",MyClass.class);
//		MyClass myObj= ctx.getBean("privateMyClass",MyClass.class);
//		MyClass myObj= ctx.getBean("CustomName",MyClass.class);

		myObj.callMe();
	}

}
