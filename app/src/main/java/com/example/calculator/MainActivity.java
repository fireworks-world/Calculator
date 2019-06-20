package com.example.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
EditText e1,e2;
TextView t1;
Button b1,b2,b3,b4,b5,b6,add,sub;
float val1,val2;
Boolean addition;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1=findViewById(R.id.value);
        e2=findViewById(R.id.operation);
        t1=findViewById(R.id.textView);
        b1=findViewById(R.id.button1);
        b2=findViewById(R.id.button2);
        b3=findViewById(R.id.button3);
        b4=findViewById(R.id.button4);
        b5=findViewById(R.id.button5);
        b6=findViewById(R.id.button6);
        add=findViewById(R.id.add);
        sub=findViewById(R.id.sub);
    }
    public void value1(View view){
        e1.setText(e1.getText()+"1");
    }
    public void value2(View view){
        e1.setText(e1.getText()+"2");
    }
    public void sum(View view){
        if(e1==null){
            e1.setText("");
        }else{
            val1=Float.parseFloat(e1.getText()+"");
            addition=true;
            e1.setText("");
            e2.setText("+");
        }
    }
    public void eq(View view){
        val2=Float.parseFloat(e1.getText()+"");
        if (addition == true){
            float total=val1+val2;
            t1.setText(total+"");
            String tv=Float.toString(total);
            e1.setText(tv);
            e2.setText("=");
            addition=false;
        }

    }
}
