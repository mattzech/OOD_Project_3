public class SingleSlitIntensity extends Beta {
    private double singleSlitIntensity;

    SingleSlitIntensity() {
        super();
        singleSlitIntensity = 0;
    }
    /**
     * Uses inheritance to create the single slit formula
     * @param multiple
     * @param lambda
     * @param width
     */
    SingleSlitIntensity(double multiple, double lambda, double width) {
        super(multiple, lambda, width);
        setSingleSlitIntensity(multiple, lambda, width);
    }

    /**
     * Calculates the value for single slit live so the slider can be adjusted
     * @param multiple
     * @param lambda
     * @param width
     */
    public void setSingleSlitIntensity(double multiple, double lambda, double width) {
        setBeta(multiple, lambda, width);
        singleSlitIntensity = (Math.sin(beta) / beta) * (Math.sin(beta) / beta);
    }

    /**
     * Returns the value
     * @return
     */
    public double getSingleSlitIntensity() {
        return singleSlitIntensity;
    }
}
