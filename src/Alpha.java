public class Alpha extends Theta{
    protected double alpha;

    Alpha(){
        alpha = 0;
    }
    /**
     * Makes the variable "alpha" to be used in the formula
     * @param multiple
     * @param lambda
     * @param width
     * @param slitDistance
     */
    Alpha(double multiple, double lambda, double width, double slitDistance){
        super(multiple, lambda, width);
        setAlpha(lambda, width, slitDistance);
    }

    /**
     * Calculates the variable
     * @param lambda
     * @param width
     * @param slitDistance
     */
    public void setAlpha(double lambda, double width, double slitDistance) {
        alpha = Math.PI * slitDistance * Math.sin(theta) / lambda;
    }
}
