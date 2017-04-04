package com.aisw.app.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTabHost;
import android.support.v4.widget.SwipeRefreshLayout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TabHost;

import com.aisw.app.R;
import com.aisw.app.utils.AshTable;
import com.aisw.app.utils.CustomListViewAdapter;

import java.util.ArrayList;

public class BaseHomeFragment extends Fragment {



    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate( R.layout.base_home_fragment, container, false );

        final FragmentTabHost host = ( FragmentTabHost ) view.findViewById( R.id.tabHost );
        host.setup(getActivity(), getChildFragmentManager(), android.R.id.tabcontent);

        host.addTab( host.newTabSpec( "tab1" ).setIndicator( "Home" ), HomeFragment.class, null );
        host.addTab( host.newTabSpec( "tab2" ).setIndicator( "Search" ), SearchFragment.class, null );


        return view;

    }

}



