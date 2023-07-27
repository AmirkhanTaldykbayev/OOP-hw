package hw7.ComplexCalculator_1try;

import java.util.Scanner;

public class ViewComplexCalc {
    private Logger logger;
    private iComplexCalculable complexCalc;

    public ViewComplexCalc(iComplexCalculable complexCalc){
        this.complexCalc = complexCalc;
    }

    public void run() {
        while (true) {
            ComplexCalc primaryArg = promptComplex("Введите вещественную часть: ");
            complexCalc.sum(primaryArg);
            logger.log(String.format("Первое значение калькулятора %d", primaryArg));
            while(true){
                String cmd = prompt("Введите команду (+, -, /) : ");
                if(cmd.equals("+")){
                    ComplexCalc arg = promptComplex("Введите комплексную часть: ");
                    complexCalc.sum(arg);
                    logger.log(String.format("Первое значение калькулятора %d. Начало вызова метода sum с параметром %d", primaryArg, arg));
                    continue;
                }
                if(cmd.equals("-")){
                    ComplexCalc arg = promptComplex("Введите комплексную часть: ");
                    complexCalc.substract(arg);
                    logger.log(String.format("Первое значение калькулятора %d. Начало вызова метода substract с параметром %d", primaryArg, arg));
                    continue;
                }
                if(cmd.equals("/")){
                    ComplexCalc arg = promptComplex("Введите комплексную часть: ");
                    complexCalc.divide(arg);
                    logger.log(String.format("Первое значение калькулятора %d. Начало вызова метода divide с параметром %d", primaryArg, arg));
                    continue;
                }
                if(cmd.equals("=")){
                    System.out.println(complexCalc.getResult());
                    break;
                }
            }
            String cmd = prompt("Посчитать еще? (Y/N)");
            if(cmd.equals("Y")){
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

    private ComplexCalc promptComplex(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return new ComplexCalc(in);
    }
}
