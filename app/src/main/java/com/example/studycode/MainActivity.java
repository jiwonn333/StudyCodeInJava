package com.example.studycode;

import static android.view.View.GONE;
import static android.view.View.VISIBLE;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.example.studycode.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private Button imperativeBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        User user = new User("jiwon", 20);
        binding.setUser(user);


        // User user1 = new User();

        // AAC DataBinding - 명령형 방식
        imperativeBtn = findViewById(R.id.imperative_btn);
        imperativeBtn.setOnClickListener(view -> {
            imperativeBtn.setText(user.getName());
        });

    }
}