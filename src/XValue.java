public class XValue {
    double x;

    XValue(){
        x = 0;
    }

    XValue(double distanceFromScreen, Theta thetaClass){
        setX(distanceFromScreen, thetaClass);
    }

    public void setX(double distanceFromScreen, Theta thetaClass){
        x = thetaClass.theta * distanceFromScreen;
    }
}
