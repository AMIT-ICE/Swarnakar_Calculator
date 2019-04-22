package com.example.amiti.swarnakar_calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class PriceActivity extends AppCompatActivity implements View.OnClickListener{

    private EditText anaEditText, voriEditText, unitPriceEditText;
    private Button calcButton;
    private TextView priceTextView;
    private ImageView moneyImage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_price);

        calcButton = (Button) findViewById(R.id.calcButtonID);
        anaEditText = (EditText) findViewById(R.id.anaEditTextId);
        voriEditText = (EditText) findViewById(R.id.voriEditTextId);
        priceTextView = (TextView) findViewById(R.id.priceTextViewId);
        moneyImage = (ImageView) findViewById(R.id.moneyImageID);
        unitPriceEditText = (EditText) findViewById(R.id.unitPriceEditTextId);

        calcButton.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        String voristr = voriEditText.getText().toString();
        String anastr = anaEditText.getText().toString();
        String unitPrice = unitPriceEditText.getText().toString();

        if (v.getId() == R.id.calcButtonID) {

            if((anastr.isEmpty() && voristr.isEmpty())|| (unitPrice.isEmpty())) {
                Toast.makeText(PriceActivity.this, "অনুগ্রহপূর্বক স্বর্ণের পরিমাণ ও প্রতি ভরি মূল্য প্রদান করুন", Toast.LENGTH_SHORT).show();
            }
            else {
                if (voristr.isEmpty()) {
                    double ana = Double.parseDouble(anastr);                 //If vori is null
                    double u = Double.parseDouble(unitPrice);
                    double totalPrice = u * ana * 0.0625;
                    moneyImage.setImageResource(R.drawable.money);
                    priceTextView.setText(""+totalPrice+"৳");

                }
                if (anastr.isEmpty()) {
                    double vori = Double.parseDouble(voristr);               // If ana is null
                    double u = Double.parseDouble(unitPrice);
                    double totalPrice = u * vori;
                    moneyImage.setImageResource(R.drawable.money);
                    priceTextView.setText(""+totalPrice+"৳");
                }
                if ((!anastr.isEmpty()) && (!voristr.isEmpty())) {
                    double ana = Double.parseDouble(anastr);
                    double vori = Double.parseDouble(voristr);
                    double unitprice = Double.parseDouble(unitPrice);
                    double totalPrice = (vori + ana * 0.0625) * unitprice;
                    moneyImage.setImageResource(R.drawable.money);
                    priceTextView.setText(""+totalPrice+"৳");
                }
            }
        }
    }
}
