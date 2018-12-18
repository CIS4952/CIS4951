package linkubank.linkubank;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class incomeSelection extends AppCompatActivity {

    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;
    private Button button5;
    private Button button6;
    private Button button7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_income_selection);

        button1 = (Button) findViewById(R.id.btnEmployer);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v1) {
                linkToEmployer();
            }
        });

        button2 = (Button) findViewById(R.id.btnChildSupport);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v2) {
                linkToChildSupport();
            }
        });
    }

    public void linkToEmployer() {
        Intent intent1 = new Intent(this, employerSelection.class);
        startActivity(intent1);
    }

    public void linkToChildSupport() {
        Intent intent2 = new Intent(this, childSupportAmount.class);
        startActivity(intent2);
    }
}
