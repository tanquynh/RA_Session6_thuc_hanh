package TH4;

public class Calculator {
    double a;
    double b;
    public Calculator(){}
    public Calculator(double a, double b   ) {
        this.a = a;
        this.b = b;
    }
    public double getA() {
        return a;

    }
    public double getB() {
        return b;
    }
    public void setA(double a) {
        this.a = a;
    }
    public void setB(double b) {
        this.b = b;
    }
//    Tính tổng:
    public double add() {
        return a + b;
    }
    public double sub() {
        return a - b;
    }
    public double mul() {
        return a * b;
    }
    public double div() {
        return a / b;
    }
}
