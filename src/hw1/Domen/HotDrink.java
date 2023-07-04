package hw1.Domen;

import java.util.concurrent.TimeUnit;

public class HotDrink extends Product {
    private int temperature;

    public HotDrink(int price, int place, String name, long id) {
        super(price, place, name, id);
        this.temperature = 0;
    }

    public HotDrink(int price, int place, String name, long id, int temperature) {
        super(price, place, name, id);
        this.temperature = temperature;
    }

    public int getTemperature() throws InterruptedException {
        int temp = 0;
        for (int i = 0; i <= temperature; i++) {
            TimeUnit.SECONDS.sleep(1);
            temp = i;
            System.out.println("Making coffee..." + temp + "C°");
            i += 9;
        }
        TimeUnit.SECONDS.sleep(1);
        System.out.println("Done!");
        TimeUnit.SECONDS.sleep(1);
        return temp;
    }

    @Override
    public String toString() {
        try {
            return super.getName() + " is ready! " + "\nTemperature = " + getTemperature() + "C°" + "\nPrice = " + super.getPrice();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
