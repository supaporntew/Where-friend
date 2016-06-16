package kru.supaporntew.wherefriend;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }//Main Method

    public void clicksingUpMain(View view) {

        startActivity(new Intent(MainActivity.this,SignUpActivity.class));
    }// clickSingUp
    }
//Main Class
