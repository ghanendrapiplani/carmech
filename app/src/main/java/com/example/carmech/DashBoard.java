package com.example.carmech;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.firebase.client.AuthData;
import com.firebase.client.Firebase;


public class DashBoard extends Activity {
    private Button btnRegPark, btnEmer,btnRepair,btnMyWheels,btnAbout,btnLogout;
    private Firebase ref;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dashboardview);
        Firebase.setAndroidContext(this);
        ref = new Firebase("https://carmech.firebaseio.com/");
        startService(new Intent(DashBoard.this, LocService.class));

        btnRegPark=(Button) findViewById(R.id.btnRegisterPark);
        btnRepair=(Button) findViewById(R.id.btnRepair);
        btnMyWheels=(Button) findViewById(R.id.btnmywheels);
        btnAbout=(Button) findViewById(R.id.btnAboutUs);
        btnLogout=(Button) findViewById(R.id.btnLogoutUser);
        btnEmer=(Button) findViewById(R.id.btnEmergency);

        btnEmer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DashBoard.this,EmergencyAct.class));
            }
        });
        btnRepair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DashBoard.this, RepairYourself.class));
            }
        });

        btnAbout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DashBoard.this, AboutUsAct.class));
            }
        });

        btnRegPark.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DashBoard.this, FindNearestAct.class));
            }
        });

        btnMyWheels.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DashBoard.this, MyWheelsAct.class));
            }
        });

        btnLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("Shaker out");
                ref.unauth();
                ref.addAuthStateListener(new Firebase.AuthStateListener() {
                    @Override
                    public void onAuthStateChanged(AuthData authData) {
                        if (authData != null) {
                            // user is logged in
                        } else {
                            Toast.makeText(DashBoard.this, "Successfully logged out.", Toast.LENGTH_SHORT).show();
                            Intent goToRegisterPage = new Intent(DashBoard.this, MainActivity.class);
                            stopService(new Intent(DashBoard.this,LocService.class));
                            startActivity(goToRegisterPage);
                        }
                    }
                });
            }
        });
    }

    @Override
    public void onBackPressed() {
        Toast.makeText(DashBoard.this, "Please logout to login as different user.",Toast.LENGTH_LONG).show();
    }
}
