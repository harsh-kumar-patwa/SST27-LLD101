package beverages_decorator;

public class Chocolate_Decorator extends Beverage {

    Beverage beverage;

    public Chocolate_Decorator(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public int cost() {
        return beverage.cost() + 100;
    }
    
}
