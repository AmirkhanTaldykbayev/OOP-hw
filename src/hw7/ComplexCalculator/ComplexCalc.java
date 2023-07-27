package hw7.ComplexCalculator;

public class ComplexCalc implements iComplexCalculable {

    private double re;
    private double im;

    public ComplexCalc(double real, double imag) {
        this.re = real;
        this.im = imag;
    }

    public double getReal() {
        return re;
    }

    public double getImagine() {
        return im;
    }

    public void setReal(double re) {
        this.re = re;
    }

    public void setImagine(double im) {
        this.im = im;
    }

    @Override
    public iComplexCalculable sum(ComplexCalc calc) {
        re += calc.re;
        im += calc.im;
        return this;
    }

    @Override
    public iComplexCalculable substract(ComplexCalc calc) {
        re -= calc.re;
        im -= calc.im;
        return this;
    }

    @Override
    public iComplexCalculable divide(ComplexCalc calc) {
        double tempRe = re;
        double tempIm = im;
        double temp = (calc.re * calc.re) + (calc.im * calc.im);

        re = ((tempRe * calc.re) + (tempIm * calc.im) / temp);
        im = ((tempIm * calc.re) - (tempRe * calc.im) / temp);

        return this;
    }

    @Override
    public String getResult() {
        String res = im > 0 ? "+" : "";
        return re + res + im + "i";
    }
}
