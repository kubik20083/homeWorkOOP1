package data;
public class Drink {

    protected String drinkName;
    protected int value;

    public Drink(String drinkName, int value) {
        this.drinkName = drinkName;
        this.value = value;
    }

    public String getDrinkName() {
        return drinkName;
    }

    public void setDrinkName(String drinkName) {
        this.drinkName = drinkName;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Drink [drinkName=" + drinkName + ", value=" + value + "]";
    }

}
