package hw6.DIP;
public class Car {
    private Engine engine;
    public Car(Engine engine) {
        this.engine = engine;
    }
    public void start() {
        this.engine.start();
    }

    interface Engine{
        /**
         * Метод запуска двигателя*/
        void start();
    }
}
        class PetrolEngine implements Engine{
    public void start() {
    }
}
class DieselEngine implements Engine{
    public void start() {

    }
}