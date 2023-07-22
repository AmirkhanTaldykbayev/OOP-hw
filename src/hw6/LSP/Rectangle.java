package hw6.LSP;

public class Rectangle {
    protected int width; // Ширина
    protected int height; // Высота

    /**
     * Метод для определения ширины прямоугольника
     * @param width Ширина*/
    public void setWidth(int width) {
        this.width = width;
    }

    /**
     * Метод для определения длины прямоугольника
     * @param height Длина*/
    public void setHeight(int height) {
        this.height = height;
    }

    /**
     * Метод вычисления площади*/
    public int area() {
        return this.width * this.height;
    }

    public static class Square extends Rectangle { // Использовал статику для проверки на работоспособность в Main

        /**
         * Конструктор для квадрата
         * Так как все его стороны равны, то для длины и ширины можно использовать одно значение
         * @param length длина стороны*/
        public Square(int length){
            super.height = length;
            super.width = length;
        }
    }
}