package linkubank.linkubank;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.lang.String;
import java.util.concurrent.ExecutionException;

public class MainActivity extends AppCompatActivity
{
    EditText editUser, editPass;

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editUser = (EditText)findViewById(R.id.editText);
        editPass = (EditText)findViewById(R.id.editText3);

        button = (Button) findViewById(R.id.btnLogin);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                logInApp();
            }
        });
    }

    /** Called when the user taps the Login button */
    public void logInApp() {

        String username = editUser.getText().toString();
        String password = editPass.getText().toString();
        //String username = "TimIversen";
        //String password = "Linkuban";
        String type = "login";
        BackgroundWorker backgroundWorker = new BackgroundWorker(this);
        try {
            String result = backgroundWorker.execute(type, username, password).get();
            if( result.equals("Login Success")) {
                Intent intent = new Intent(this, budgetStartPage.class);
                startActivity(intent);
            }
            else {
                AlertDialog.Builder alertDialogBuilder =
                        new AlertDialog.Builder(this)
                                .setTitle("Login Status")
                                .setMessage("Login Failed");

                AlertDialog alertDialog = alertDialogBuilder.show();
            }
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
