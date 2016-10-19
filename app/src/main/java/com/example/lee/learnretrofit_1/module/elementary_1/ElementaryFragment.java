package com.example.lee.learnretrofit_1.module.elementary_1;

import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.RecyclerView;

import com.example.lee.learnretrofit_1.BaseFragment;
import com.example.lee.learnretrofit_1.R;

import butterknife.Bind;

/**
 * Created by lee on 2016/10/19.
 */

public class ElementaryFragment extends BaseFragment {
    @Bind(R.id.swipeRefreshLayout)
    SwipeRefreshLayout swipeRefreshLayout;

    @Bind(R.id.gridRv)
    RecyclerView gridRv;
}
