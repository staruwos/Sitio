package com.julio.sitio.ui.abelhas;

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

public class AbelhasFragment extends Fragment {
    private AbelhasViewModel abelhasViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        abelhasViewModel =
                ViewModelProviders.of(this).get(AbelhasViewModel.class);
        View root = inflater.inflate(R.layout.fragment_abelhas, container, false);
        final TextView textView = root.findViewById(R.id.text_abelhas);
        abelhasViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}
