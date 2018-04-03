package jiucaitong.jiucheng.app.myapplication;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by Administrator on 2018/3/29.
 */

public class Itemanim_Imagview extends ImageView {
    private Animation animation;
    private Timer timer;
    private TimerTask timerTask;
    private Handler handler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            switch (msg.what) {
                case 0x11:
                    startAnimation(animation);
                    break;
            }
        }
    };

    public Itemanim_Imagview(Context context) {
        super(context);
    }

    public Itemanim_Imagview(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        anim_init();
    }

    private void anim_init() {
        animation = AnimationUtils.loadAnimation(getContext(), R.anim.item_anim);
        timer = new Timer();
        timerTask = new TimerTask() {
            @Override
            public void run() {
                handler.sendEmptyMessage(0x11);
            }
        };
        startAnimation(animation);
        timer.schedule(timerTask,2000,2000);
    }

    public Itemanim_Imagview(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

}
