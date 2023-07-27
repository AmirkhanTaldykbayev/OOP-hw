package hw7.ComplexCalculator_1try;

public interface iComplexCalculable {
     iComplexCalculable sum(double real, double imag);
     iComplexCalculable substract(double real, double imag);
     iComplexCalculable divide(double real, double imag);

     double getReal();
     double getImagine();

     String  getResult();

}
