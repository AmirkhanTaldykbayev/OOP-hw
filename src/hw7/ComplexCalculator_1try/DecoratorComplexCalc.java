package hw7.ComplexCalculator_1try;

public class DecoratorComplexCalc implements iComplexCalculable {
    private iComplexCalculable decorator;
    private Logger logger;

    public DecoratorComplexCalc(iComplexCalculable decor, Logger logger){
        this.decorator = decor;
        this.logger = logger;
    }


    @Override
    public iComplexCalculable sum(ComplexCalc calc) {
        double realArg = decorator.getReal();
        double imagineArg = decorator.getImagine();

        iComplexCalculable result =  decorator.sum(realArg, imagineArg);
        return this;
    }

    @Override
    public iComplexCalculable substract(ComplexCalc calc) {
        double realArg = decorator.getReal();
        double imagineArg = decorator.getImagine();

        iComplexCalculable result = decorator.substract(realArg, imagineArg);
        return this;
    }

    @Override
    public iComplexCalculable divide(ComplexCalc calc) {
        double realArg = decorator.getReal();
        double imagineArg = decorator.getImagine();

        iComplexCalculable result = decorator.divide(realArg, imagineArg);
        return this;
    }

    @Override
    public String getResult() {
        return null;
    }
}
