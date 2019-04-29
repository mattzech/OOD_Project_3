public class Theta {
    protected double theta;

    Theta(){
        theta = 0;
    }
    Theta(double multiple, double lambda, double width){
        theta = multiple * lambda / width;
    }

    public void setTheta(double multiple, double lambda, double width) {
        theta = multiple * lambda / width;
    }
}