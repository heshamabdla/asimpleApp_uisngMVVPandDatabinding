package com.example.mvvp.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.mvvp.R;
import com.example.mvvp.databinding.ActivityMvvpUsingBindingBinding;

import java.lang.reflect.Modifier;

public class MVVP_Using_Binding extends AppCompatActivity {

    ActivityMvvpUsingBindingBinding binding;
    MovieViewModel movieViewModel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        binding= DataBindingUtil.setContentView(this,R.layout.activity_mvvp_using_binding);
        movieViewModel= new ViewModelProvider(this).get(MovieViewModel.class);
        binding.setViewModel(movieViewModel);
        binding.setLifecycleOwner(this);


    /* movieViewModel.mutableLiveData.observe(this, new Observer<String>() {
        @Override
        public void onChanged(String s) {
            binding.textViewBinding.setText(s);
        }
    });


     */

        /*
       binding.btnBinding.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                movieViewModel.getMovieName();
            }
        });
*/
    }
}