package hw7.Calculator_2try.Controller;

public interface iComplexCalc {

    ComplexCalc sum(ComplexCalc second);
    ComplexCalc substract(ComplexCalc second);
    ComplexCalc divide(ComplexCalc second);

    String getResult();

}
