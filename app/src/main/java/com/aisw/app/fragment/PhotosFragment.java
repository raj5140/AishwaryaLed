package com.aisw.app.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.aisw.app.R;
import com.aisw.app.utils.ImageLoader;

/**
 * Created by varun on 2/10/2017.
 */
public class PhotosFragment extends Fragment{

    int loader = R.drawable.ic_launcher;
    String image_url = "http://aishwaryaled.com/wp-content/themes/events/img/icons/touch.png";


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_availablity,
                container, false);
        ImageView iView = (ImageView)view.findViewById(R.id.image);
        ImageLoader imgLoader = new ImageLoader(view.getContext());
        imgLoader.DisplayImage(image_url, loader, iView);
        return view;
    }
}
