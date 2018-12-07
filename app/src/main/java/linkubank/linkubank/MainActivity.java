package linkubank.linkubank;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                //openActivity2();
            }
        });
    }

    /** Called when the user taps the login button */
    public void logIn(View view) {
 //       Intent intent = new Intent(this, Activity2.class);
 //       startActivity(intent);
        //code for new page
    }
}
