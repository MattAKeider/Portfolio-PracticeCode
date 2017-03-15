import javafx.application.Application;
import javafx.scene.control.*;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.geometry.Pos;
import javafx.geometry.Insets;
import javafx.event.ActionEvent;

public class CreatePassword extends Application
{
    private Label prompt;
    private Label lblPassword;
    private Label lblConfirm;
    private PasswordField tfPassword;
    private PasswordField tfConfirm;
    private Button submit;

    //Overridden start method
    @Override
    public void start(Stage primaryStage)
    {
        //Set title of stage
        primaryStage.setTitle("Create Password");

        //Create labels, password fields, and button
        prompt = new Label("Choose and Confirm a Password");
        lblPassword = new Label("Password:");
        lblConfirm = new Label("Confirm:");
        tfPassword = new PasswordField();
        tfConfirm = new PasswordField();
        submit = new Button("Submit");

        //Create rootNode
        GridPane rootNode = new GridPane();
        //Set up rootNode
        createRootNode(rootNode);
        //Add controls to rootNode
        rootNode.add(prompt, 0, 0, 2, 1);
        rootNode.add(lblPassword, 0, 1);
        rootNode.add(tfPassword, 1, 1);
        rootNode.add(lblConfirm, 0, 2);
        rootNode.add(tfConfirm, 1, 2);
        rootNode.add(submit, 0, 4);

        //Submit button ActionEvent
        submit.setOnAction(e -> submitAction(e));

        //Create Scene
        Scene primaryScene = new Scene(rootNode, 600, 500);

        //Add Scene to Stage
        primaryStage.setScene(primaryScene);

        //Show Stage
        primaryStage.show();

    }

    public static void main(String[] args)
    {
        launch(args);
    }

    //createRootNode method sets up GridPane layout as root node
    public GridPane createRootNode(GridPane gridPane)
    {
        //Set padding of root node
        gridPane.setPadding(new Insets(10, 10, 10, 10));
        //Set gaps between controls
        gridPane.setHgap(20);
        gridPane.setVgap(40);
        //Set alignment of controls
        gridPane.setAlignment(Pos.CENTER);

        return gridPane;
    }

    //Handle event when submit button is pushed
    public void submitAction(ActionEvent e)
    {
        //Check if PasswordFields are empty
        if(tfPassword.getText().isEmpty() || tfConfirm.getText().isEmpty())
        {
            Alert alert = new Alert(Alert.AlertType.ERROR, "Field is Empty!");
            alert.show();
        }
        else
        {
            //If both PasswordFields match, password accepted
            if(tfPassword.getText().equals(tfConfirm.getText()))
            {
                Alert alert = new Alert(Alert.AlertType.CONFIRMATION, "Password Accepted!");
                alert.show();
            }
            else
            {
                Alert alert = new Alert(Alert.AlertType.ERROR, "Passwords Do Not Match!");
                alert.show();
            }
        }
    }

}
