package com.ahai.demo.blurdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {
//    private ImageView imagev1;
//    private ImageView imagev2;

    private ImageView blurView;
    private View maskView;

    private String url = "http://cms-bucket.nosdn.127.net/f15c09f41d224b70847b25f202312ea520161203151029.jpg";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        imagev1 = (ImageView) findViewById(R.id.imagev1);
//        imagev2 = (ImageView) findViewById(R.id.imagev2);

        blurView = (ImageView) findViewById(R.id.blurView);
        maskView = findViewById(R.id.maskView);

//        url = "https://www.baidu.com/img/bd_logo1.png";

        url = "http://a.hiphotos.baidu.com/baike/crop%3D0%2C0%2C500%2C330%3Bc0%3Dbaike80%2C5%2C5%2C80%2C26" +
                "/sign=a124ea675a66d0166a56c468aa1bf837/78310a55b319ebc42fba1f338a26cffc1f17165d.jpg";

//        Glide.with(this).load("https://www.baidu.com/img/bd_logo1.png").asBitmap()
//                .transform(new FastBlur(this, 3))//控制模糊的程度
//                .into(imagev1);

        Glide.with(this).load(url).asBitmap()
                .transform(new FastBlur(this, 6))//控制模糊的程度
                .into(blurView);

//        Glide.with(this).load("https://www.baidu.com/img/bd_logo1.png").asBitmap()
//                .into(imagev2);
    }
}

