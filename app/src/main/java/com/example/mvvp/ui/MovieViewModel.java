package com.example.mvvp.ui;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.mvvp.pojo.Movies;

public class MovieViewModel extends ViewModel {

    LiveData<String> liveData;//هنا مش ممكن تعمل set بشكل يدوي
  public   MutableLiveData<String> mutableLiveData =new MutableLiveData<>();//هنا ممكن تعمل set بشكل يدوي

    private Movies getMovieNameFromDataBase(){
        return new Movies("The end ",1);
    }

    public void getMovieName(){
        String s=getMovieNameFromDataBase().getName();
        mutableLiveData.setValue(s);
    }
}
