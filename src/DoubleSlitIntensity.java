public class DoubleSlitIntensity extends SingleSlitIntensity{
    Alpha alphaClass;
    double doubleSlitIntensity;

    DoubleSlitIntensity() {
        super();
        doubleSlitIntensity = 0;
    }
    /**
     * creates double slit intensity using the formulas
     * @param multiple
     * @param lambda
     * @param width
     * @param slitDistance
     */
    DoubleSlitIntensity(double multiple, double lambda, double width, double slitDistance){
        super (multiple, lambda, width);
        alphaClass = new Alpha (multiple, lambda, width, slitDistance);
        doubleSlitIntensity = 4 * Math.cos(alphaClass.alpha) * Math.cos(alphaClass.alpha) * getSingleSlitIntensity();
    }

    /**
     * uses single slit formula to get double slit
     * @param multiple
     * @param lambda
     * @param width
     */
    public void setDoubleSlitIntensity(double multiple, double lambda, double width) {
        setSingleSlitIntensity(multiple, lambda, width);
        doubleSlitIntensity = 4 * Math.cos(alphaClass.alpha) * Math.cos(alphaClass.alpha) * getSingleSlitIntensity();
    }

    /**
     * Returns the value
     * @return
     */
    public double getDoubleSlitIntensity() {
        return doubleSlitIntensity;
    }
}
