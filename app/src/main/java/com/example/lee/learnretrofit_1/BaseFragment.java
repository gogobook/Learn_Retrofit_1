package com.example.lee.learnretrofit_1;

import android.app.AlertDialog;
import android.app.Fragment;

import butterknife.OnClick;
import rx.Subscription;

/**
 * Created by lee on 2016/10/19.
 */

public abstract class BaseFragment extends Fragment {
    protected Subscription subscription;

    @OnClick(R.id.tipBt)
    void tip() {
        new AlertDialog.Builder(getActivity())
                .setTitle(getTitleRes())
                .setView(getActivity().getLayoutInflater().inflate(getDialogRes(), null))
                .show();

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unsubscribe();
    }

    protected void unsubscribe(){
        if (subscription != null && !subscription.isUnsubscribed()) {
            subscription.unsubscribe();
        }
    }
    protected abstract int getDialogRes();

    protected abstract int getTitleRes();
}
