package id.sch.smktelkom_mlg.project.xirpl204132231.infomalang;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class BudayaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_budaya);

        findViewById(R.id.buttonback).setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                onBackPressed();
            }
        });
    }
}
