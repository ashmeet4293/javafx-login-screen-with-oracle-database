package javafxfirstcodingapp;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;


public class JavafxFirstCodingApp extends Application {
       public static void main(String[] args) {
        launch(args);
    }
    Stage window;
    @Override
    public void start(Stage primaryStage) {
       window=primaryStage;
       
       //Layouts
       BorderPane borderPane=new BorderPane();
       GridPane grid=new GridPane();
       
       //UI Control
       Label title=new Label("Student Login System");
       Label lblUsername=new Label("Username ");
       Label lblPassword=new Label("Password ");
       TextField txtUsername=new TextField();
       txtUsername.setPromptText("username ");
       PasswordField txtPassword=new PasswordField();
       txtPassword.setPromptText("password");
       Button btnLogin =new Button("Login ");
       Button btnSignUp=new Button("Signup ");
       
       grid.add(lblUsername, 1, 0);
       grid.add(txtUsername, 2, 0);
       //second row
       grid.add(lblPassword,1,1);
       grid.add(txtPassword,2,1);
       //Thrid row
       grid.add(btnLogin, 1, 2);
       grid.add(btnSignUp, 2, 2);
       
       btnLogin.setOnAction(e->{ //Lambda Expression Note : the lambda expression should denote
                                //in parameter
            String username, password;
            username=txtUsername.getText();
            password=txtPassword.getText();
            
           System.out.println("Welcome  "+username+ "Your password is : "+password);
           System.out.println("Succesfully ");
           
       });
       
//       borderPane.setTop(title);
//       borderPane.setCenter(grid);
       grid.setAlignment(Pos.CENTER);
       Scene scene=new Scene(grid ,800,500);
       window.setScene(scene);
       window.show();
       
       
    }


}




















