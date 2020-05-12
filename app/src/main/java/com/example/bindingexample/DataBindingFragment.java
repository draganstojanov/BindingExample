package com.example.bindingexample;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.ObservableField;
import androidx.databinding.ObservableInt;
import androidx.fragment.app.Fragment;

import com.example.bindingexample.databinding.FragmentDataBindingBinding;

public class DataBindingFragment extends Fragment {

    FragmentDataBindingBinding binding;
    public ObservableField<String> observableField = new ObservableField<>();

    public ObservableInt observableInt = new ObservableInt();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentDataBindingBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        User user = new User("John", "Peters", "Peterburg");
        binding.setUser(user);
        binding.setFragment(this);
    }

    public void onButtonClicked() {
        ((MainActivity) getActivity()).getSupportFragmentManager().popBackStack();
    }

    public void onEditTextShowClicked() {
        binding.showTextTv.setText(observableField.get());
    }


    CountDownTimer cdt = new CountDownTimer(10000, 1000) {
        @Override
        public void onTick(long millisUntilFinished) {
            observableInt.set((int) millisUntilFinished / 1000); {
            }
        }

        @Override
        public void onFinish() {

        }
    }.start();

}
