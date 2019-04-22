package com.example.amiti.swarnakar_calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Vori_vs_Ana extends AppCompatActivity implements View.OnClickListener{
    private EditText editText1, editText2;
    private TextView anaResultTextView, voriResultTextView;
    private Button button, button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vori_vs__ana);

        editText1 = (EditText) findViewById(R.id.editTextId);
        editText2 = (EditText) findViewById(R.id.editText2Id);

        anaResultTextView = (TextView) findViewById(R.id.resultTextViewId);
        voriResultTextView = (TextView) findViewById(R.id.result2TextViewId);

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
                double ana = num * 16;
                anaResultTextView.setText("    "+ana + " আনা    ");
            }
            else {
                Toast.makeText(Vori_vs_Ana.this, "স্বর্ণের পরিমাণ ভরিতে প্রদান করুন", Toast.LENGTH_SHORT).show();
            }
        }
        if(v.getId() == R.id.button2Id){
            String str2 = editText2.getText().toString();
            if(!str2.isEmpty()) {
                double num = Double.parseDouble(str2);
                double vori = num * 0.0625;
                voriResultTextView.setText("    "+vori + " ভরি    ");
            }
            else{
                Toast.makeText(Vori_vs_Ana.this,"স্বর্ণের পরিমাণ আনাতে প্রদান করুন",Toast.LENGTH_SHORT).show();
            }
        }

    }
}