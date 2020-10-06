public class SimpleCalculator {
    private double firstNumber, secondNumber;

    public double getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    public double getSecondNumber() {
        return secondNumber;
    }

    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }

    public double getAdditionResult() {
        return firstNumber + secondNumber;
    }

    public double getSubtractionResult() {
        return firstNumber - secondNumber;
    }

    public double getMultiplicationResult() {
        return firstNumber * secondNumber;
    }

    public double getDivisionResult() {
        if (secondNumber == 0) return 0;
        return firstNumber / secondNumber;
    }
    public static void main(String[] args){
        SimpleCalculator obj = new SimpleCalculator();
        obj.setFirstNumber(45);
        obj.setSecondNumber(9);
        System.out.println("Addition = "+ obj.getAdditionResult());
        System.out.println("Subtraction = "+ obj.getSubtractionResult());
        System.out.println("Multiplication = "+ obj.getMultiplicationResult());
        System.out.println("Division = "+ obj.getDivisionResult());
        obj.setSecondNumber(0);
        System.out.println("Division = "+ obj.getDivisionResult());
    }
}
