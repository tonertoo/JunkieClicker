package org.fiipl.games.junkieclicker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public static void add(){
        TextView HowManyClicks = (TextView) findViewById(R.Id.Clicks);

        HowManyClicks.setText("1");
    }
}
