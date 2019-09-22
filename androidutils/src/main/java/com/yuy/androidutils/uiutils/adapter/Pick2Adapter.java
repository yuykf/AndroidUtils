package com.yuy.androidutils.uiutils.adapter;

import androidx.annotation.Nullable;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.yuy.androidutils.R;
import com.yuy.androidutils.uiutils.entity.PickEntity;

import java.util.List;

/**
 * Author: yuyang
 * Date:2019/9/21 15:42
 * Description:
 * Version:
 */
public class Pick2Adapter extends BaseQuickAdapter<PickEntity.RestbodyBean.Higher2LevelBean, BaseViewHolder> {

    public Pick2Adapter(@Nullable List data) {
        super(R.layout.item_pick, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, PickEntity.RestbodyBean.Higher2LevelBean data) {
        //将每一个需要赋值的id和对应的数据绑定
        helper.setText(R.id.cb_item_pick, data.getName());
        if(data.isChecked()){
            helper.setChecked(R.id.cb_item_pick,true);
        }else {
            helper.setChecked(R.id.cb_item_pick,false);
        }

        //设置title的点击监听
        helper.addOnClickListener(R.id.cb_item_pick);
    }
}
