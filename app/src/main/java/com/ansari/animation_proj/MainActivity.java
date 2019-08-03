package com.ansari.animation_proj;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    TextView textView;
    Animation animation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textViewAnim);



    }

    public void clickmeMethod(View view) {
       // Toast.makeText(this, "button clicked", Toast.LENGTH_SHORT).show();

        /*animation = AnimationUtils.loadAnimation(MainActivity.this,R.anim.fade_in);

        textView.startAnimation(animation);*/

        Intent i = new Intent(MainActivity.this,Main2Activity.class);
        startActivity(i);
        overridePendingTransition(R.anim.fade_in,R.anim.fade_in);
    }
}
