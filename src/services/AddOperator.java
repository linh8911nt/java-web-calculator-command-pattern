package services;

public class AddOperator implements IOperator {
    @Override
    public int execute(int firstOperator, int secondOperator) {
        return firstOperator + secondOperator;
    }
}
