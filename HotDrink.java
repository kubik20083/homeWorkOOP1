public class HotDrink extends Drink {

    private int temperature;

    public HotDrink(String drinkName, int value, int temperature) {
        super(drinkName, value);
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return String.format("Напиток " + drinkName + " объём " + value + " темпиратура " + temperature);
    }

}
