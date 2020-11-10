public class TestPriceTwo implements Priceable{
    private int price;

    public TestPriceTwo(int price){
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