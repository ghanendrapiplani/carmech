package com.example.carmech;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class UserSelection extends Activity {
    private Button btnExist,btnNew,btnOff;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.userselection);

        btnExist=(Button) findViewById(R.id.btnGotoLogin);
        btnNew=(Button) findViewById(R.id.btnGotoSignup);
        btnOff=(Button) findViewById(R.id.btnOffline);

        btnNew.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("signup clicked");
                startActivity(new Intent(UserSelection.this, SignUpActivity.class));
            }
        });

        btnExist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("login clicked");
                startActivity(new Intent(UserSelection.this, LoginUser.class));
            }
        });

        btnOff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(UserSelection.this, RepairYourself.class));
            }
        });
    }
}
