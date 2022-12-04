package hello.core.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class NetworkClient implements InitializingBean, DisposableBean {

    private String url;

    public NetworkClient() {
        System.out.println("コンストラクター呼び出し, url = " + url);

    }

    public void setUrl(String url) {
        this.url = url;
    }

    //サービス開始の時呼び出し
    public  void connect() {
        System.out.println("connect: " + url);
    }

    public void call(String message) {
        System.out.println("call: " + url + " message = " + message);
    }

    //サービス終了の時呼び出し
    public void disconnect() {
        System.out.println("close: " + url);
    }

    @Override
    public void afterPropertiesSet() throws Exception{
        System.out.println("NetworkClient.afterPropertiesSet");
        connect();
        call("初期化連結メッセージ");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("NetworkClient.destroy");
        disconnect();
    }
}
