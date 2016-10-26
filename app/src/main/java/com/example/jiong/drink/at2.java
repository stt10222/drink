package com.example.jiong.drink;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;

public class at2 extends AppCompatActivity
{

    EditText drink;
    Button sent;
    RadioGroup rg1;
    RadioGroup rg2;
  /*  EditText drink=(EditText) findViewById(R.id.editText);
    Button sent =(Button)findViewById(R.id.button2);
    RadioGroup rg1=(RadioGroup)findViewById(R.id.radiogroup1);
    RadioGroup rg2=(RadioGroup)findViewById(R.id.radiogroup2);
    */
    String suger = "無糖";
    String ice = "微氷";

    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_at2);

        rg1=(RadioGroup)findViewById(R.id.radiogroup1);
        rg1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {

            @Override
            public void onCheckedChanged(RadioGroup group,int checkedId)
            {
                switch(checkedId)
                {
                    case R.id.radioButton:
                        suger="無糖";
                        break;
                    case R.id.radioButton2:
                        suger="少糖";
                        break;
                    case R.id.radioButton3:
                        suger="半糖";
                        break;
                    case R.id.radioButton4:
                        suger="黃金比例";
                        break;
                }
            }
        });

        rg2=(RadioGroup)findViewById(R.id.radiogroup2);
        rg2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(RadioGroup group,int checkedId)
            {
                switch(checkedId)
                {
                    case R.id.radioButton5:
                        ice="微冰";
                        break;
                    case R.id.radioButton6:
                        ice="少冰";
                        break;
                    case R.id.radioButton7:
                        ice="正常冰";
                        break;
                }
            }
        });

        sent =(Button)findViewById(R.id.button2);
        sent.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {

                drink=(EditText) findViewById(R.id.editText);


                String temp =drink.getText().toString();
                Intent i=new Intent();
                Bundle b=new Bundle();
                b.putString("drink_level",temp);
                b.putString("suger_level",suger);
                b.putString("ice_level",ice);
                i.putExtras(b);
               // i.setClass(at2.this,at1.class);
                setResult(101,i);
                finish();
            }
        });

    }
}
