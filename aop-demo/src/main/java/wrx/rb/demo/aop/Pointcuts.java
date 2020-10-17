package wrx.rb.demo.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;


/**
 *
 * @Aspect 注解定义切面
 * @Component 定义的切面需要被扫描
 *
 */
@Aspect
@Component
public class Pointcuts {


    // 定义切点，wrx.rb.demo.aop.AopService这个类下面的所有的方法都是切点
    @Pointcut("execution(* wrx.rb.demo.aop.AopService.*(..))")
    public void logMessage(){

    }

    // 定义前置增强/通知，在执行切点方法之前，调用这个前置方法
    @Before("logMessage()")
    public void logBefore () {
        System.out.println("before 前置通知......");
    }

    /*@Pointcut("execution(* *Attachment(..))")
    public void logAttachment(){}

    @Pointcut("execution(* *Service.*(..))")
    public void auth(){}*/


}
