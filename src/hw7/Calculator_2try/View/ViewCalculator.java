package hw7.Calculator_2try.View;

import hw7.Calculator_2try.Controller.iComplexCalc;


import java.util.Scanner;

public class ViewCalculator {

    private iComplexCalc calculator;

    public ViewCalculator(iComplexCalc calculator) {
        this.calculator = calculator;
    }

    public void run() {
        while (true) {
            double primaryArg =  promptComp("Введите вещественную часть: ");
            while (true) {
                String cmd = prompt("Введите команду (-, +, /, =) : ");
                if (cmd.equals("+")) {
                    double arg = promptComp("Введите мнимую часть: ");
                    primaryArg += (arg);
                    continue;
                }
                if (cmd.equals("-")){
                    double arg = promptComp("Введите мнимую часть");

                }
                if(cmd.equals("/")){

                }
                if (cmd.equals("=")) {
                    String result = calculator.getResult();
                    System.out.printf("Результат %d\n", result);
                    break;
                }
            }
            String cmd = prompt("Еще посчитать (Y/N)?");
            if (cmd.equals("Y")) {
                continue;
            }
            break;
        }
    }

    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }

    private double promptComp(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return Double.parseDouble(in.next());
    }
}
