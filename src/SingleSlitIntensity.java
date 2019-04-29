public class SingleSlitIntensity extends Beta {
    private double singleSlitIntensity;

    SingleSlitIntensity() {
        super();
        singleSlitIntensity = 0;
    }
    SingleSlitIntensity(double multiple, double lambda, double width) {
        super(multiple, lambda, width);
        setSingleSlitIntensity(multiple, lambda, width);
    }

    public void setSingleSlitIntensity(double multiple, double lambda, double width) {
        setBeta(multiple, lambda, width);
        singleSlitIntensity = (Math.sin(beta) / beta) * (Math.sin(beta) / beta);
    }

    public double getSingleSlitIntensity() {
        return singleSlitIntensity;
    }
}
