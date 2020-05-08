package com.example.bindingexample;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.bindingexample.databinding.FragmentDataBindingBinding;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.ObservableField;
import androidx.fragment.app.Fragment;

public class DataBindingFragment extends Fragment {

    FragmentDataBindingBinding binding;
    public ObservableField<String> observableField = new ObservableField<>();

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

}
