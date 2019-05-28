public class Calculator {


    private double numone;
    private double numtwo;

    public Calculator(double a, double b) {
        this.numone = a;
        this.numtwo = b;
    }

    public double add(){
        return this.numone + this.numtwo;
    }

    public double subtract(){
        return this.numone - this.numtwo;
    }

    public double multiply(){
        return this.numone * this.numtwo;
    }

    public double divide(){
        return this.numone / this.numtwo;
    }

}
