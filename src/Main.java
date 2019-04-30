import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    /**
     * Loads the scene builder and sets the GUI
     */
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("Project3.fxml"));
        primaryStage.setTitle("Optics Simulation");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }

    /**
     * Launches program
     * @param args
     */
    public static void main (String[] args) {
        launch(args);
    }

}
