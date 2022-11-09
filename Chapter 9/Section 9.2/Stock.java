public class Stock {
    String symbol,name;
    double previousClosingPrice,currentPrice;

    Stock(String symbol,String name){
        this.symbol=symbol;
        this.name=name;

    }

    double getChangePercent(double previousClosingPrice,double currentPrice){
        this.previousClosingPrice=previousClosingPrice;
        this.currentPrice=currentPrice;
        return ((currentPrice-previousClosingPrice)/previousClosingPrice)*100;
    }

}
