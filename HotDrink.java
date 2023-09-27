public class HotDrink {

    
    protected String name;
    protected int coast;

    // public HotDrink(String name, int coast) {
    //     String namString;
    //     int coasti;
    // }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getCoast() {
        return coast;
    }
    public void setCoast(int coast) {
        this.coast = coast;
    }
    @Override
    public String toString() {
        return "HotDrink [name=" + name + ", coast=" + coast + "]";
    }

    
}
