package com.company;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext applicationContext=new AnnotationConfigApplicationContext(InjectRandomIntBeanPostProcessor.class,
                MyBean.class);

        MyBean bean = applicationContext.getBean(MyBean.class);
        System.out.println(bean.toString());
    }
}
