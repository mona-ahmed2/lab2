package com.example.lab2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
Button b ;
EditText e ;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b=(Button)findViewById(R.id.sendbutton);
        e=findViewById(R.id.personal);
        b.setOnClickListener(new View.OnClickListener(){



   public void onClick(View view ){
       String s =e.getText().toString();
       Intent intent = new Intent(getApplicationContext(),MainActivity2.class);
       intent.putExtra( "personal",s);

       startActivity(intent);



   }
});
        }}