package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class TinhActivity extends AppCompatActivity  {
    private TextView kq;
    private EditText edit1,edit2;
    private Button btAdd;
    private Spinner sp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tinh);
        initView();
        btAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nn1 = edit1.getText().toString();
                String nn2 = edit2.getText().toString();
                double n1,n2;
                try {
                    n1 = Double.parseDouble(nn1);
                    n2 = Double.parseDouble(nn2);
                    String kk = tinhtoan(n1,n2,"+");
                    kq.setText(kk);
                    Toast.makeText(getApplicationContext(),kk,Toast.LENGTH_LONG).show();
                }catch (NumberFormatException e){
                    Toast.makeText(getApplicationContext(),
                            "nhap 2 so thang beo",Toast.LENGTH_LONG).show();
                }
            }
        });
        sp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String nn1 = edit1.getText().toString();
                String nn2 = edit2.getText().toString();
                double n1,n2;
                try {
                    n1 = Double.parseDouble(nn1);
                    n2 = Double.parseDouble(nn2);
                    String p=sp.getSelectedItem().toString();
                    String kk = tinhtoan(n1,n2,p);
                    kq.setText(kk);
                    Toast.makeText(getApplicationContext(),kk,Toast.LENGTH_LONG).show();
                }catch (NumberFormatException e){
                    Toast.makeText(getApplicationContext(),
                            "nhap 2 so thang beo",Toast.LENGTH_LONG).show();
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                String nn1 = edit1.getText().toString();
                String nn2 = edit2.getText().toString();
                double n1,n2;
                try {
                    n1 = Double.parseDouble(nn1);
                    n2 = Double.parseDouble(nn2);
                    String kk = tinhtoan(n1,n2,"+");
                    kq.setText(kk);
                    Toast.makeText(getApplicationContext(),kk,Toast.LENGTH_LONG).show();
                }catch (NumberFormatException e){
                    Toast.makeText(getApplicationContext(),
                            "nhap 2 so thang beo",Toast.LENGTH_LONG).show();
                }
            }
        });
    }
    private void initView() {
        kq=findViewById(R.id.kq);
        edit1=findViewById(R.id.e1);
        edit2=findViewById(R.id.e2);
        btAdd=findViewById(R.id.btAdd);
        sp=findViewById(R.id.sp);
    }
//    public void add(View v){
//        String nn1 = edit1.getText().toString();
//        String nn2 = edit2.getText().toString();
//        double n1,n2;
//        try {
//            n1 = Double.parseDouble(nn1);
//            n2 = Double.parseDouble(nn2);
//            String kk = tinhtoan(n1,n2,"+");
//            kq.setText(kk);
//            Toast.makeText(this,kk,Toast.LENGTH_LONG).show();
//        }catch (NumberFormatException e){
//
//        }
//    }
    private String tinhtoan(double x, double y, String p){
        String s = "";
        switch (p){
            case"+":s="Tong"+(x+y);
            break;
            case"-":s="Tong"+(x-y);
            break;
            case"*":s="Tong"+(x*y);
            break;
            case"/":
                if(y==0)
                    s="khong chia cho 0";
                else
                    s="Tong"+(x/y);
            break;
        }
        return s;
    }
}