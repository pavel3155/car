public class KIA extends Car implements headlights,glass{

    public KIA(String brand, int fuel, boolean isBroke) {
        super(brand, fuel, isBroke);
    }

    @Override
    public void turn_on() {
        System.out.println("Фары KIA включены");
    }

    @Override
    public void turn_off() {
        System.out.println("Фары KIA выключены");
    }

    @Override
    public void blink() {
        System.out.println("KIA моргнула  фарами");
    }
}
