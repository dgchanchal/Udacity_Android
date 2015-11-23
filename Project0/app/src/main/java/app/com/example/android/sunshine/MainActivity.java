package app.com.example.android.sunshine;

import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
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
    public void sendMessage(View view)
    {
        Context context = getApplicationContext();
        CharSequence text = "This button will launch ";
        int duration = Toast.LENGTH_SHORT;
        switch (view.getId()) {
            case R.id.spotifyButton:
                text = text + "spotify manager app";
                break;
            case R.id.scoreButton:
                text = text + "score app";
                break;
            case R.id.librayButton:
                text = text + "library app";
                break;
            case R.id.buildItBiggerButton:
                text = text + "build it bigger app";
                break;
            case R.id.xyzReaderButton:
                text = text + "xyz reader app";
                break;
            case R.id.capstonMyOwnAppButton:
                text = text + "capsatone app";
                break;
        }
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    // Place holde fragment

    public static class PlaceholderFragment extends Fragment{

        public PlaceholderFragment()
        {

        }


    }

}
