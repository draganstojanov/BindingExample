package com.example.bindingexample;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.bindingexample.databinding.FragmentViewBindingBinding;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class ViewBindingFragment extends Fragment {

    private FragmentViewBindingBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentViewBindingBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        User user = new User("Peter", "Jones", "Jonesville");

        binding.viewBindingFragmentVeryLongIndentificationFirstNameTv.setText(user.getFirstName());
        binding.viewBindingFragmentVeryLongIndentificationLastNameTv.setText(user.getLastName());
        binding.viewBindingFragmentVeryLongIndentificationCityTv.setText(user.getCity());

        binding.viewBindingFragmentVeryLongIndentificationBackBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((MainActivity) getActivity()).getSupportFragmentManager().popBackStack();
            }
        });
    }



    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}
