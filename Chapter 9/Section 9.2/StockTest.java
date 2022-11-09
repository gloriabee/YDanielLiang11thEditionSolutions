public class StockTest {
    public static void main(String[] args) {
        Stock s1=new Stock("ORCL", "Oracle Corporation");
        // System.out.println("The price-change percentage is "+s1.getChangePercent(34.5,34.35)+"%");
        System.out.println("Stock name: "+s1.name);
        System.out.println("Stock symbol:"+s1.symbol);
        System.out.printf("Price-change percentage: %.2f%%\n",s1.getChangePercent(34.5, 34.35));

}
}
