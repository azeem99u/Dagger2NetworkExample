package com.example.diexample.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.diexample.R;
import com.example.diexample.basic.Constants;
import com.example.diexample.basic.MainViewModel;
import com.example.diexample.di.DaggerMainViewModelInjector;
import com.example.diexample.di.RealConnectionModule;

import javax.inject.Named;


public class MainActivity extends AppCompatActivity {

   /* @Inject
    MainViewModel mainViewModel;*/


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MainViewModel mainViewModel = DaggerMainViewModelInjector.builder()
                .setEndPoint(Constants.PROD_ENDPOINT)
                .setUsername("admin")
                .setPassword("admin1234")
                .build()
                .getMainViewModel();

        //DaggerMainViewModelInjector.create().injectFields(this);

        TextView textView = findViewById(R.id.textView);
        textView.setText(mainViewModel.fetchData());
    }
}