package com.example.myapplication.viewmodel;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

import com.example.myapplication.repository.IRepository;

public class GistViewModelFactory implements ViewModelProvider.Factory {
    private IRepository repository;
    public GistViewModelFactory(IRepository repository) {
        this.repository = repository;
    }

    @Override
    public <T extends ViewModel> T create(Class<T> modelClass) {
        if (modelClass.isAssignableFrom(GistsListFragmentViewModel.class)) {
            return (T) new GistsListFragmentViewModel(repository);
        } else if (modelClass.isAssignableFrom(GistDetailFragmentViewModel.class)) {
            return (T) new GistDetailFragmentViewModel(repository);
        }
        return null;

    }
}
