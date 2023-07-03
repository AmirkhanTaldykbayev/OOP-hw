package hw1.Domen;

import java.sql.Time;
import java.util.Timer;
import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

public class HotDrink extends Product {
    private int temperature;

    TimeUnit tu = TimeUnit.SECONDS;

    public HotDrink(int price, int place, String name, long id) {
        super(price, place, name, id);
        this.temperature = 0;
    }

    public HotDrink(int price, int place, String name, long id, int temperature) {
        super(price, place, name, id);
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }

    @Override
    public String toString() {
        return super.toString() + "Temperature = " + getTemperature() + "C°";
    }
}
