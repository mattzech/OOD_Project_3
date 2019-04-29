import javafx.fxml.FXML;
import javafx.scene.control.Slider;
import javafx.scene.input.MouseEvent;

public class SliderController extends GraphController{
    @FXML
    private Slider separationSlider;

    @FXML
    private Slider wavelengthSlider;

    @FXML
    private Slider widthSlider;

    //for setGraph, use gets of each slider
    @FXML
    void getSeparation(MouseEvent event) {
        setGraph();
    }

    @FXML
    void getWavelength(MouseEvent event) {
        setGraph();
    }

    @FXML
    void getWidth(MouseEvent event) {
        setGraph();
    }
}
