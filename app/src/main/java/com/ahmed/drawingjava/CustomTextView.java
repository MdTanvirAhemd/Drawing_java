package com.ahmed.drawingjava;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;

import com.google.android.material.appbar.AppBarLayout;

public class CustomTextView extends AppCompatTextView {
    private Paint paint;
    public CustomTextView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init();
    }
    public void init(){
        paint = new Paint(Paint.ANTI_ALIAS_FLAG);
        paint.setTextSize(125f);
        paint.setTextAlign(Paint.Align.CENTER);
        paint.setColor(Color.parseColor("blue"));

    }


    @Override
    protected void onDraw(Canvas canvas) {

        canvas.drawText("Hello World",  getMeasuredWidth()/2, getMeasuredHeight()/2, paint);
        canvas.save();
        super.onDraw(canvas);
    }
}

