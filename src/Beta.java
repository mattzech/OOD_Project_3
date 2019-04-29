public class Beta extends Theta {
    protected double beta;

    Beta() {
        super();
        beta = 0;
    }
    Beta(double multiple, double lambda, double width){
        super(multiple, lambda, width);
        setBeta(multiple, lambda, width);
    }

    public void setBeta(double multiple, double lambda, double width) {
        setTheta(multiple, lambda, width);
        beta = Math.PI * width * Math.sin(theta) / lambda;
    }
}
