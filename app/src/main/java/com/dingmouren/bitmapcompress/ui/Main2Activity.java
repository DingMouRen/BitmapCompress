package com.dingmouren.bitmapcompress.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.os.Bundle;

import com.dingmouren.bitmapcompress.R;
import com.dingmouren.bitmapcompress.base.BaseActivity;
import com.dingmouren.bitmapcompress.utils.ImgUtil;

import java.util.Map;

public class Main2Activity extends BaseActivity {

    @Override
    protected void onResume() {
        super.onResume();
        Map<String,String> mapDraw = loadImg(mImg,R.drawable.img1);

        mSb.append("drawable:\n")
                .append("内存大小:"+mapDraw.get("bytecount")+"\n")
                .append("屏幕密度:"+mapDraw.get("indensity")+"\n")
                .append("图片宽："+mapDraw.get("width")+"\n")
                .append("图片高："+mapDraw.get("height")+"\n\n\n")
        ;

        Bitmap bitmap = ImgUtil.compressQuality(this,R.drawable.img1,5);
        mImg.setImageBitmap(bitmap);

        mSb.append("压缩后:\n"+"内存大小:"+getDataSize(bitmap.getByteCount())+"\n图片宽:"+bitmap.getWidth()+"\n"+"图片高:"+bitmap.getHeight());

        mTv.setText(mSb.toString());
    }
}
