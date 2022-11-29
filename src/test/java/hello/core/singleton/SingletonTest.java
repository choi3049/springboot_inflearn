package hello.core.singleton;

import hello.core.AppConfig;
import hello.core.member.MemberService;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class SingletonTest {
    @Test
    @DisplayName("springがない純粋なDIコンテナ")
    void pureContainer() {
        AppConfig appConfig = new AppConfig();

        //1. 照会：呼び出すたびにオブジェクトを生成
        MemberService memberService1 = appConfig.memberService();

        //2. 照会：呼び出すたびにオブジェクトを生成
        MemberService memberService2 = appConfig.memberService();

        //参照値が異なることを確認
        System.out.println("memberService1 = " + memberService1);
        System.out.println("memberService2 = " + memberService2);

        //memberService != memberService2
        assertThat(memberService1).isNotSameAs(memberService2);

    }

    @Test
    @DisplayName("singletonパターンを適用したオブジェクトの使用")
    void SingletonServiceTest() {
        SingletonService singletonService1 = SingletonService.getInstance();
        SingletonService singletonService2 = SingletonService.getInstance();

        System.out.println("singletonService1 = " + singletonService1);
        System.out.println("singletonService2 = " + singletonService2);

        assertThat(singletonService1).isSameAs(singletonService2);
    }
}
