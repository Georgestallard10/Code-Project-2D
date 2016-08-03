/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NonGame_Practice_JavaFx;
import javafx.geometry.Insets;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author George's_Laptop
 */
public class Basic_Window extends Application {
    
    @Override
    public void start(Stage primaryStage){
        Button btn1 = new Button();
        Button btn2 = new Button();
        btn1.setText("say 'hello world'");
        btn2.setText("Quit");
        btn1.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event){
                System.out.println("Hello world");
                primaryStage.setTitle("Working well");
                
            }
    });
        btn2.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event){
                primaryStage.close();
            }
    });
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));
        grid.add(btn1,0,0);
        grid.add(btn2,0,1);
        
        Scene scene = new Scene(grid,680,420);
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
             
    }
    public static void main (String[] args){
        launch(args);
    }
    
    
}
