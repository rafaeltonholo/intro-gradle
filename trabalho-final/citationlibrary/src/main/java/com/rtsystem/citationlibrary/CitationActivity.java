package com.rtsystem.citationlibrary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class CitationActivity extends AppCompatActivity {
    public static final String BUNDLE_KEY_AUTHOR = "BUNDLE_KEY_AUTHOR";
    public static final String BUNDLE_KEY_CITATION = "BUNDLE_KEY_CITATION";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_citation);
        Bundle bundle = getIntent().getExtras();
        if (bundle != null && bundle.containsKey(BUNDLE_KEY_CITATION)) {
            TextView citationText = (TextView) findViewById(R.id.citation_textview);
            String citation = "";
            if(bundle.containsKey(BUNDLE_KEY_AUTHOR)) {
                citation = bundle.getString(BUNDLE_KEY_AUTHOR, "").concat(" - ");
            }
            citation += bundle.getString(BUNDLE_KEY_CITATION);

            citationText.setText(citation);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_citation, menu);
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
