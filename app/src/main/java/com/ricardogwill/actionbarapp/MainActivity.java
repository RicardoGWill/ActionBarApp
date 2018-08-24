package com.ricardogwill.actionbarapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

// This App is based off the tutorials starting here: Part 1 - https://www.youtube.com/watch?v=j-3L3CgYXkU
// It allows me to create a custom ActionBar.
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        android.support.v7.widget.Toolbar appBar = findViewById(R.id.app_bar);
        setSupportActionBar(appBar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.custom_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.option1:
                Toast.makeText(this, "Option 1 chosen.", Toast.LENGTH_SHORT).show();
                break;
            case R.id.option2:
                Toast.makeText(this, "Option 2 chosen.", Toast.LENGTH_SHORT).show();
                break;
            case R.id.option3:
                Toast.makeText(this, "Option 3 chosen.", Toast.LENGTH_SHORT).show();
                break;
            default:
                Toast.makeText(this, "Unknown Error", Toast.LENGTH_SHORT).show();

        }
        return super.onOptionsItemSelected(item);
    }
}
