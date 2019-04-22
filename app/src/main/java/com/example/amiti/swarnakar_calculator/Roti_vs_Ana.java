package com.example.amiti.swarnakar_calculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Roti_vs_Ana extends AppCompatActivity implements View.OnClickListener{
    private EditText editText1, editText2;
    private TextView anaResultTextView, rotiResultTextView;
    private Button button, button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_roti_vs__ana);
        editText1 = (EditText) findViewById(R.id.editTextId);
        editText2 = (EditText) findViewById(R.id.editText2Id);

        anaResultTextView = (TextView) findViewById(R.id.resultTextViewId);
        rotiResultTextView = (TextView) findViewById(R.id.result2TextViewId);

        button = (Button) findViewById(R.id.buttonId);
        button2 = (Button) findViewById(R.id.button2Id);

        button.setOnClickListener(this);
        button2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.buttonId) {
            String str1 = editText1.getText().toString();
            if (!str1.isEmpty()) {
                double num = Double.parseDouble(str1);
                double ana = num * 6;
                anaResultTextView.setText("    "+ana + " আনা    ");
            }
            else {
                Toast.makeText(Roti_vs_Ana.this, "স্বর্ণের পরিমাণ রতিতে প্রদান করুন", Toast.LENGTH_SHORT).show();
            }
        }
        if(v.getId() == R.id.button2Id){
            String str2 = editText2.getText().toString();
            if(!str2.isEmpty()) {
                double num = Double.parseDouble(str2);
                double roti = num / 6;
                rotiResultTextView.setText("    "+roti + " রতি    ");
            }
            else{
                Toast.makeText(Roti_vs_Ana.this, "স্বর্ণের পরিমাণ আনাতে প্রদান করুন", Toast.LENGTH_SHORT).show();
            }
        }
    }
}
