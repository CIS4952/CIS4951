package linkubank.linkubank;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class budgetStartPage extends AppCompatActivity {

    private Button button1; //Initialization for btnLinkProf
    private Button button2; //Initialization for btnCreateBudget

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_budget_start_page);

        button1 = (Button) findViewById(R.id.btnLinkProf);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v1) {
                linkToProf();
            }
        });

        button2 = (Button) findViewById(R.id.btnCreateBudget);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v2) {
                budgetCreate();
            }
        });
    }

    //Code for opening Link to professional page
    public void linkToProf() {
        Intent intent1 = new Intent(this, linkProfessionals.class);
        startActivity(intent1);
    }

    //Code for opening Budget creation page
    public void budgetCreate() {
        Intent intent2 = new Intent(this, budgetCreateOption.class);
        startActivity(intent2);
    }
}
