package com.example.bt3javasapxep;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    private EditText edtInputNumbers;
    private RadioGroup radioGroup;
    private Button btnSort;
    private TextView tvResult;
    private Button btnClose;
    private Button btnClear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtInputNumbers = findViewById(R.id.edtInputNumbers);
        radioGroup = findViewById(R.id.radioGroup);
        btnSort = findViewById(R.id.btnSort);
        tvResult = findViewById(R.id.edtSortedNumbers);
        btnClose = findViewById(R.id.btnClose);
        btnClear = findViewById(R.id.btnClear);

        btnSort.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String input = edtInputNumbers.getText().toString();
                String[] numbersArray = input.split(" ");
                int[] numbers = new int[numbersArray.length];
                for (int i = 0; i < numbersArray.length; i++) {
                    try {
                        numbers[i] = Integer.parseInt(numbersArray[i]);
                    } catch (NumberFormatException e) {
                        tvResult.setText("Dãy số không hợp lệ.");
                        return;
                    }
                }

                int selectedRadioButtonId = radioGroup.getCheckedRadioButtonId();
                String algorithm = "";
                switch (selectedRadioButtonId) {
                    case R.id.radioSelectionSort:
                        algorithm = "Selection Sort";
                        SelectionSort.sort(numbers);
                        break;
                    case R.id.radioBubbleSort:
                        algorithm = "Bubble Sort";
                        BubbleSort.sort(numbers);
                        break;
                    case R.id.radioInterchangeSort:
                        algorithm = "Interchange Sort";
                        InterchangeSort.sort(numbers);
                        break;
                }

                tvResult.setText("Dãy số được sắp xếp theo giải thuật " + algorithm + ":\n" + Arrays.toString(numbers));
            }
        });

        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edtInputNumbers.setText("");
                tvResult.setText("");
            }
        });

        btnClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}
