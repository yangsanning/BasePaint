package ysn.com.paint;

import android.graphics.Canvas;
import android.graphics.Paint;

import ysn.com.paint.base.BasePaint;

/**
 * @Author yangsanning
 * @ClassName LinePaint
 * @Description 直线画笔
 * @Date 2019/8/10
 * @History 2019/8/10 author: description:
 */
public class LinePaint extends BasePaint {

    public LinePaint(float x, float y, int strokeWidth, int paintColor) {
        super(x, y, strokeWidth, paintColor);
    }

    @Override
    public void onDraw(Canvas canvas) {
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(paintColor);
        paint.setStrokeWidth(strokeWidth);
        canvas.drawLine(startX, startY, stopX, stopY, paint);
    }

    @Override
    public void onMove(float moveX, float moveY) {
        this.stopX = moveX;
        this.stopY = moveY;
    }
}