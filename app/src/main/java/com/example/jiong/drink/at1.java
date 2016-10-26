package com.example.jiong.drink;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class at1 extends AppCompatActivity
{
    Button btn;
    TextView tx1;
    TextView tx2;
    TextView tx3;
 /*   Button btn=(Button) findViewById(R.id.button);
    TextView tx1=(TextView) findViewById(R.id.textView4);
    TextView tx2=(TextView) findViewById(R.id.textView6);
    TextView tx3=(TextView) findViewById(R.id.textView8);
*/
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_at1);
        btn=(Button) findViewById(R.id.button);
     btn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent i=new Intent();
                i.setClass(at1.this,at2.class);
                startActivityForResult(i,0);
            }
        });

    }

   protected void onActivityResult(int requestCode,int resuleCode,Intent data)
    {
        if(requestCode==0)
        {
            if(resuleCode==101)
            {
                Bundle b=data.getExtras();
                String str1=b.getString("drink_level");
                String str2=b.getString("suger_level");
                CharSequence str3=b.getString("ice_level");

                tx1=(TextView) findViewById(R.id.textView4);
                tx2=(TextView) findViewById(R.id.textView6);
                tx3=(TextView) findViewById(R.id.textView8);

                tx1.setText(str1);
                tx2.setText(str2);
                tx3.setText(str3);
            }
        }
    }

}


