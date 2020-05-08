package com.dingmouren.bitmapcompress.base;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.dingmouren.bitmapcompress.R;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;

public abstract class BaseActivity extends AppCompatActivity {
    protected TextView mTv;
    protected ImageView mImg;
    protected StringBuilder mSb = new StringBuilder();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);
        mTv = findViewById(R.id.tv);
        mImg = findViewById(R.id.img);
    }

    public Map<String, String> loadImg(final ImageView imageView, int redId) {
        final Map<String, String> map = new HashMap<>();
        BitmapFactory.Options options = new BitmapFactory.Options();
        Bitmap bitmap = BitmapFactory.decodeResource(getResources(), redId, options);
        imageView.setImageBitmap(bitmap);
        map.put("bytecount", getDataSize(bitmap.getByteCount()) + "");
        map.put("allocationbytecount", getDataSize(bitmap.getAllocationByteCount()) + "");
        map.put("width", bitmap.getWidth() + "");
        map.put("height", bitmap.getHeight() + "");
        map.put("indensity", options.inDensity + "");
        map.put("intargetdensity", options.inTargetDensity + "");


        return map;
    }

    public String getDataSize(long size) {
        DecimalFormat formater = new DecimalFormat("####.00");
        if (size < 1024) {
            return size + "bytes";
        } else if (size < 1024 * 1024) {
            float kbsize = size / 1024f;
            return formater.format(kbsize) + "KB";
        } else if (size < 1024 * 1024 * 1024) {
            float mbsize = size / 1024f / 1024f;
            return formater.format(mbsize) + "MB";
        } else if (size < 1024 * 1024 * 1024 * 1024) {
            float gbsize = size / 1024f / 1024f / 1024f;
            return formater.format(gbsize) + "GB";
        } else {
            return "size: error";
        }
    }
}
