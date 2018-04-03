package jiucaitong.jiucheng.app.myapplication;

import android.app.Activity;
import android.support.annotation.Nullable;
import android.widget.TextView;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;

import java.util.List;

/**
 * Created by Administrator on 2018/3/30.
 */

public class Recycler_AdapterBase extends BaseQuickAdapter<list_mode,BaseViewHolder> {
    private Activity activity;
    public Recycler_AdapterBase(Activity activity, @Nullable List<list_mode> data) {
        super(R.layout.list_animation, data);
    }

//    public Recycler_AdapterBase(@Nullable List<list_mode> data) {
//        super(data);
//    }
//
//
//    public Recycler_AdapterBase(int layoutResId) {
//        super(layoutResId);
//    }

    @Override
    protected void convert(BaseViewHolder helper, list_mode item) {
//        helper.setText(R.id.text1,"可爱小关");
        ((TextView)helper.getView(R.id.text1)).setText(helper.getAdapterPosition()+"");
////        helper.setText(R.id.text1,helper.getAdapterPosition());
//        switch (item.getTag()){
//            case 1:
//                helper.setTextColor(R.id.text1,activity.getResources().getColor(android.R.color.holo_red_dark));
////                helper.setGone(R.id.image1,false);
//                break;
//            case 2:
//                helper.setTextColor(R.id.text1,activity.getResources().getColor(android.R.color.primary_text_light_nodisable));//android.R.color.primary_text_light_nodisable
////                helper.setGone(R.id.image1,true);
//                break;

//        }
    }

}
