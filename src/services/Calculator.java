package services;

public class Calculator {
    private IOperator operator;

    public Calculator(IOperator operator) {
        this.operator = operator;
    }

    public int execute(int firstOperator, int secondOperator){
        return operator.execute(firstOperator, secondOperator);
    }
}
