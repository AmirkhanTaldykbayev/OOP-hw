package hw6.OCP;

public abstract class Vehicle {
    int maxSpeed; // Максимальная скорость
    String type; // Тип авто

    /**
     * Конструктор
     * @param maxSpeed Максимальная скорость
     * @param type Тип авто*/
    public Vehicle(int maxSpeed, String type) {
        this.maxSpeed = maxSpeed;
        this.type = type;
    }

    /**
     * Метод получения максимальной скорости авто*/
    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    /**
     * Метод получения типа авто*/
    public String getType() {
        return this.type;
    }

    public abstract double calculateAllowedSpeed();

    public class Car extends Vehicle {
        /**
         * Конструктор
         *
         * @param maxSpeed Максимальная скорость
         * @param type     Тип авто
         */
        public Car(int maxSpeed, String type) {
            super(maxSpeed, type);
        }

        public int getMaxSpeed(){
            return super.maxSpeed;
        }

        @Override
        public String getType() {
            return super.getType();
        }

        public double getAllowedSpeed(){
            return calculateAllowedSpeed();
        }

        /**
         * Метод подсчета разрешенной скорости авто
         */
        @Override
        public double calculateAllowedSpeed(){
            return getMaxSpeed() * 0.8;
        }

    }

    public class Bus extends Vehicle{

        /**
         * Конструктор
         *
         * @param maxSpeed Максимальная скорость
         * @param type     Тип авто
         */
        public Bus(int maxSpeed, String type) {
            super(maxSpeed, type);
        }

        @Override
        public int getMaxSpeed() {
            return super.getMaxSpeed();
        }

        @Override
        public String getType() {
            return super.getType();
        }

        /**
         * Метод подсчета разрешенной скорости авто
         */
        @Override
        public double calculateAllowedSpeed() {
            return getMaxSpeed() * 0.6;
        }
    }
    public class SpeedCalculation {
        public double calculateAllowedSpeed(Vehicle vehicle) {
            return vehicle.calculateAllowedSpeed();
        }
    }
}
