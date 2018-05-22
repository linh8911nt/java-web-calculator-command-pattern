package services;

public class SubOperator implements IOperator {
    @Override
    public int execute(int firstOperator, int secondOperator) {
        return firstOperator - secondOperator;
    }
}
