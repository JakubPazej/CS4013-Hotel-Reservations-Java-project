/**
*GUI class that utilizes all of the previous classes to make managing a hotel easier
*
*
* @author 18260179
*/

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class GUI extends Application {
    Scene prime, cst, dsk, spv;
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Who are you?");
        Button cstBtn = new Button();
        cstBtn.setText("Customer");
        Button dskBtn = new Button();
        dskBtn.setText("Desk Personnel");
        Button spvBtn = new Button();
        spvBtn.setText("Supervisor");
        
        cstBtn.setOnAction(e ->{          
                primaryStage.setTitle("Choose an action.");
                Button resBtn = new Button();
                resBtn.setText("Make a reservation");
                Button cncBtn = new Button();
                cncBtn.setText("Cancel a reservation");
                Button bckBtn = new Button();
                bckBtn.setText("Go back");
                
                resBtn.setOnAction(r ->{
                    primaryStage.setScene(prime);
                    primaryStage.setTitle("Who are you?");
                });
                cncBtn.setOnAction(r ->{
                    primaryStage.setScene(prime);
                    primaryStage.setTitle("Who are you?");
                });
                bckBtn.setOnAction(r ->{
                    primaryStage.setScene(prime);
                    primaryStage.setTitle("Who are you?");
                });
                
                StackPane cstRoot = new StackPane();
                cstRoot.getChildren().addAll(resBtn, cncBtn, bckBtn);
                resBtn.setTranslateY(-30);
                cncBtn.setTranslateY(0);
                bckBtn.setTranslateY(30);
                cst=new Scene(cstRoot, 300, 300);
                primaryStage.setScene(cst);
        });
        
        dskBtn.setOnAction(e ->{
                primaryStage.setTitle("Choose an action.");
                Button resBtn = new Button();
                resBtn.setText("Make a reservation");
                Button cncBtn = new Button();
                cncBtn.setText("Cancel a reservation");
                Button bckBtn = new Button();
                bckBtn.setText("Go back");
                Button cinBtn = new Button();
                cinBtn.setText("Check-in a customer");
                Button coutBtn = new Button();
                coutBtn.setText("Check-out a customer");
                
                resBtn.setOnAction(r ->{
                    primaryStage.setScene(prime);
                    primaryStage.setTitle("Who are you?");
                });
                cncBtn.setOnAction(r ->{
                    primaryStage.setScene(prime);
                    primaryStage.setTitle("Who are you?");
                });
                bckBtn.setOnAction(r ->{
                    primaryStage.setScene(prime);
                    primaryStage.setTitle("Who are you?");
                });
                cinBtn.setOnAction(r ->{
                    primaryStage.setScene(prime);
                    primaryStage.setTitle("Who are you?");
                });
                coutBtn.setOnAction(r ->{
                    primaryStage.setScene(prime);
                    primaryStage.setTitle("Who are you?");
                });
                
                StackPane dskRoot = new StackPane();
                dskRoot.getChildren().addAll(resBtn, cncBtn, bckBtn,cinBtn, coutBtn);
                resBtn.setTranslateY(-60);
                cncBtn.setTranslateY(-30);
                bckBtn.setTranslateY(60);
                cinBtn.setTranslateY(0);
                coutBtn.setTranslateY(30);
                dsk=new Scene(dskRoot, 300, 300);
                primaryStage.setScene(dsk);
        });
        
        spvBtn.setOnAction(e ->{
                primaryStage.setTitle("Choose an action.");
                Button resBtn = new Button();
                resBtn.setText("Make a reservation");
                Button cncBtn = new Button();
                cncBtn.setText("Cancel a reservation");
                Button bckBtn = new Button();
                bckBtn.setText("Go back");
                Button cinBtn = new Button();
                cinBtn.setText("Check-in a customer");
                Button coutBtn = new Button();
                coutBtn.setText("Check-out a customer");
                Button discBtn = new Button();
                discBtn.setText("Apply discount to a booking");
                Button anlBtn = new Button();
                anlBtn.setText("Request data analysis");
                
                resBtn.setOnAction(r ->{
                    primaryStage.setScene(prime);
                    primaryStage.setTitle("Who are you?");
                });
                cncBtn.setOnAction(r ->{
                    primaryStage.setScene(prime);
                    primaryStage.setTitle("Who are you?");
                });
                bckBtn.setOnAction(r ->{
                    primaryStage.setScene(prime);
                    primaryStage.setTitle("Who are you?");
                });
                cinBtn.setOnAction(r ->{
                    primaryStage.setScene(prime);
                    primaryStage.setTitle("Who are you?");
                });
                coutBtn.setOnAction(r ->{
                    primaryStage.setScene(prime);
                    primaryStage.setTitle("Who are you?");
                });
                discBtn.setOnAction(r ->{
                    primaryStage.setScene(prime);
                    primaryStage.setTitle("Who are you?");
                });
                anlBtn.setOnAction(r ->{
                    primaryStage.setScene(prime);
                    primaryStage.setTitle("Who are you?");
                });
                
                StackPane spvRoot = new StackPane();
                spvRoot.getChildren().addAll(resBtn, cncBtn, bckBtn,cinBtn, coutBtn, discBtn, anlBtn);
                resBtn.setTranslateY(-90);
                cncBtn.setTranslateY(-60);
                bckBtn.setTranslateY(90);
                cinBtn.setTranslateY(-30);
                coutBtn.setTranslateY(0);
                discBtn.setTranslateY(30);
                anlBtn.setTranslateY(60);
                spv=new Scene(spvRoot, 300, 300);
                primaryStage.setScene(spv);
        });
        
        StackPane root = new StackPane();
        root.getChildren().addAll(cstBtn,dskBtn,spvBtn);
        cstBtn.setTranslateX(-200);
        //cstBtn.setTranslateY(200);
        dskBtn.setTranslateX(0);
        //dskBtn.setTranslateY(200);
        spvBtn.setTranslateX(200);
        //spvBtn.setTranslateY(200);
        prime = new Scene(root, 600, 100);
        primaryStage.setScene(prime);
        primaryStage.show();
    }
}