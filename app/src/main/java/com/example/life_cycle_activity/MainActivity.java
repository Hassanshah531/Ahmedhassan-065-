package com.example.life_cycle_activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
private Button btn0,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btnadd,btnsub,btnmul,btndiv,btndot,btnclear,btnequal;
EditText edit1;
float result1,result2;
boolean add,sub,mul,div;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn0=(Button)findViewById(R.id.btn0);
        btn1=(Button)findViewById(R.id.btn1);
        btn2=(Button)findViewById(R.id.btn2);
        btn3=(Button)findViewById(R.id.btn3);
        btn4=(Button)findViewById(R.id.btn4);
        btn5=(Button)findViewById(R.id.btn5);
        btn6=(Button)findViewById(R.id.btn6);
        btn7=(Button)findViewById(R.id.btn7);
        btn8=(Button)findViewById(R.id.btn8);
        btn9=(Button)findViewById(R.id.btn9);
        btndot=(Button)findViewById(R.id.btndot);
        btnadd=(Button)findViewById(R.id.btnadd);
        btnsub=(Button)findViewById(R.id.btnsub);
        btnmul=(Button)findViewById(R.id.btnmul);
        btndiv=(Button)findViewById(R.id.btndiv);
        btnequal=(Button)findViewById(R.id.btnequal);
        btnclear=(Button)findViewById(R.id.btnclear);
        edit1=(EditText)findViewById(R.id.edt1);

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn0.setText(btn0.getText()+"0");
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn0.setText(btn0.getText()+"1");
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn0.setText(btn0.getText()+"2");
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn0.setText(btn0.getText()+"3");
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn0.setText(btn0.getText()+"4");
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn0.setText(btn0.getText()+"5");
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn0.setText(btn0.getText()+"6");
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn0.setText(btn0.getText()+"7");
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn0.setText(btn0.getText()+"8");
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn0.setText(btn0.getText()+"9");
            }
        });

        btndot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn0.setText(btn0.getText()+".");
            }
        });



        btnadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(edit1==null)
                {
                    edit1.setText("");
                }
                else{
                    result1=Float.parseFloat(edit1.getText()+"");
                    add=true;
                    edit1.setText(null);
                }
            }
        });


        btnsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(edit1==null)
                {
                    edit1.setText("");
                }
                else{
                    result1=Float.parseFloat(edit1.getText()+"");
                    sub=true;
                    edit1.setText(null);
                }
            }
        });


        btnmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(edit1==null)
                {
                    edit1.setText("");
                }
                else{
                    result1=Float.parseFloat(edit1.getText()+"");
                    mul=true;
                    edit1.setText(null);
                }
            }
        });


        btndiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(edit1==null)
                {
                    edit1.setText("");
                }
                else{
                    result1=Float.parseFloat(edit1.getText()+"");
                    div=true;
                    edit1.setText(null);
                }
            }
        });



        btnequal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result2=Float.parseFloat(edit1.getText()+"");
                if(add==true){
                    edit1.setText(result1+result2+"");
                    add=false;
                }

                if(sub==true){
                    edit1.setText(result1-result2+"");
                    sub=false;
                }

                if(mul==true){
                    edit1.setText(result1*result2+"");
                    mul=false;
                }

                if(div==true){
                    edit1.setText(result1/result2+"");
                    div=false;
                }

            }
        });


        btnclear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edit1.setText("");
            }
        });





    }
}
