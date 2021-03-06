package kale.ui.block;

import android.util.Log;
import android.view.View;
import android.widget.TextView;

import kale.ui.R;
import kale.ui.uiblock.UiBlock;

/**
 * @author Jack Tony
 * @date 2015/11/21
 */
public class DemoVpUiBlock extends UiBlock {

    private static final String TAG = "DemoVpUiBlock";
    
    @Override
    protected int getLayoutResId() {
        return R.layout.demo_vp_uiblock;
    }

    @Override
    public void bindViews(View rootView) {
    }

    @Override
    public void setViews() {
        ((TextView) getView(R.id.header_tv)).setTextSize(30);
    }

    @Override
    public void handleData(Object model, int position) {
        Log.d(TAG, "handleData: pos = " + position);
        ((TextView) getView(R.id.header_tv)).setText((CharSequence) model);
    }

    @Override
    public void onVisibleToUser(boolean isVisible) {
        super.onVisibleToUser(isVisible);
        // 被用户可见时的回调
    }
}
