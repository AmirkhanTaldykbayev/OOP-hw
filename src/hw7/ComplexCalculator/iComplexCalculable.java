package hw7.ComplexCalculator;

public interface iComplexCalculable {
     iComplexCalculable sum(ComplexCalc calc);
     iComplexCalculable substract(ComplexCalc calc);
     iComplexCalculable divide(ComplexCalc calc);

     String  getResult();

}
