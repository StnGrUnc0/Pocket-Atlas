package com.example.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton;

public class NavActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nav);

        ImageButton btnCredits = (ImageButton) findViewById(R.id.Credits);
        btnCredits.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                showDialog(NavActivity.this);
            }

            public void showDialog(Activity activity){

                final Dialog dialog = new Dialog(activity, android.R.style.Theme_Translucent_NoTitleBar_Fullscreen);
                dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
                dialog.getWindow().addFlags(WindowManager.LayoutParams.FLAG_DIM_BEHIND);
                dialog.getWindow().setDimAmount(0.3f);
                dialog.setCancelable(true);
                dialog.setContentView(R.layout.dialog_credits);
                dialog.show();

                Button closeButton = (Button) dialog.findViewById(R.id.btnClose);
                closeButton.setOnClickListener(new View.OnClickListener()
                {
                    @Override
                    public void onClick(View v)
                    {
                        dialog.dismiss();
                    }
                });
            }
        });

        //Развернуть окно на весь эран - НАЧАЛО
        Window w = getWindow();
        w.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        //Развернуть окно на весь эран - КОНЕЦ


        //кнопка перехода на Constellation - НАЧАЛО
        ImageButton Constellations = (ImageButton)findViewById(R.id.Constellations);
        Constellations.setOnClickListener(v -> {
            Intent intent = new Intent(NavActivity.this, ConstellationActivity.class);
            startActivity(intent);finish();
        });
        //кнопка перехода на Constellation - КОНЕЦ

        //кнопка перехода на Activity2 - НАЧАЛО
        //ImageButton buttonAct2 = (ImageButton)findViewById(R.id.buttonAct2);
        //buttonAct2.setOnClickListener(v -> {
            //Intent intent = new Intent(NavActivity.this, Activity2.class);
            //startActivity(intent);finish();
        //});
        //кнопка перехода на Activity3 - КОНЕЦ

        //кнопка перехода на Activity3 - НАЧАЛО
        //ImageButton buttonAct3 = (ImageButton)findViewById(R.id.buttonAct3);
        //buttonAct3.setOnClickListener(v -> {
            //Intent intent = new Intent(NavActivity.this, Activity3.class);
            //startActivity(intent);finish();
        //});
        //кнопка перехода на Activity3 - КОНЕЦ

    }

    //системная кнопка 'Назад' - НАЧАЛО
    @Override
    public void onBackPressed() {
        Intent intent = new Intent(NavActivity.this, MainActivity.class);
        startActivity(intent);
        finish();
    }//системная кнопка 'Назад' - КОНЕЦ
}