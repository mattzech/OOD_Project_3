public class Beta extends Theta {
    protected double beta;

    Beta() {
        super();
        beta = 0;
    }
    /**
     * Sets up the variable beta to be used in the formula
     * @param multiple
     * @param lambda
     * @param width
     */
    Beta(double multiple, double lambda, double width){
        super(multiple, lambda, width);
        setBeta(multiple, lambda, width);
    }

    /**
     * Calculates the value using the formula
     * @param multiple
     * @param lambda
     * @param width
     */
    public void setBeta(double multiple, double lambda, double width) {
        setTheta(multiple, lambda, width);
        beta = Math.PI * width * Math.sin(theta) / lambda;
    }
}
