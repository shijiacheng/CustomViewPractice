package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice10HistogramView extends View {

    public Practice10HistogramView(Context context) {
        super(context);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画直方图

        Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);

        Path path = new Path();
        path.moveTo(60,50);
        path.lineTo(60,400);
        path.lineTo(650,400);

        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(Color.WHITE);
        canvas.drawPath(path,paint);

        paint.setTextSize(18);
        paint.setTextAlign(Paint.Align.CENTER);

        canvas.drawText("Froyo",100,420,paint);
        canvas.drawText("GB",180,420,paint);
        canvas.drawText("ICS",260,420,paint);
        canvas.drawText("JB",340,420,paint);
        canvas.drawText("KitKal",420,420,paint);
        canvas.drawText("L",500,420,paint);
        canvas.drawText("M",580,420,paint);

        paint.setStyle(Paint.Style.FILL);
        paint.setColor(Color.GREEN);

        canvas.drawRect(150,390,210,400,paint);
        canvas.drawRect(230,380,290,400,paint);
        canvas.drawRect(310,240,370,400,paint);
        canvas.drawRect(390,150,450,400,paint);
        canvas.drawRect(470,100,530,400,paint);
        canvas.drawRect(550,230,610,400,paint);
    }
}
