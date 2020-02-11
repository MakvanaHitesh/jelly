package com.example.jelly;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatEditText;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;

import com.yalantis.jellytoolbar.listener.JellyListener;
import com.yalantis.jellytoolbar.widget.JellyToolbar;

public class MainActivity extends AppCompatActivity {
    private JellyToolbar toolbar;
    private AppCompatEditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar = (JellyToolbar) findViewById(R.id.toolbar);
        toolbar.setJellyListener(jellyListener);
        getSupportActionBar().hide();


    }


    private JellyListener jellyListener = new JellyListener() {
        @Override
        public void onCancelIconClicked() {
                toolbar.collapse();
        }
    };
}
