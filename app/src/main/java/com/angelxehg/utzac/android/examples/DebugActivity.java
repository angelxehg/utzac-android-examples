package com.angelxehg.utzac.android.examples;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.angelxehg.utzac.android.examples.android.app.R;

public class DebugActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_debug);
    }

    public void showToast(String message) {
        Toast.makeText(getApplicationContext(), message,Toast.LENGTH_SHORT).show();
    }

    public void LaunchStar(View view) {
        this.showToast("Star!");
    }

    public void LaunchCheck(View view) {
        this.showToast("Check!");
    }

    public void LaunchBar(View view) {
        this.showToast("Bar!");
    }
}
