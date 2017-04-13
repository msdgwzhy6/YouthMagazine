package com.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.adapter.MomentListAdapter;
import com.base.BaseFragment;
import com.githang.navigatordemo.R;

/**
 * Created by liudong on 17/4/12.
 */

public class MomentFragment extends BaseFragment {
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.main_fragment_moment, container, false);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.rv_main_talk);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(new MomentListAdapter(getContext()));
        recyclerView.addItemDecoration(new DividerItemDecoration(getContext(),1));
        return view;
    }

}