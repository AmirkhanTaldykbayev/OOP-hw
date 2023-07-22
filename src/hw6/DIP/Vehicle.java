package hw6.DIP;

public class Vehicle {
    private Engine engine;
    public Vehicle(Engine engine){
        this.engine = engine;
    }

    public void start(){

    }

    interface Engine{
        /**
         * Метод запуска двигателя*/
        void start();
    }
    public  class GasolineEngine implements Engine{

        /**
         * Метод запуска бензинового двигателя*/
        public void start(){
            System.out.println("Бензиновый двигатель запущен");
        }
    }

    public class DieselEngine implements Engine{


        /**
         * Метод запуска дизельного двигателя*/
        public void start() {
            System.out.println("Дизельный двигатель запущен");
        }
    }

    public static class Car extends Vehicle implements Engine {

        /**
         * Конструктор
         * @param engine Тип двигателя*/
        public Car(Engine engine){
            super(engine);
        }

        public void start(){
            super.start();
        }
    }
}