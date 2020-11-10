public class TestPriceOne  implements Priceable{
    private int price;

    public TestPriceOne(int price){
        this.price = price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public int getPrice() {
        return price;
    }
}