package wrx.rb.demo.aop;


import org.aopalliance.aop.Advice;
import org.springframework.aop.framework.ProxyFactory;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class ProxyFactoryDemo {


    public static void main(String[] args) {


        ProxyFactory factory = new ProxyFactory(new HelloBean());
        factory.addAdvice(new HelloInterceptor());
        HelloBean hello = (HelloBean) factory.getProxy();

        hello.say();


    }




    public static class HelloBean {
        public void say() {
            System.out.println("Hello World");
        }
    }


    public static class HelloInterceptor implements Advice, MethodInterceptor {

        @Override
        public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
            System.out.println("start");



            System.out.println("end");

            return o;
        }



    }




}
