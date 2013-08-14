package pl.lgawin.sandbox.holodialogs;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.Menu;
import android.view.View;

import eu.inmite.android.lib.dialogs.SimpleDialogFragment;


public class MainActivity extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.button1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SimpleDialogFragment.createBuilder(getContext(), getSupportFragmentManager())
                        .setTitle("Custom Dialog")
                        .setMessage(R.string.message)
                        .setPositiveButtonText("OK")
                        .setNegativeButtonText("Cancel").show();
            }
        });
        findViewById(R.id.button2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CustomDialog.show(MainActivity.this);
            }
        });
    }

    private Context getContext() {
        return this;
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
