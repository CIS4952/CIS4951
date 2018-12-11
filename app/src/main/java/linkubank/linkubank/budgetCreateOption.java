package linkubank.linkubank;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class budgetCreateOption extends AppCompatActivity {

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_budget_create_option);

        button = (Button) findViewById(R.id.btnCreateManualBudget);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                budgetStartSelect();
            }
        });
    }

    public void budgetStartSelect() {
        Intent intent = new Intent(this, budgetStartSelect.class);
        startActivity(intent);
    }
}
