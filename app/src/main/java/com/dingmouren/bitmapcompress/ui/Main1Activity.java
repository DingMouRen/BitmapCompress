package com.dingmouren.bitmapcompress.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.TextView;

import com.dingmouren.bitmapcompress.R;
import com.dingmouren.bitmapcompress.base.BaseActivity;

import java.util.Map;

public class Main1Activity extends BaseActivity {



    @Override
    protected void onResume() {
        super.onResume();

        Map<String,String> mapDraw = loadImg(mImg,R.drawable.img1);
        Map<String,String> mapDrawXh = loadImg(mImg,R.drawable.img2);
        Map<String,String> mapDrawXxh = loadImg(mImg,R.drawable.img3);
        Map<String,String> mapDrawXxxh = loadImg(mImg,R.drawable.img4);

        mSb.append("drawable:\n")
                .append("内存大小:"+mapDraw.get("bytecount")+"\n")
                .append("屏幕密度:"+mapDraw.get("indensity")+"\n")
                .append("图片宽："+mapDraw.get("width")+"\n")
                .append("图片高："+mapDraw.get("height")+"\n\n\n")
        ;

        mSb.append("drawable-xhdpi:\n")
                .append("内存大小:"+mapDrawXh.get("bytecount")+"\n")
                .append("屏幕密度:"+mapDrawXh.get("indensity")+"\n")
                .append("图片宽："+mapDrawXh.get("width")+"\n")
                .append("图片高："+mapDrawXh.get("height")+"\n\n\n")
        ;

        mSb.append("drawable-xxhdpi:\n")
                .append("内存大小:"+mapDrawXxh.get("bytecount")+"\n")
                .append("屏幕密度:"+mapDrawXxh.get("indensity")+"\n")
                .append("图片宽："+mapDrawXxh.get("width")+"\n")
                .append("图片高："+mapDrawXxh.get("height")+"\n\n\n")
        ;

        mSb.append("drawable-xxxhdpi:\n")
                .append("内存大小:"+mapDrawXxxh.get("bytecount")+"\n")
                .append("屏幕密度:"+mapDrawXxxh.get("indensity")+"\n")
                .append("图片宽："+mapDrawXxxh.get("width")+"\n")
                .append("图片高："+mapDrawXxxh.get("height")+"\n\n\n")
        ;

        mTv.setText(mSb.toString());
    }
}
