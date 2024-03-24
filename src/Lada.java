public class Lada extends Car implements headlights{
    public Lada(String brand, int fuel, boolean isBroke) {
        super(brand, fuel, isBroke);
    }

    @Override
    public void turn_on() {
        System.out.println("Фары Lada включены");
    }

    @Override
    public void turn_off() {
        System.out.println("Фары Lada выключены");
    }

    @Override
    public void blink() {
        System.out.println("Lada моргнула фарами");
    }
}
