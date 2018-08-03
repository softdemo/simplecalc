package calculator.com;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText num1, num2;
    Button add, sub, mult, div;
    TextView display;
    double sum, number1 ,number2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num1 = findViewById(R.id.num1);
        num2 = findViewById(R.id.num2);
        add = findViewById(R.id.add);
        sub = findViewById(R.id.sub);
        mult = findViewById(R.id.mult);
        div = findViewById(R.id.div);
        display = findViewById(R.id.display);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                number1=Double.parseDouble(num1.getText().toString());
                number2=Double.parseDouble(num2.getText().toString());
                sum = number1 + number2;

                        display.setText(String.valueOf(sum));
            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                number1=Double.parseDouble(num1.getText().toString());
                number2=Double.parseDouble(num2.getText().toString());
                sum = number1 - number2;

                display.setText(String.valueOf(sum));

            }
        });
        mult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                number1=Double.parseDouble(num1.getText().toString());
                number2=Double.parseDouble(num2.getText().toString());
                sum = number1 * number2;

                display.setText(String.valueOf(sum));

            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                number1=Double.parseDouble(num1.getText().toString());
                number2=Double.parseDouble(num2.getText().toString());
                sum = number1 / number2;

                display.setText(String.valueOf(sum));

            }
        });
    }


}

