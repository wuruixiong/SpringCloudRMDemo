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
        }
        // 这里不能返回空，要把原来的bean返回回去，会导致部分配置失效
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if (bean instanceof Man) {
            System.out.println("get man in postProcessAfterInitialization");
        }
        // 这里不能返回空，会导致部分配置失效
        return bean;
    }



}
