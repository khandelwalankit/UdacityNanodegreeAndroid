package com.example.akhande.my_app_portfolio;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Context context = getApplicationContext();
        final int myAppBtnDuration = Toast.LENGTH_SHORT;

        final Button buttonSpotifyStreamer = (Button) findViewById(R.id.button);
        buttonSpotifyStreamer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CharSequence text = "This Button will launch Spotify Streamer App!";
                Toast myAppToast = Toast.makeText(context,text,myAppBtnDuration);
                myAppToast.show();
            }
        });

        final Button buttonScoresApp = (Button) findViewById(R.id.button2);
        buttonScoresApp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CharSequence text = "This Button will launch Football Scores App!";
                Toast myAppToast = Toast.makeText(context,text,myAppBtnDuration);
                myAppToast.show();
            }
        });

        final Button buttonLibraryApp = (Button) findViewById(R.id.button3);
        buttonLibraryApp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CharSequence text = "This Button will launch Library App!";
                Toast myAppToast = Toast.makeText(context,text,myAppBtnDuration);
                myAppToast.show();
            }
        });

        final Button buttonBuildItBigApp = (Button) findViewById(R.id.button4);
        buttonBuildItBigApp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CharSequence text = "This Button will launch extensible version of current Apps!";
                Toast myAppToast = Toast.makeText(context,text,myAppBtnDuration);
                myAppToast.show();
            }
        });

        final Button buttonReaderApp = (Button) findViewById(R.id.button5);
        buttonReaderApp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CharSequence text = "This Button will launch XYZ Reader App!";
                Toast myAppToast = Toast.makeText(context,text,myAppBtnDuration);
                myAppToast.show();
            }
        });

        final Button buttonCapstoneApp = (Button) findViewById(R.id.button6);
        buttonCapstoneApp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CharSequence text = "This Button will launch My CapStone App!";
                Toast myAppToast = Toast.makeText(context,text,myAppBtnDuration);
                myAppToast.show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
