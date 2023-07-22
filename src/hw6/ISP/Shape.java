package hw6.ISP;

public class Shape {

    /**
     * Интерфейс для двумерных фигур*/
    public interface TwoDimShape {
        double area();
    }

    /**
     * Интерфейс для трехмерных фигур*/
    public interface ThreeDimShape {
        double volume();
    }

    public class Circle implements TwoDimShape {
        private double radius;

        /**
         * Конструктор
         * @param radius Радиус
         */
        public Circle(double radius) {
            this.radius = radius;
        }

        /**
         * Метод вычисления площади */
        @Override
        public double area() {
            return 2 * 3.14 * radius;
        }
    }

    public class Cube implements TwoDimShape, ThreeDimShape {
        private int edge;

        /**
         * Конструктор*/
        public Cube(int edge) {
            this.edge = edge;
        }

        /**
         * Метод вычисления площади */
        @Override
        public double area() {
            return 6 * edge * edge;
        }

        /**
         * Метод вычисления объема*/
        @Override
        public double volume() {
            return edge * edge * edge;
        }
    }
}
