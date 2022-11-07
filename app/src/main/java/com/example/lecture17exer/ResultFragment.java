package com.example.lecture17exer;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.lecture17exer.databinding.FragmentGameBinding;
import com.example.lecture17exer.databinding.FragmentResultBinding;

public class ResultFragment extends Fragment {
    private FragmentResultBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = FragmentResultBinding.inflate(inflater, container, false);
        View view = binding.getRoot();

        TextView textView = binding.resultFragment;


        String message = ResultFragmentArgs.fromBundle(requireArguments()).getMessage();
        String messageNew = new StringBuffer(message).toString();

        textView.setText("Congratulations you won");

        return view;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}