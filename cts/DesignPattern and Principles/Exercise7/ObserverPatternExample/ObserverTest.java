public class ObserverTest {


    public static void main(String[] args){


        StockMarket market = new StockMarket();


        Observer mobile = new MobileApp();

        Observer web = new WebApp();



        market.registerObserver(mobile);

        market.registerObserver(web);



        market.setStockPrice(150.5f);


        market.setStockPrice(170.0f);


    }

}