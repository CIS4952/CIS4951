package linkubank.linkubank;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class scrollingIncomeInputPage extends AppCompatActivity {

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scrolling_income_input_page);

        button = (Button) findViewById(R.id.btnSaveIncome);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v1) {
                linkToBudgetStartSelect();
            }
        });
    }

    public void linkToBudgetStartSelect() {
        Intent intent = new Intent(this, budgetStartSelect.class);
        startActivity(intent);
    }
}
