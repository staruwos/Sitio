package com.julio.sitio.ui.ferramentas;

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

public class FerramentasFragment extends Fragment {
    private FerramentasViewModel ferramentasViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        ferramentasViewModel =
                ViewModelProviders.of(this).get(FerramentasViewModel.class);
        View root = inflater.inflate(R.layout.fragment_ferramentas, container, false);
        final TextView textView = root.findViewById(R.id.text_ferramentas);
        ferramentasViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}
