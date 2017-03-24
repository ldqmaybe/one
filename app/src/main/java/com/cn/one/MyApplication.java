package com.cn.one;

import com.tencent.tinker.loader.app.TinkerApplication;
import com.tencent.tinker.loader.shareutil.ShareConstants;

/**
 * @author Admin
 * @time 2017/3/20 0020.14:32
 */
public class MyApplication extends TinkerApplication {
    public MyApplication() {
        super(ShareConstants.TINKER_ENABLE_ALL, "com.cn.one.MyApplicationLik","com.tencent.tinker.loader.TinkerLoader", false);
    }
}
