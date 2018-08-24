package linkubank.linkubank;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    public void onButtonClick(View v)
    {
        Double monthIncome, monthExpense, monthCashAvail, projectYearlyCash;
        EditText edit1 = (EditText)findViewById(R.id.editText);
        EditText edit2 = (EditText)findViewById(R.id.editText2);
        TextView text1 = (TextView)findViewById(R.id.textView7);
        TextView text2 = (TextView)findViewById(R.id.textView5);

        monthIncome = Double.parseDouble(edit1.getText().toString());
        monthExpense = Double.parseDouble(edit2.getText().toString());

        monthCashAvail = monthIncome - monthExpense;
        text1.setText(Double.toString(monthCashAvail));

        projectYearlyCash = monthCashAvail * 12;
        text2.setText(Double.toString(projectYearlyCash));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
