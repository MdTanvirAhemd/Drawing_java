package com.ahmed.drawingjava;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;

public class Drawing extends View {
    private Paint brush;

    private Bitmap bitmap;

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
        bitmap = BitmapFactory.decodeResource(getResources(),R.drawable.tanvir);
        brush = new Paint(Paint.ANTI_ALIAS_FLAG);
        brush.setColor(Color.parseColor("green"));
    }

    @Override
    protected void onDraw(Canvas canvas) {
        canvas.drawBitmap(bitmap, (getMeasuredWidth()/2)-(bitmap.getWidth()/2)  , (getMeasuredHeight()/2)-(bitmap.getHeight() / 2), null);

        // canvas.drawCircle(getMeasuredWidth()/2,getMeasuredHeight()/2,24f,brush);

        canvas.save();
        super.onDraw(canvas);
    }
}
