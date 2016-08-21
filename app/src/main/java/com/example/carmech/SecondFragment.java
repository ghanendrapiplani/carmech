package com.example.carmech;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;


public class SecondFragment extends Fragment {
    // Store instance variables
    private String title,imgName;
    private int page;

    // newInstance constructor for creating fragment with arguments
    public static SecondFragment newInstance(int page, String title, String imgName) {
        SecondFragment fragmentFirst = new SecondFragment();
        Bundle args = new Bundle();
        args.putInt("someInt", page);
        args.putString("someTitle", title);
        args.putString("someImg",imgName);
        fragmentFirst.setArguments(args);
        return fragmentFirst;
    }

    // Store instance variables based on arguments passed
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        page = getArguments().getInt("someInt", 0);
        title = getArguments().getString("someTitle");
        imgName=getArguments().getString("someImg");
    }

    // Inflate the view for the fragment based on layout XML
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.first_fragment, container, false);
        TextView tvLabel = (TextView) view.findViewById(R.id.tvLabel);
        ImageView imgV = (ImageView) view.findViewById(R.id.imgfrag1);
        tvLabel.setText(title);
        int resourceImage = getContext().getResources().getIdentifier(imgName, "drawable", getContext().getPackageName());
        String imgUri="R.drawable."+imgName;
        Glide.with(getContext()).load(resourceImage).into(imgV);
        return view;
    }
}