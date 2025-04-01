package Q3;

public class Circle {

    private double ri;
    private double ro;


    public Circle() {
        this.ri = 0.0;
        this.ro = 0.0;
    }


    public Circle(double ri, double ro) {
        this.ri = ri;
        this.ro = ro;
    }

    public void setRadius(double ri, double ro) {
        this.ri = ri;
        this.ro = ro;
    }

    public double computeArea(){
        return ( (Math.PI * Math.pow(ro, 2)) - (Math.PI*Math.pow(ri,2)) );
    }


    public void computeCircumference(){
        System.out.println("Circumference of the inner circle: " + ( 2 * Math.PI * ri ) );
        System.out.print("Circumference of the outer circle: " + ( 2 * Math.PI * ro ) );
    }


}
