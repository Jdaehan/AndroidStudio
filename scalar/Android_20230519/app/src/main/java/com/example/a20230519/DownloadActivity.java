package com.example.a20230519;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import java.io.InputStream;

public class DownloadActivity extends AppCompatActivity {

    public String URL = "";
    EditText edittext;
    ImageView imageview;
    Button button;
    ProgressDialog mProgressDialog;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_download);

        edittext = (EditText) findViewById(R.id.editText);
        imageview = (ImageView) findViewById(R.id.imageview);
        button = (Button) findViewById(R.id.button);


        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                URL = edittext.getText().toString();
                new DownloadImage().execute(URL);

            }
        });
    }

    class DownloadImage extends AsyncTask<String, Void, Bitmap>{

        @Override
        protected Bitmap doInBackground(String... strings) {
            String imageStrings = strings[0];
            Bitmap bitmap = null;
            try{
                InputStream inputStream = new java.net.URL(imageStrings).openStream();
                bitmap = BitmapFactory.decodeStream(inputStream);
            }catch (Exception e){
                e.printStackTrace();
            }
            return bitmap;
        }

        @Override
        protected void onPostExecute(Bitmap bitmap){
            imageview.setImageBitmap(bitmap);

        }
    }
}