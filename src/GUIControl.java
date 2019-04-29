import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.awt.event.ActionEvent;

public class GUIControl {
    public void loadDisplay(ActionEvent actionEvent) throws Exception {
        Stage primaryStage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        primaryStage.hide();
        primaryStage.setTitle("Light Diffraction");
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Project3GUI.fxml"));
        Scene editorPage = new Scene(loader.load());
        primaryStage.setScene(editorPage);
        primaryStage.show();
    }
}
