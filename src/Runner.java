import java.util.Scanner;

public class Runner {


    public static String propCar(Scanner sc, String str){
        String prop="";

        System.out.println(str);
        if (sc.hasNextLine()) {
            prop=sc.next();
        }
        return prop;

    }

    public static void main(String[] args)  {
        int fuel;
        String strBroke;
        boolean isBroke;

        Scanner sc=new Scanner(System.in);

        if ("да".equals(propCar(sc,"Audi исправна (да/нет) ?"))){
            isBroke=true;
        } else {isBroke=false;}
        fuel=Integer.parseInt(propCar(sc,"Введите сколько литров бензина в баке Audi:"));
        Audi audi = new Audi( "Audi",fuel, isBroke);

        if ("да".equals(propCar(sc,"KIA исправна (да/нет) ?"))){
            isBroke=true;
        } else {isBroke=false;}

        fuel=Integer.parseInt(propCar(sc,"Введите сколько литров бензина в баке KIA:"));
        KIA kia=new KIA("KIA",fuel,isBroke);

        if ("да".equals(propCar(sc,"Lada исправна (да/нет) ?"))){
            isBroke=true;
        } else {isBroke=false;}

        fuel=Integer.parseInt(propCar(sc,"Введите сколько литров бензина в баке Lada:"));
        Lada lada=new Lada("Lada",fuel,isBroke);


        Car[] garage=new Car[] {audi,kia,lada};

        for(Car car:garage ){
            System.out.println(car.getClass());

            try {
                car.stertEngine();
            } catch (CarException ex) {
                System.out.println(ex.getMessage());
            }

            try {
                System.out.println(car.getBrand()+" "+((glass)car).downGlass());
                System.out.println(car.getBrand()+" "+((glass)car).upGlass());
            } catch (ClassCastException ex) {
                System.out.println(car.getBrand()+" нет секлоподъемников");
            } finally {
                ((headlights) car).blink();
                ((headlights) car).turn_on();
                ((headlights) car).turn_off();
            }

        }

    }
}
