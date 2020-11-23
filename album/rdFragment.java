package org.techtown.a2b_2017201062;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.provider.MediaStore;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.RadioGroup;


public class rdFragment extends Fragment {
    ImageSelectionCallback callback;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

        if(context instanceof ImageSelectionCallback){
            callback = (ImageSelectionCallback) context;
        }
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        ViewGroup rootView = (ViewGroup)inflater.inflate(R.layout.fragment_rd, container, false);


        RadioButton arrRbt[] = new RadioButton[8];
        int rbtId[] = {R.id.rdButton1, R.id.rdButton2, R.id.rdButton3, R.id.rdButton4,
                       R.id.rdButton5, R.id.rdButton6, R.id.rdButton7, R.id.rdButton8};

        for(int i=0; i<arrRbt.length; i++){
            arrRbt[i] = rootView.findViewById(rbtId[i]);
        }

        for(int i=0; i<arrRbt.length; i++) {
            final int index = i;
            arrRbt[i].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    callback.onImageSelected(index);
                }
            });
        }

        return rootView;
    }
}
