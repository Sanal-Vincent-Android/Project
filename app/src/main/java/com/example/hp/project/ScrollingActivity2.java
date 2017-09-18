package com.example.hp.project;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.TextView;

public class ScrollingActivity2 extends AppCompatActivity {
    TextView tv1,tv2,tv3,tv4,tv5,tv6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scrolling2);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        Intent getData= getIntent();
        tv1=(TextView)findViewById(R.id.tit);
        tv2=(TextView)findViewById(R.id.email);
        tv3=(TextView)findViewById(R.id.id);
        tv4=(TextView)findViewById(R.id.address);
        tv5=(TextView)findViewById(R.id.phone);
        tv6=(TextView)findViewById(R.id.phon);
        String fullname=getData.getStringExtra("fullname");
        String email=getData.getStringExtra("email");
        String id=getData.getStringExtra("id");
        String address=getData.getStringExtra("address");
        String number=getData.getStringExtra("number");
        String home=getData.getStringExtra("home");
        tv1.setText(fullname);
        tv2.setText(email);
        tv3.setText(id);
        tv4.setText(address);
        tv5.setText(number);
        tv6.setText(home);

       /* FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });*/
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == android.R.id.home) {
            Intent intent = new Intent(ScrollingActivity2.this, Company.class);
            startActivity(intent);
            finish();
        }
        return super.onOptionsItemSelected(menuItem);
    }
}
