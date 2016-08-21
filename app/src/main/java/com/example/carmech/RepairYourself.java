package com.example.carmech;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RepairYourself extends Activity{
    Button bat,tyre;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.repairmain);

        bat=(Button) findViewById(R.id.btnBat);
        tyre=(Button) findViewById(R.id.btnTyre);

        bat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(RepairYourself.this,BatteryAct.class));
            }
        });

        tyre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(RepairYourself.this,TyreAct.class));

            }
        });
    }
}
