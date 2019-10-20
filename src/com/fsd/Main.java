package com.fsd;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;

public class Main extends Application {

	@Override
	public void start(Stage stage) throws IOException {
		File f = new File("src/com/fsd/fxml/telaCadastro.fxml");
		Parent fxmlParent = FXMLLoader.load(f.toURI().toURL());

		stage.setScene(new Scene(fxmlParent, 700, 400));
		stage.show();
	}

	public static void main(String[] args) {
		launch();
	}
}