import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Login extends Application {

  @Override
  public void start(Stage primaryStage) {
    primaryStage.setTitle("JavaFX Welcome");

    GridPane grid = new GridPane();
    grid.setAlignment(Pos.CENTER);
    grid.setHgap(10);
    grid.setVgap(10);
    grid.setPadding(new Insets(25, 25, 25, 25));

    Text scenetitle = new Text("Welcome");
    scenetitle.setId("welcome-text");
    grid.add(scenetitle, 0,0, 2, 1);

    Label userName = new Label("User Name:");
    grid.add (userName,0, 1);

    TextField userTextField = new TextField();
    grid.add (userTextField, 1, 1);

    Label pw = new Label("Password ");
    grid.add (pw, 0, 2);

    PasswordField pwBox = new PasswordField();
    grid. add (pwBox, 1, 2);
    grid.setGridLinesVisible(false);

    Button btn = new Button("Sign In");
    HBox hBtn = new HBox(10);
    hBtn.setAlignment(Pos.BOTTOM_RIGHT);
    hBtn.getChildren().add(btn);
    grid.add(hBtn,1 ,4);

    final Text actionTarget = new Text();
      grid.add(actionTarget, 1, 6);

    btn.setOnAction(new EventHandler<ActionEvent>() {
      @Override
      public void handle(ActionEvent event) {
        actionTarget.setId("actiontarget");
        actionTarget.setText("Sign in button pressed");
      }
    });


    Scene scene = new Scene(grid, 300, 275);
    primaryStage.setScene(scene);
    scene.getStylesheets().add
        (Login.class.getResource("Login.css").toExternalForm());
    primaryStage.show();

//    @Override
//    public void start(Stage primaryStage) throws Exception{
//        primaryStage.setTitle("Hello World");
//
//        Button btn = new Button();
//        btn.setText("Say 'Hello World'");
//        btn.setOnAction(new EventHandler<ActionEvent>() {
//
//            @Override
//            public void handle(ActionEven3t event) {
//                System.out.println("Hello World!");
//            }
//        });
//
//        StackPane root = new StackPane();
//        root.getChildren().add(btn);
//        primaryStage.setScene(new Scene(root, 300, 275));
//        primaryStage.show();
}


  public static void main(String[] args) {
    launch(args);
  }
}
