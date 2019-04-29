public class Alpha extends Theta{
    protected double alpha;

    Alpha(){
        alpha = 0;
    }
    Alpha(double multiple, double lambda, double width, double slitDistance){
        super(multiple, lambda, width);
        setAlpha(lambda, width, slitDistance);
    }

    public void setAlpha(double lambda, double width, double slitDistance) {
        alpha = Math.PI * slitDistance * Math.sin(theta) / lambda;
    }
}
