import javafx.fxml.FXML;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.XYChart;

public class GraphController{
    @FXML
    private LineChart <Number,Number> graph;

    private XYChart.Series series = new XYChart.Series();

    //testing graph, trying to figure it out
    @FXML
    public void setGraph(){
        series.getData().clear();
        for(double x = -400; x <= 400; x += 1)
            series.getData().add(new XYChart.Data (x, 1));

        graph.getData().add(series);
    }
}
