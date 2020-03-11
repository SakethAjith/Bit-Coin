//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package sample;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

import com.sun.prism.paint.Color;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Main extends Application implements EventHandler<ActionEvent> {
    Button button;
    Button button1;
    Button button2;
    Button button3;
    Button button4;
    Button button5;
    Button button6;
    Button button7;
    Button button8;
    Button button9;
    Button button10;
    Button button11;
    Button button12;
    Stage window;

    public Main() {
    }

    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage primaryStage) throws Exception {
        this.window = primaryStage;
        this.window.setTitle("BitC");
        
        
        
        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10.0D, 10.0D, 10.0D, 10.0D));
//        grid.setBackground(new Background(new BackgroundFill(Color.red, CornerRadii.EMPTY, Insets.EMPTY)));
        grid.setVgap(4.0D);
        grid.setHgap(4.0D);
        
        
        Font font1 = new Font("SansSerif", 20);
        TextField input = new TextField();
        input.setFont(font1);
        input.setPrefWidth(800);
        input.setPrefHeight(50);
        input.setPromptText("Enter no. of BitCoins");
        input.setStyle("-fx-prompt-text-fill: black");
        
        
        
        GridPane.setConstraints(input, 2, 0);
        TextField output = new TextField();
        output.setPromptText("Value");
        output.setStyle("-fx-prompt-text-fill: #BB0426");
        output.setFont(font1);
        output.setPrefWidth(800);
        output.setPrefHeight(50);
        GridPane.setConstraints(output, 2, 17);
        
        
        
        this.button = new Button();
        this.button.setPrefSize(700, 100);
        this.button.setStyle("-fx-background-color: #33FFFF");
        this.button.setText("INR");
        this.button.setOnAction((e) -> {
            output.setPromptText("₹ " + this.isINR(input, input.getText()));
        });
        this.button1 = new Button();
        this.button1.setPrefSize(700, 100);
        this.button1.setStyle("-fx-background-color: #33FFFF");
        this.button1.setText("USD");
        this.button1.setOnAction((e) -> {
            output.setPromptText("$ " + this.isUSD(input, input.getText()) + " Dollar");
        });
        this.button2 = new Button();
        this.button2.setPrefSize(700, 100);
        this.button2.setStyle("-fx-background-color: #33FFFF");
        this.button2.setText("JPY");
        this.button2.setOnAction((e) -> {
            output.setPromptText("円 " + this.isJPY(input, input.getText()));
        });
        this.button3 = new Button();
        this.button3.setPrefSize(700, 100);
        this.button3.setStyle("-fx-background-color:#33FFFF");
        this.button3.setText("CNR");
        this.button3.setOnAction((e) -> {
            output.setPromptText("¥ " + this.isCNY(input, input.getText()));
        });
        this.button4 = new Button();
        this.button4.setPrefSize(700, 100);
        this.button4.setStyle("-fx-background-color: #33FFFF");
        this.button4.setText("EUP");
        this.button4.setOnAction((e) -> {
            output.setPromptText("€ " + this.isEUR(input, input.getText()));
        });
        this.button5 = new Button();
        this.button5.setPrefSize(700, 100);
        this.button5.setStyle("-fx-background-color: #33FFFF");
        this.button5.setText("RD");
        this.button5.setOnAction((e) -> {
            output.setPromptText("₽ " + this.isRUB(input, input.getText()));
        });
        this.button6 = new Button();
        this.button6.setPrefSize(700, 100);
        this.button6.setStyle("-fx-background-color: #33FFFF");
        this.button6.setText("SGD");
        this.button6.setOnAction((e) -> {
            output.setPromptText("S$ " + this.isSGD(input, input.getText()));
        });
        this.button7 = new Button();
        this.button7.setPrefSize(700, 100);
        this.button7.setStyle("-fx-background-color: #33FFFF");
        this.button7.setText("CAD");
        this.button7.setOnAction((e) -> {
            output.setPromptText("C$ " + this.isCAD(input, input.getText()));
        });
        this.button8 = new Button();
        this.button8.setPrefSize(700, 100);
        this.button8.setStyle("-fx-background-color: #33FFFF");
        this.button8.setText("AUD");
        this.button8.setOnAction((e) -> {
            output.setPromptText("A$ " + this.isAUD(input, input.getText()));
        });
        this.button9 = new Button();
        this.button9.setPrefSize(700, 100);
        this.button9.setStyle("-fx-background-color: #33FFFF");
        this.button9.setText("NZD");
        this.button9.setOnAction((e) -> {
            output.setPromptText("N$ " + this.isNZD(input, input.getText()));
        });
        this.button10 = new Button();
        this.button10.setPrefSize(700, 100);
        this.button10.setStyle("-fx-background-color: #33FFFF");
        this.button10.setText("HKD");
        this.button10.setOnAction((e) -> {
            output.setPromptText("H$ " + this.isHKD(input, input.getText()));
        });
        this.button11 = new Button();
        this.button11.setPrefSize(700, 100);
        this.button11.setStyle("-fx-background-color: #33FFFF");
        this.button11.setText("DKK");
        this.button11.setOnAction((e) -> {
            output.setPromptText("Kr " + this.isDKK(input, input.getText()));
        });
        this.button12 = new Button();
        this.button12.setPrefSize(700, 100);
        this.button12.setStyle("-fx-background-color: #33FFFF");
        this.button12.setText("SEK");
        this.button12.setOnAction((e) -> {
            output.setPromptText("SKr " + this.isSEK(input, input.getText()));
        });
        
        
        
        
        
        
        
        
        
        
        
        
        
        GridPane.setConstraints(this.button, 2, 1);
        GridPane.setConstraints(this.button1, 2, 2);
        GridPane.setConstraints(this.button2, 2, 3);
        GridPane.setConstraints(this.button3, 2, 4);
        GridPane.setConstraints(this.button4, 2, 5);
        GridPane.setConstraints(this.button5, 2, 6);
        GridPane.setConstraints(this.button6, 2, 7);
        GridPane.setConstraints(this.button7, 2, 8);
        GridPane.setConstraints(this.button8, 2, 9);
        GridPane.setConstraints(this.button9, 2, 10);
        GridPane.setConstraints(this.button10, 2, 11);
        GridPane.setConstraints(this.button11, 2, 12);
        GridPane.setConstraints(this.button12, 2, 13);
        
        
        
        
        grid.getChildren().addAll(new Node[]{this.button, this.button1, this.button2, this.button3, this.button4, this.button5,
        		this.button6,this.button7,this.button8,this.button9,this.button10,
        		this.button11,this.button12,input, output});
        Scene scene = new Scene(grid, 500.0D, 500.0D);
