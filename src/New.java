
import javafx.animation.KeyFrame;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.scene.paint.Color;
import javafx.animation.Timeline;

import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.layout.Pane;
import javafx.scene.control.Button;
import javafx.scene.Scene;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.FontPosture;
import javafx.stage.Stage;
import javafx.util.Duration;

public class New extends Application {

    private static final double WIDTH = 600;
    private static final String GAME_PANE_COLOR = "#F0F8FF";
    private static final Font FONT_FOR_TEXT = Font.font("Courier", FontWeight.BOLD, FontPosture.ITALIC, 30);
    //all Scenes for programm
    private Scene startScene;
    private Scene gameScene;
    private Scene gameOverScene;
    //main menu Pane elements
    private Button startBT;
    //game Pane
    private Pane gamePane;
    // game Pane elements
    private Text scoreText;
    private Text timeText;
    private Line divider;
    private Circle ballGame;
    //game over menu Pane
    private Pane gameOverMenuPane;
    //game over menu Pane elements
    private Text lastScoreText;
    private Button playAgainBT;
    private Button exitBT;
    //Animation data fields
    private Timeline timerAnimation;
    Random random = new Random();
    int score = 0;

    @Override
    public void start(Stage primaryStage) throws Exception {
        StackPane startMenuPane = new StackPane();

        startBT = new Button();
        startBT.setAlignment(Pos.CENTER);
        startBT.setText("Start");
        startMenuPane.getChildren().add(startBT);
        startBT.setOnAction(event -> initLayout(primaryStage));
        startScene = new Scene(startMenuPane, 600, 600);
        primaryStage.setTitle("Bubble game");
        primaryStage.setScene(startScene);
        primaryStage.show();

    }

    public void initLayout(Stage primaryStage) {
        gamePane = new Pane();
        scoreText = new Text("Score: ");
        timerAnimation = new Timeline();
        timeText = new Text("Time: ");
        divider = new Line(0, 40, 600, 40);
        divider.setFill(Color.BLACK);
        timerAnimation = new Timeline(new KeyFrame(Duration.millis(1000), e -> timer()));
        timerAnimation.setCycleCount(20);
        timerAnimation.play();
        ballGame = new Circle();
        ballGame.setRadius((Math.random() * 100) + 10);
        Color color1 = new Color(Math.random(), Math.random(), Math.random(), Math.random());
        ballGame.setFill(color1);
        ballGame.setRadius((Math.random() * 100) + 10);
        int x = random.nextInt(400) + 100;
        int y = random.nextInt(400) + 100;
        ballGame.setCenterX(x);
        ballGame.setCenterY(y);
        ballGame.setOnMouseClicked(event -> {
            int r = (int) (Math.random() * 50) + 10;
            int x1 = (int) (Math.random() * (585 - r - 5)) + r + 5, y1 = (int) (Math.random() * (540 - r - 5)) + r + 40;
            ballGame.setCenterX(x1);
            ballGame.setCenterY(y1);
            ballGame.setRadius(r);
            Color color = new Color(Math.random(), Math.random(), Math.random(), Math.random());
            ballGame.setFill(color);
            scoreText.setText("Last Score:  " + score);
        });
        gamePane.getChildren().addAll(scoreText, timeText,ballGame);
        gamePane.getChildren().add(divider);
        gameScene = new Scene(gamePane, 600, 600);
        primaryStage.setScene(gameScene);
        primaryStage.show();

    }

    public void timer() {

        int timer = 20;
        timer--;
        if (timer != 0) {
            timeText.setText(" Time left : " + timer + " Seconds");
            scoreText.setText("Last Score:  " + score);
        }
    }




}
