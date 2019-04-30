import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    @FXML
    private RadioButton doubleSlitButton;

    @FXML
    private RadioButton singleSlitButton;


    @FXML
    private Slider separationSlider;

    @FXML
    private Slider wavelengthSlider;

    @FXML
    private Slider widthSlider;

    @FXML
    private LineChart<Number,Number> graph;

    private XYChart.Series series = new XYChart.Series();

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        setGraph();
    }

    //testing graph, trying to figure it out
    @FXML
    
    public void setGraph(){
        /*
        series.getData().clear();
        for(double x = -400; x <= 400; x += 1)
            series.getData().add(new XYChart.Data<Number,Number> (x, x));
        graph.getData().add(series);
        */
        System.out.println("vjksdl");
    }

    /**
     * Registers if the button is clicked
     * @param event
     */
    @FXML
    void clicked(ActionEvent event) {
        System.out.println("CLICKED");
    }
    //for setGraph, use gets of each slider
}