//        scene.getStylesheets().add(Main.class.getResource("Viper.css").toExternalForm());
        this.window.setScene(scene);
        this.window.show();
    }

    private double isUSD(TextField input1, String text) {
        try {
            URL u = new URL("https://blockchain.info/tobtc?currency=USD&value=1");
            BufferedReader br = new BufferedReader(new InputStreamReader(u.openStream()));
            String s = br.readLine();
            double x = Double.parseDouble(s);
            double y = Double.parseDouble(input1.getText());
            return y / x;
        } catch (Exception var10) {
            return 0.0D;
        }
    }

    private double isCNY(TextField input1, String text) {
        try {
            URL u = new URL("https://blockchain.info/tobtc?currency=CNY&value=1");
            BufferedReader br = new BufferedReader(new InputStreamReader(u.openStream()));
            String s = br.readLine();
            double x = Double.parseDouble(s);
            double y = Double.parseDouble(input1.getText());
            return y / x;
        } catch (Exception var10) {
            return 0.0D;
        }
    }

    private double isJPY(TextField input1, String text) {
        try {
            URL u = new URL("https://blockchain.info/tobtc?currency=JPY&value=1");
            BufferedReader br = new BufferedReader(new InputStreamReader(u.openStream()));
            String s = br.readLine();
            double x = Double.parseDouble(s);
            double y = Double.parseDouble(input1.getText());
            return y / x;
        } catch (Exception var10) {
            return 0.0D;
        }
    }

    private double isEUR(TextField input1, String text) {
        try {
            URL u = new URL("https://blockchain.info/tobtc?currency=EUR&value=1");
            BufferedReader br = new BufferedReader(new InputStreamReader(u.openStream()));
            String s = br.readLine();
            double x = Double.parseDouble(s);
            double y = Double.parseDouble(input1.getText());
            return y / x;
        } catch (Exception var10) {
            return 0.0D;
        }
    }

    private double isRUB(TextField input1, String text) {
        try {
            URL u = new URL("https://blockchain.info/tobtc?currency=RUB&value=1");
            BufferedReader br = new BufferedReader(new InputStreamReader(u.openStream()));
            String s = br.readLine();
            double x = Double.parseDouble(s);
            double y = Double.parseDouble(input1.getText());
            return y / x;
        } catch (Exception var10) {
            return 0.0D;
        }
    }

    private double isINR(TextField input1, String text) {
        try {
            URL u = new URL("https://blockchain.info/tobtc?currency=INR&value=1");
            BufferedReader br = new BufferedReader(new InputStreamReader(u.openStream()));
            String s = br.readLine();
            double x = Double.parseDouble(s);
            double y = Double.parseDouble(input1.getText());
            return y / x;
        } catch (Exception var10) {
            return 0.0D;
        }
    }
    
    private double isSGD(TextField input1, String text) {
        try {
            URL u = new URL("https://blockchain.info/tobtc?currency=SGD&value=1");
            BufferedReader br = new BufferedReader(new InputStreamReader(u.openStream()));
            String s = br.readLine();
            double x = Double.parseDouble(s);
            double y = Double.parseDouble(input1.getText());
            return y / x;
        } catch (Exception var10) {
            return 0.0D;
        }
    }
    
    private double isAUD(TextField input1, String text) {
        try {
            URL u = new URL("https://blockchain.info/tobtc?currency=AUD&value=1");
            BufferedReader br = new BufferedReader(new InputStreamReader(u.openStream()));
            String s = br.readLine();
            double x = Double.parseDouble(s);
            double y = Double.parseDouble(input1.getText());
            return y / x;
        } catch (Exception var10) {
            return 0.0D;
        }
    }

    private double isCAD(TextField input1, String text) {
        try {
            URL u = new URL("https://blockchain.info/tobtc?currency=CAD&value=1");
            BufferedReader br = new BufferedReader(new InputStreamReader(u.openStream()));
            String s = br.readLine();
            double x = Double.parseDouble(s);
            double y = Double.parseDouble(input1.getText());
            return y / x;
        } catch (Exception var10) {
            return 0.0D;
        }
    }
    
    private double isHKD(TextField input1, String text) {
        try {
            URL u = new URL("https://blockchain.info/tobtc?currency=HKD&value=1");
            BufferedReader br = new BufferedReader(new InputStreamReader(u.openStream()));
            String s = br.readLine();
            double x = Double.parseDouble(s);
            double y = Double.parseDouble(input1.getText());
            return y / x;
        } catch (Exception var10) {
            return 0.0D;
        }
    }
    
    private double isNZD(TextField input1, String text) {
        try {
            URL u = new URL("https://blockchain.info/tobtc?currency=NZD&value=1");
            BufferedReader br = new BufferedReader(new InputStreamReader(u.openStream()));
            String s = br.readLine();
            double x = Double.parseDouble(s);
            double y = Double.parseDouble(input1.getText());
            return y / x;
        } catch (Exception var10) {
            return 0.0D;
        }
    }
    
    private double isDKK(TextField input1, String text) {
        try {
            URL u = new URL("https://blockchain.info/tobtc?currency=DKK&value=1");
            BufferedReader br = new BufferedReader(new InputStreamReader(u.openStream()));
            String s = br.readLine();
            double x = Double.parseDouble(s);
            double y = Double.parseDouble(input1.getText());
            return y / x;
        } catch (Exception var10) {
            return 0.0D;
        }
    }
    
    private double isSEK(TextField input1, String text) {
        try {
            URL u = new URL("https://blockchain.info/tobtc?currency=SEK&value=1");
            BufferedReader br = new BufferedReader(new InputStreamReader(u.openStream()));
            String s = br.readLine();
            double x = Double.parseDouble(s);
            double y = Double.parseDouble(input1.getText());
            return y / x;
        } catch (Exception var10) {
            return 0.0D;
        }
    }
    
    private double isISK(TextField input1, String text) {
        try {
            URL u = new URL("https://blockchain.info/tobtc?currency=ISK&value=1");
            BufferedReader br = new BufferedReader(new InputStreamReader(u.openStream()));
            String s = br.readLine();
            double x = Double.parseDouble(s);
            double y = Double.parseDouble(input1.getText());
            return y / x;
        } catch (Exception var10) {
            return 0.0D;
        }
    }
    
    public void handle(ActionEvent arg0) {
    }
}
