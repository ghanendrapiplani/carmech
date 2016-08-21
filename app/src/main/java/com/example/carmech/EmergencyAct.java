package com.example.carmech;


import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class EmergencyAct extends Activity{
    Button pol,fire,amb,wom,sen;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.emergency_contacts);

        pol=(Button) findViewById(R.id.button);
        pol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:"+pol.getText().toString()));
                startActivity(intent);
            }
        });
        fire=(Button) findViewById(R.id.button2);
        fire.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:"+fire.getText().toString()));
                startActivity(intent);
            }
        });
        amb=(Button) findViewById(R.id.button22);
        amb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:"+amb.getText().toString()));
                startActivity(intent);
            }
        });
        wom=(Button) findViewById(R.id.button222);
        wom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:"+wom.getText().toString()));
                startActivity(intent);
            }
        });
        sen=(Button) findViewById(R.id.button2222);
        sen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:"+sen.getText().toString()));
                startActivity(intent);
            }
        });
    }
}
