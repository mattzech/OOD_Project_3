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
        singleSlitButton.setSelected(true);
        setGraph();
    }

    //testing graph, trying to figure it out
    @FXML
    public void setGraph(){
        //example of how a double slit graph might work
        /*
        series.getData().clear();
        for(double i = -100; i <= 100; i += .1)
        {
            SingleSlitIntensity yValue = new SingleSlitIntensity(i, wavelengthSlider.getValue(), widthSlider.getValue());
            Theta theta = new Theta(i, wavelengthSlider.getValue(), widthSlider.getValue());
            XValue xValue = new XValue(separationSlider.getValue(), theta);
            series.getData().add(new XYChart.Data<Number,Number> (xValue.x, yValue.getSingleSlitIntensity()));
        }
        graph.getData().add(series);
        */
    }

    //for setGraph, use gets of each slider
    @FXML
    void clicked(ActionEvent event) {
        if(singleSlitButton.isSelected())
            setGraph();
        else {
            System.out.println("Double Slit Graph");
            //graph double slit
        }
    }

    @FXML
    void singleClicked(ActionEvent event) {
        if(doubleSlitButton.isSelected())
            doubleSlitButton.setSelected(false);
        if(!singleSlitButton.isSelected())
            singleSlitButton.setSelected(true);
        setGraph();
    }

    @FXML
    void doubleClicked(ActionEvent event) {
        if(singleSlitButton.isSelected())
            singleSlitButton.setSelected(false);
        if(!doubleSlitButton.isSelected())
            doubleSlitButton.setSelected(true);
    }
}
