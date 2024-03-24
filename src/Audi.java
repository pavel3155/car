public class Audi extends Car implements headlights,glass {

    public Audi(String brand, int fuel, boolean isBroke) {
        super(brand, fuel, isBroke);
    }

    @Override
    public void turn_on() {
        System.out.println("Фары Audi включены");
    }

    @Override
    public void turn_off() {
        System.out.println("Фары Audi выключены");
    }

    @Override
    public void blink() {
        System.out.println("Audi моргнула фарами");
    }
}
