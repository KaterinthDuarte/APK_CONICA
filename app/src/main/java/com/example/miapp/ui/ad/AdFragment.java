package com.example.miapp.ui.Ad;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.miapp.databinding.FragmentAdBinding;
import com.example.miapp.ui.Ad.AdViewModel;

public class AdFragment extends Fragment {

    private FragmentAdBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        AdViewModel AdViewModel =
                new ViewModelProvider(this).get(AdViewModel.class);

        binding = FragmentAdBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textAd;
        AdViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}