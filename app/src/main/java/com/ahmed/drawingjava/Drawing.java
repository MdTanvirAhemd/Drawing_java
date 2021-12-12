package com.ahmed.drawingjava;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;

public class Drawing extends View {
    private Paint brush;
    public Drawing(Context context) {
        super(context);
        init();
    }

//    public Drawing(Context context, @Nullable AttributeSet attrs) {
//        super(context, attrs);
//    }
//
//    public Drawing(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
//        super(context, attrs, defStyleAttr);
//    }
//
//    public Drawing(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
//        super(context, attrs, defStyleAttr, defStyleRes);
//    }
    public void init() {
        brush = new Paint(Paint.ANTI_ALIAS_FLAG);
        brush.setColor(Color.parseColor("green"));
    }

    @Override
    protected void onDraw(Canvas canvas) {
        canvas.drawCircle(getMeasuredWidth()/2,getMeasuredHeight()/2,24f,brush);

        canvas.save();
        super.onDraw(canvas);
    }
}
