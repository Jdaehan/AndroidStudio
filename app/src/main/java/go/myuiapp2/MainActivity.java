package go.myuiapp2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.TimePicker;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    TimePicker timePicker;
    TextView tv_time;
    String format = "";
    Calendar calendar; // java.util

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        timePicker = findViewById(R.id.timepicker);
        tv_time = (TextView) findViewById(R.id.time);
        calendar = calendar.getInstance(); // 생성자가 private로 돼 있어서 new 사용 불가 getInstance();

        int hour = calendar.get(Calendar.HOUR_OF_DAY);
        int min = calendar.get(Calendar.MINUTE);

        setTime(hour, min);
    }
    //onClick() 이벤트 구현 // ★
    public void displayTime(View view){
        int hour = timePicker.getHour();
        int minute = timePicker.getMinute();
        setTime(hour,minute);
    }
    public void setTime(int hour, int minute) {
        if (hour == 0) {
            hour += 12;
            format = "AM";
        }   else if (hour == 12) {
            hour -= hour;
            format = "AM";
        }   else if (hour > 12 ) {
            hour -= 12;
            format = "PM";
        } else {
            format = "AM";
        }
        tv_time.setText(new StringBuilder().append(hour).append(":").append(minute).append(" ").append(format));

        }
    }


