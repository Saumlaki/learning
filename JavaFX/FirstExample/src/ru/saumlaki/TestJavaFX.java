package ru.saumlaki;
import



public class TestJavaFX extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {

        BorderPane root = new BorderPane();
        Label text = new Label("Hello world");
        root.setCenter(text);
        Scene scene = new Scene(root, 400, 400);
        stage.setScene(scene);
        stage.show();
    }
}
