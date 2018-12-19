package linkubank.linkubank;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class budgetStartSelect extends AppCompatActivity {

    private Button button1;
    private Button button2;
    private Button button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_budget_start_select);

        button1 = (Button) findViewById(R.id.btnIncome);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v1) {
                linkToIncome();
            }
        });

        button2 = (Button) findViewById(R.id.btnExpenses);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v2) {
                linkToExpenses();
            }
        });

        button3 = (Button) findViewById(R.id.btnViewReport);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v3) {
                linkToReportPage();
            }
        });
    }

    public void linkToIncome() {
        Intent intent1 = new Intent(this, scrollingIncomeInputPage.class);
        startActivity(intent1);
    }

    public void linkToExpenses() {
        Intent intent2 = new Intent(this, scrollingExpenseInputPage.class);
        startActivity(intent2);
    }

    public void linkToReportPage() {
        Intent intent3 = new Intent(this, reportPage.class);
        startActivity(intent3);
    }
}
