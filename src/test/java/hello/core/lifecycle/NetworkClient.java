package hello.core.lifecycle;

public class NetworkClient {

    private String url;

    public NetworkClient() {
        System.out.println("コンストラクター呼び出し, url = " + url);
        connect();
        call("初期化連結メッセージ");
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
}
