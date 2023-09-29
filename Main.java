/**
 * Main
 */
public class Main {

    /*
     * 1. Создать наследника реализованного класса ГорячийНапиток с дополнительным
     * полем int температура.
     * 2. Создать класс ГорячихНапитковАвтомат реализующий интерфейс ТорговыйАвтомат
     * и реализовать перегруженный метод getProduct(int name, int volume, int
     * temperature), выдающий продукт соответствующий имени, объёму и температуре
     * 3. В main проинициализировать несколько ГорячихНапитков и
     * ГорячихНапитковАвтомат и воспроизвести логику, заложенную в программе
     * 4. Всё вышеуказанное создать согласно принципам ООП, пройденным на семинаре
     */

    public static void main(String[] args) {

        Drink cappuccino = new HotDrink("cappuccino", 100, 60);
        Drink americano = new HotDrink("americano", 200, 90);
        Drink latte = new HotDrink("latte", 200, 70);

        HotDrinkVendMaschine maschine = new HotDrinkVendMaschine();

        // maschine.addDrink((HotDrink) cappuccino);
        // maschine.addDrink((HotDrink) americano);
        maschine.addDrink((HotDrink) latte);

        maschine.getProduct((HotDrink) cappuccino);
        maschine.getProduct((HotDrink) americano);
        maschine.getProduct((HotDrink) latte);

    }
}