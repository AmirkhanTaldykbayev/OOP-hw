package hw7.Calculator_2try.Model;

import hw7.Calculator_2try.Controller.ComplexCalc;

public class Calculator {
    private ComplexCalc first;
    private ComplexCalc second;


    public Calculator(ComplexCalc first, ComplexCalc second){
        this.first = first;
        this.second = second;
    }

    public ComplexCalc sum(){
        ComplexCalc result = this.first.sum(this.second);
        return result;
    }

    public ComplexCalc substract(){
        ComplexCalc result = this.first.substract(this.second);
        return result;
    }

    public ComplexCalc divide(){
        ComplexCalc result = this.first.divide(this.second);
        return result;
    }
}
