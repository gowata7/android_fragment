package org.techtown.a2b_2017201062;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements ImageSelectionCallback {
    rdFragment rdFragment;
    viewerFragment viewerFragment;

    int[] images = {R.drawable.vfood01, R.drawable.vfood02, R.drawable.vfood03, R.drawable.vfood04,
                    R.drawable.vfood05, R.drawable.vfood06, R.drawable.vfood07, R.drawable.vfood08};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("베트남 음식 Top8");

        // FragmentManager를 통해 Fragment를 가져오자
        FragmentManager manager = getSupportFragmentManager();
        rdFragment = (rdFragment)manager.findFragmentById(R.id.rdFragment);
        viewerFragment = (viewerFragment)manager.findFragmentById(R.id.viewerFragment);

    }

    public void onImageSelected(int position){
        viewerFragment.setImage(images[position]);
    }
}
