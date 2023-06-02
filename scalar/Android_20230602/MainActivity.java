package my.day13_20191450;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

        public void click1 (View view){
            Intent intent = new Intent(MainActivity.this, MainActivity2.class);
            startActivity(intent);

        }
        public void click2 (View view){
            Intent intent = new Intent(MainActivity.this, MemoActivity.class);
            startActivity(intent);

        }
        public void click3 (View view){
            Intent intent = new Intent(MainActivity.this, DataActivity.class);
            startActivity(intent);
        }

        public void click4(View view) {
            Intent intent = new Intent(MainActivity.this, loginActivity.class);
            startActivity(intent);
        }
            public void click5(View view){
                Intent intent = new Intent(MainActivity.this, MainActivity3.class);
                startActivity(intent);

        }
    }