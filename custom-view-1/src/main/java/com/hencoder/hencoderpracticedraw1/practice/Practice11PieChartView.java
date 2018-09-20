package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice11PieChartView extends View {

    public Practice11PieChartView(Context context) {
        super(context);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画饼图
        Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);

        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(Color.WHITE);
        paint.setTextSize(18);
        Path path = new Path();

        path.moveTo(90,40);
        path.lineTo(190,40);
        path.lineTo(210,80);

        paint.setTextAlign(Paint.Align.RIGHT);
        canvas.drawText("Lollipop",80,40,paint);


        path.moveTo(90,420);
        path.lineTo(160,420);
        path.lineTo(200,360);

        canvas.drawText("KitKat",80,420,paint);


        //中心310，260 半径200

        path.moveTo(590,150);
        path.lineTo(510,150);
        path.lineTo(490,170);

        paint.setTextAlign(Paint.Align.LEFT);
        canvas.drawText("Marshmallow",600,150,paint);


        path.moveTo(590,250);
        path.lineTo(510,250);

        canvas.drawText("Froyo",600,250,paint);

        path.moveTo(590,290);
        path.lineTo(550,290);
        path.lineTo(490,270);

        canvas.drawText("Gingerbread",600,290,paint);

        path.moveTo(590,340);
        path.lineTo(570,340);
        path.lineTo(470,300);

        canvas.drawText("ICS",600,340,paint);


        path.moveTo(590,400);
        path.lineTo(520,400);
        path.lineTo(400,300);

        canvas.drawText("Jelly Bean",600,400,paint);

        canvas.drawPath(path,paint);


        paint.setStyle(Paint.Style.FILL);

        paint.setColor(Color.RED);
        canvas.drawArc(100,40,500,440,
                180,120,true,paint);

        paint.setColor(Color.YELLOW);
        canvas.drawArc(110,60,510,460,
                -60,55,true,paint);

        paint.setColor(Color.LTGRAY);
        canvas.drawArc(110,60,510,460,
                -5,5,true,paint);

        paint.setColor(Color.MAGENTA);
        canvas.drawArc(110,60,510,460,
                0,10,true,paint);

        paint.setColor(Color.GRAY);
        canvas.drawArc(110,60,510,460,
                10,10,true,paint);

        paint.setColor(Color.GREEN);
        canvas.drawArc(110,60,510,460,
                20,60,true,paint);

        paint.setColor(Color.BLUE);
        canvas.drawArc(110,60,510,460,
                80,100,true,paint);
    }
}
