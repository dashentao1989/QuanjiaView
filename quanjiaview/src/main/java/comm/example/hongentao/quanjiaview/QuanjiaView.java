package comm.example.hongentao.quanjiaview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * Created by hongentao on 16/4/18.
 */
public class QuanjiaView extends TextView {
    private Paint mPaint;

    public QuanjiaView(Context context) {
        super(context);
    }

    public QuanjiaView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public QuanjiaView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public void init() {
        mPaint = new Paint();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        mPaint.setAlpha(1);
        mPaint.setAntiAlias(false);
        mPaint.setColor(Color.BLUE);
    }
}
