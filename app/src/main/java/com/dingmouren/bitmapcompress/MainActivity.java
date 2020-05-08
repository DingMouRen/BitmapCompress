package com.dingmouren.bitmapcompress;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.dingmouren.bitmapcompress.base.BaseActivity;
import com.dingmouren.bitmapcompress.ui.Main1Activity;
import com.dingmouren.bitmapcompress.ui.Main2Activity;
import com.dingmouren.bitmapcompress.ui.Main3Activity;
import com.dingmouren.bitmapcompress.ui.Main4Activity;
import com.dingmouren.bitmapcompress.ui.Main5Activity;
import com.dingmouren.bitmapcompress.ui.Main6Activity;

public class MainActivity extends BaseActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.btn_1).setOnClickListener(this);
        findViewById(R.id.btn_2).setOnClickListener(this);
        findViewById(R.id.btn_3).setOnClickListener(this);
        findViewById(R.id.btn_4).setOnClickListener(this);
        findViewById(R.id.btn_5).setOnClickListener(this);
        findViewById(R.id.btn_6).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_1:
                startActivity(new Intent(this, Main1Activity.class));
                break;
            case R.id.btn_2:
                startActivity(new Intent(this, Main2Activity.class));

                break;
            case R.id.btn_3:
                startActivity(new Intent(this, Main3Activity.class));

                break;
            case R.id.btn_4:
                startActivity(new Intent(this, Main4Activity.class));

                break;
            case R.id.btn_5:
                startActivity(new Intent(this, Main5Activity.class));

                break;
            case R.id.btn_6:
                startActivity(new Intent(this, Main6Activity.class));

                break;
        }
    }
}
