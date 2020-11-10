public class MainTest {
    public static void main(String[] args) {
        TestPriceOne testPriceOne = new TestPriceOne(321);
        TestPriceTwo testPriceTwo = new TestPriceTwo(123);

        System.out.println("Test1 price : " + testPriceOne.getPrice());
        System.out.println("Test2 price : " + testPriceTwo.getPrice());
    }
}