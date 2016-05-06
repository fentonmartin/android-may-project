package fen.code.mayproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // HERE

    }

    void m01_desc(View view) {
        TextView descm01 = (TextView) findViewById(R.id.textDescm01);
        assert descm01 != null;
        if (descm01.getVisibility() == View.GONE) {
            descm01.setVisibility(View.VISIBLE);
        } else {
            descm01.setVisibility(View.GONE);
        }
    }

    void m01_share(View view) {
        String share = getResources().getString(R.string.m01_name) + "\n" +
                "\n" + getResources().getString(R.string.m01_desc) + "\n" +
                "\n" + getResources().getString(R.string.m01_almt) +
                "\n" + getResources().getString(R.string.m01_telp) +
                "\n" + getResources().getString(R.string.m01_srce);

        Intent txtIntent = new Intent(android.content.Intent.ACTION_SEND);
        txtIntent.setType("text/plain");
        txtIntent.putExtra(android.content.Intent.EXTRA_TEXT, share);
        startActivity(Intent.createChooser(txtIntent, "Share " + getResources().getString(R.string.m01_name)));

    }

}
