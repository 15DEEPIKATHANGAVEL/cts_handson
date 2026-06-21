import java.util.*;

public class StockMarket implements Stock {


    private List<Observer> observers = new ArrayList<>();

    private float stockPrice;


    public void registerObserver(Observer observer){

        observers.add(observer);

    }


    public void removeObserver(Observer observer){

        observers.remove(observer);

    }


    public void notifyObservers(){

        for(Observer observer : observers){

            observer.update(stockPrice);

        }

    }


    public void setStockPrice(float price){

        this.stockPrice = price;

        notifyObservers();

    }


}