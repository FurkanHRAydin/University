package application;


import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class GameOver {
	private static Stage stage;
	private static BorderPane root = new BorderPane();
	private static Scene scene = new Scene(root, Main.getSize()[0], Main.getSize()[1]);

	private static Button btn = new Button();
	private static Button btn_1 = new Button();
	private static Label lbl = new Label();
	private static  HBox hbox = new HBox();
	private static HBox hbox_btn = new HBox();

	private static Font lbl_font = Font.font("Courier New", FontWeight.BOLD, 30);
	private static Font btn_font = Font.font("Courier New", FontWeight.BOLD, 25);

	public static void setLayout() {
		Image Background = new Image("Fugy_res/home_bg.gif");
		ImageView home_bg = new ImageView(Background);
		home_bg.setFitHeight(600);
		home_bg.setFitWidth(600);
		home_bg.setX(0.0);
		home_bg.setY(0.0);
		root.getChildren().add(home_bg);

		lbl.setText("Game Over!\n Your score: "+ Home.getCounter());
		lbl.setFont(lbl_font);
		lbl.setTextFill(Color.web("#FFFFFF"));

		btn.setText("return");
		btn.setFont(btn_font);
		btn.setPrefSize(140, 30);
		btn.setStyle( "-fx-background-color: #0000FF; "
				+ " -fx-base: Black");

		btn_1.setText("Collection");
		btn_1.setFont(btn_font);
		btn_1.setPrefSize(200, 30);
		btn_1.setStyle( "-fx-background-color: #0000FF; "
				+ " -fx-base: Black");

		hbox.getChildren().addAll(lbl);
		hbox.setPadding(new Insets(250, 0, 0, 140));

		hbox_btn.getChildren().addAll(btn, btn_1);
		hbox_btn.setPadding(new Insets(20, 50, 10, 125));
		hbox_btn.setSpacing(40);

		VBox vboxeif = new VBox(); 
		vboxeif.getChildren().addAll(hbox,hbox_btn);
		root.setCenter(vboxeif);
	}

	public static void setEvents() {

		btn.setOnAction(e -> {
			stage.setScene(Home.getScene());
			Home.getScene();
			Home.setLayout(stage);
			Home.setEvents();
			//Home.defaultwerte();
		});

		btn_1.setOnAction(e -> {
			System.out.println("Coming soon...");
		});
	}
	public static Scene getScene() {
		return GameOver.scene;
	}

	public static void setStage(Stage stage) {
		GameOver.stage = stage;
	}
}
