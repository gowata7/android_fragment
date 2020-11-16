package org.techtown.a2b_1116_2;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class MenuFragment extends Fragment {

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        ViewGroup rootView = (ViewGroup)inflater.inflate(R.layout.fragment_menu, container, false);
        Button btnMain = rootView.findViewById(R.id.btnMain);

        btnMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // 메인액티비티의 화면을 메뉴프레그먼트로 전환하기
                MainActivity mainActivity = (MainActivity)getActivity();
                mainActivity.onFragmentChanged(1);
            }
        });

        return rootView;
    }



}

