package my.day13_20191450;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class MainActivity2 extends AppCompatActivity {
    Socket socket = null;
    BufferedReader in = null;
    PrintWriter out = null;
    EditText edit;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        edit = (EditText) findViewById(R.id.editText1);
        Button button = (Button) findViewById(R.id.button);
        TextView tv = (TextView) findViewById(R.id.textView2);
        TextView tv2 = (TextView) findViewById(R.id.textView2);

        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String s = edit.getText().toString();
                Log.i("KKK", "click");
                TCPThread thread = new TCPThread();
                thread.start();
            }
        });
    }
    @Override
    protected void onStop() {
        super.onStop();
        try {
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    class TCPThread extends Thread{
        public void run(){
            try {
                // 호스트 컴퓨터를 지정하려면 에뮬레이터 안에서는 이 주소를 사용
                // 127.0.0.1은 에뮬레이터를 지칭함
                socket = new Socket("172.17.207.120", 5000);
                out = new PrintWriter(socket.getOutputStream());
                in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                String message = edit.getText().toString();
                out.println(message);
                out.flush();
                socket.close();
            } catch(Exception e){
                e.printStackTrace();
            }
        }
    }
}