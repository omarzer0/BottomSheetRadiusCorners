package com.azapps.modalbottomsheet;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements MyBottomSheetDialog.BottomSheetListener {

    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.show_clicked_bottom_text_view_text);
        Button openBottomSheet = findViewById(R.id.open_bottom_sheet_btn);
        openBottomSheet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MyBottomSheetDialog dialog = new MyBottomSheetDialog();
                dialog.show(getSupportFragmentManager(), "my bottom sheet");
            }
        });
    }

    @Override
    public void onBottomSheetClick(String text) {
        textView.setText(text);
    }
}