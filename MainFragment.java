package org.techtown.a2b_1116_2;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class MainFragment extends Fragment {

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        ViewGroup rootView = (ViewGroup)inflater.inflate(R.layout.fragment_main, container,false);
        Button btnMenu = rootView.findViewById(R.id.btnMenu);

        btnMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // 메인액티비티의 화면을 메뉴 프래그먼트로 전환하기
                MainActivity mainActivity = (MainActivity)getActivity();
                mainActivity.onFragmentChanged(0);
            }
        });

        return rootView;
        //return inflater.inflate(R.layout.fragment_main, container, false);
    }

}
