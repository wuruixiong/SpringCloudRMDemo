package wrx.rb.demo.postprocessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * 增加@Component注解，把MyBeanPostProcessor提交给IOC容器
 * 这样MyBeanPostProcessor就会参与遍历全部bean的过程
 *
 */
@Component
public class MyBeanPostProcessor implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if (bean instanceof Man) {
            System.out.println("get man in postProcessBeforeInitialization");

            ((Man)bean).tmp = ", insert string in postProcessBeforeInitialization";

            // 只处理bean，详细调用可以查看AbstractAutowireCapableBeanFactory里面的写法
            // 会把返回出去的bean作为最终结果进行返回
            return bean;
        }
        // 如果返回null，就相当于使用原先传进来的Object bean这个参数
        return null;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if (bean instanceof Man) {
            System.out.println("get man in postProcessAfterInitialization");
        }
        return null;
    }



}
