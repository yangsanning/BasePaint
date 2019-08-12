package ysn.com.paint.base;

import android.graphics.Canvas;
import android.graphics.Paint;

/**
 * @Author yangsanning
 * @ClassName BasePaint
 * @Description 涂鸦画笔基类
 * @Date 2019/8/10
 * @History 2019/8/10 author: description:
 */
public abstract class BasePaint {

    protected int paintColor;
    protected float startX;
    protected float startY;
    protected float stopX;
    protected float stopY;
    protected int strokeWidth;

    protected Paint paint = new Paint();

    protected BasePaint(float x, float y, int strokeWidth, int paintColor) {
        this.startX = x;
        this.startY = y;
        this.stopX = x;
        this.stopY = y;
        this.strokeWidth = strokeWidth;
        this.paintColor = paintColor;
    }

    public abstract void onDraw(Canvas canvas);

    public abstract void onMove(float moveX, float moveY);
}
