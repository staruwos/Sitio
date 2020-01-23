package com.julio.sitio.ui.arvores;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.julio.sitio.R;

public class ArvoresFragment extends Fragment {
    private ArvoresViewModel arvoresViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        arvoresViewModel =
                ViewModelProviders.of(this).get(ArvoresViewModel.class);
        View root = inflater.inflate(R.layout.fragment_arvores, container, false);
        final TextView textView = root.findViewById(R.id.text_arvores);
        arvoresViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}
