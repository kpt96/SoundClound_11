package com.framgia.soundcloud.screen.mymusic;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.framgia.soundcloud.R;

public class MyMusicFragment extends Fragment {

    public static Fragment newInstance(){
        MyMusicFragment myMusicFragment = new MyMusicFragment();
        return myMusicFragment;
    }
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_my_music, container, false);
        return view;
    }
}
