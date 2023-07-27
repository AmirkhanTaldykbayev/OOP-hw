package hw7.ComplexCalculator_1try;

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
    public iComplexCalculable sum(double real, double imag) {
        re += real;
        im += imag;
        return this;
    }

    @Override
    public iComplexCalculable substract(double real, double imag) {
        re -= real;
        im -= imag;
        return this;
    }

    @Override
    public iComplexCalculable divide(double real, double imag) {
        double tempRe = re;
        double tempIm = im;
        double temp = (real * real) + (imag * imag);

        re = ((tempRe * real) + (tempIm * imag) / temp);
        im = ((tempIm * real) - (tempRe * imag) / temp);

        return this;
    }

    @Override
    public String getResult() {
        String res = im > 0 ? "+" : "";
        return re + res + im + "i";
    }
}
