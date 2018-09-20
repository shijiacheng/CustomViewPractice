package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice8DrawArcView extends View {

    public Practice8DrawArcView(Context context) {
        super(context);
    }

    public Practice8DrawArcView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice8DrawArcView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        练习内容：使用 canvas.drawArc() 方法画弧形和扇形

        Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);
//        canvas.drawOval(200,100,600,300,paint);

        paint.setColor(Color.GREEN);
        canvas.drawArc(200,100,600,300,
                -110,100,true,paint);

        canvas.drawArc(200,100,600,300,
                20,140,false,paint);


        paint.setStyle(Paint.Style.STROKE);
        canvas.drawArc(200,100,600,300,
                180,60,false,paint);
    }
}
