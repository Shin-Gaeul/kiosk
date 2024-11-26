import java.util.ArrayList;
import java.util.List;

public class cart {
    private String name;
    private double price;
    private String explain;
    private List<cart> carts = new ArrayList<>();

    public cart (String name, double price, String explane) {
        this.name = name;
        this.price = price;
        this.explain = explane;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getExplane() {
        return explain;
    }

    @Override
    public String toString() {
        return name + " | " + price + " | " + (explain.isEmpty() ? "설명 없음" : explain);
    }


}
