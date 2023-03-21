package spring.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring.controller.UserController;
import spring.dao.UserDao;
import spring.dao.impl.UserDaoImpl;
import spring.service.UserService;
import spring.service.imp.UserServiceImpl;

public class IOCByAnnotationTest {
    @Test
    public void test() {
        ApplicationContext ioc=new ClassPathXmlApplicationContext("spring-ioc-annotation.xml");
        UserController userController=ioc.getBean("userController",UserController.class);
        System.out.println(userController);
        UserService userService=ioc.getBean("userServiceImpl",UserService.class);
        System.out.println(userService);
        UserDao userDao =ioc.getBean( "userDaoImpl",UserDao.class);
        System.out.println(userDao);
        }
        @Test
    public void testAutoWired() {
        ApplicationContext ioc=new ClassPathXmlApplicationContext("spring-ioc-annotation.xml");
        UserController userController=ioc.getBean("userController",UserController.class);
        userController.saveUser();
    }
    }
