package com.example.demo;

import com.example.demo.config.MyConfig;
import com.example.demo.entity.Pet;
import com.example.demo.entity.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext run = SpringApplication.run(DemoApplication.class, args);

		Pet tom01 = run.getBean("tom", Pet.class);
		Pet tom02 = run.getBean("tom", Pet.class);
		System.out.println("组件："+(tom01 == tom02));

		//4、com.atguigu.boot.config.MyConfig$$EnhancerBySpringCGLIB$$51f1e1ca@1654a892
		MyConfig bean = run.getBean(MyConfig.class);
		System.out.println(bean);

		//如果@Configuration(proxyBeanMethods = true)代理对象调用方法。SpringBoot总会检查这个组件是否在容器中有。
		//保持组件单实例
		User user = bean.user01();
		User user1 = bean.user01();
		System.out.println(user == user1);

//		User user01 = run.getBean("user01", User.class);
//		Pet tom = run.getBean("tom", Pet.class);
//
//		System.out.println("用户的宠物："+(user01.getPet() == tom));
	}

}
