package hello.core.singleton;

public class StatefulService {
    private int price; //状態を有事するフィルド

    public void order(String name, int price) {
        System.out.println("name = " + name + " price = " + price);
        this.price = price; //ここが問題！
    }

    public int getPrice() {
        return price;
    }
}
