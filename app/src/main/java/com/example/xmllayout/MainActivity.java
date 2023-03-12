package com.example.xmllayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RadioGroup rg = findViewById(R.id.rdGroup);
        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener(){
        Button btn= findViewById(R.id.btnCalculate);
            RadioButton rbOk= findViewById(R.id.rdioOkay);
            {
                @Override
                     public void onClick(View view) {

                    double costOfService;
                    double tipAmount;
                    double tipPercentage=0;
                    if(txtCost.getText().equals("")){
                        txtCost.setText("Enter cost of service");
                    }
                    int checkedId= rg.getCheckedRadioButtonId();
                    if(checkedId<0){
                        rbOk.setError("Select service type");
                        return;
                    }
                    try{
                        costOfService= Integer.getInteger(edittext.getText().tostring());

                    }
                    catch(Exception e){
                        edittext.setError("Invalid");
                    }
            }
            }
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId){
                switch (checkedId){
                    case R.id.rdioAmazing:doAmazing:
                        Toast.makeText(MainActivity.this, "Amazing clicked", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.rdioGood:
                        Toast.makeText(MainActivity.this, "Good clicked", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.rdioOkay:
                        Toast.makeText(MainActivity.this, "Ok clicked", Toast.LENGTH_SHORT).show();
                        break;
                }
            }
        });
    }
}