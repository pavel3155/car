public class Car  {
    private String brand;
    private int fuel;
    private boolean isBroke;


    public Car(String brand, int fuel, boolean isBroke) {
        this.brand = brand;
        this.fuel = fuel;
        this.isBroke = isBroke;
    }

    public void stertEngine() throws CarException {
        String  strExp;
        if ((isBroke)){
            System.out.println(brand+ " машина исправна");
        }else {
            strExp=brand+" машина неисправна \n";
            if (fuel<2) {
                strExp= strExp+brand + " мало топлива";
            } else strExp=strExp+brand + " топлива достаточно";
            throw new CarException(strExp);
        }

        if (fuel<2) {
            throw new CarException(brand + " мало топлива");
        }

    }

    public String getBrand() {
        return brand;
    }
}
