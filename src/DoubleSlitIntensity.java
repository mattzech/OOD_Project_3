public class DoubleSlitIntensity extends SingleSlitIntensity{
    Alpha alphaClass;
    double doubleSlitIntensity;

    DoubleSlitIntensity() {
        super();
        doubleSlitIntensity = 0;
    }
    DoubleSlitIntensity(double multiple, double lambda, double width, double slitDistance){
        super (multiple, lambda, width);
        alphaClass = new Alpha (multiple, lambda, width, slitDistance);
        doubleSlitIntensity = 4 * Math.cos(alphaClass.alpha) * Math.cos(alphaClass.alpha) * getSingleSlitIntensity();
    }

    public void setDoubleSlitIntensity(double multiple, double lambda, double width) {
        setSingleSlitIntensity(multiple, lambda, width);
        doubleSlitIntensity = 4 * Math.cos(alphaClass.alpha) * Math.cos(alphaClass.alpha) * getSingleSlitIntensity();
    }

    public double getDoubleSlitIntensity() {
        return doubleSlitIntensity;
    }
}
