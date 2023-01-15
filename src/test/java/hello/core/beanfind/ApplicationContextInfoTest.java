package hello.core.beanfind;

import hello.core.AppConfig;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.lang.reflect.AnnotatedArrayType;

public class ApplicationContextInfoTest {

    // 스프링 컨테이너 생성
    AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);

    // 모든 빈 출력
    @Test
    @DisplayName("全てのbean出力") // 테스트 이름 설정 가능
    void findAllBean() {
        String[] beanDefinitionNames = ac.getBeanDefinitionNames(); // 스프링에 등록된 모든 빈 이름을 조회
        for (String beanDefinitionName : beanDefinitionNames) {
            Object bean = ac.getBean(beanDefinitionName); // 빈 이름으로 빈 객체를 조회
            System.out.println("name = " + beanDefinitionName + " Object = " + bean);
        }
    }

    @Test
    @DisplayName("アプリケーションbean出力")
    void findApplicationBean() {
        String[] beanDefinitionNames = ac.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            BeanDefinition beanDefinition = ac.getBeanDefinition(beanDefinitionName);

            /*
            * ROLE_APPLICATION : 일반적으로 사용자가 정의한 빈
            * ROLE_INFRASTRUCTURE : 스프링이 내부에서 사용하는 빈
            * */
            if (beanDefinition.getRole() == BeanDefinition.ROLE_APPLICATION) {
                Object bean = ac.getBean(beanDefinitionName);
                System.out.println("name = " + beanDefinitionName + " Object = " + bean);
            }
        }
    }

}
