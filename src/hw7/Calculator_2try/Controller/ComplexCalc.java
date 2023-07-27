package hw7.Calculator_2try.Controller;

public class ComplexCalc implements iComplexCalc {
    double real;
    double imag;

    public ComplexCalc(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public double getReal() {
        return real;
    }

    public double getImag() {
        return imag;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public void setImag(double imag) {
        this.imag = imag;
    }

    @Override
    public ComplexCalc sum(ComplexCalc second) {
        double tempReal = this.real + second.getReal();
        double tempImag = this.imag + second.getImag();
        return new ComplexCalc(tempReal, tempImag);
    }

    @Override
    public ComplexCalc substract(ComplexCalc second) {
        double tempReal = this.real - second.getReal();
        double tempImag = this.imag - second.getImag();
        return new ComplexCalc(tempReal, tempImag);
    }

    @Override
    public ComplexCalc divide(ComplexCalc second) {
        double temp = Math.pow(second.getReal(), 2) + Math.pow(second.getReal(), 2);
        double tempReal = (this.real * second.getReal() + this.getImag() * second.getImag()) / temp;
        double tempImag = (this.getImag() * second.getReal() - this.real * second.getImag()) / temp;
        return new ComplexCalc(tempReal, tempImag);
    }

    @Override
    public String toString() {
        return real + "+" + imag + "i";
    }
}
