package com.example.screenbounds;

import javafx.fxml.Initializable;
import javafx.geometry.Rectangle2D;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;
import javafx.stage.Screen;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    public AnchorPane rootPane;
    public Button btn1;
    public Text txtWidth;
    public Text txtHeight;
    public Button btnReset;


    public void getBounds() {
        for (Screen screen : Screen.getScreens()) {
            Rectangle2D screenBounds = screen.getVisualBounds();
            txtHeight.setText(String.valueOf(screenBounds.getHeight()));
            txtWidth.setText(String.valueOf(screenBounds.getWidth()));
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        txtHeight.setText("Press Bounds");
        txtWidth.setText("Press Bounds");
    }

    public void reset() {
        txtHeight.setText("_______");
        txtWidth.setText("_______");
    }
}
