package com.example.myapplication.repository;

public final class RepositoryProvider {
    private static IRepository repository;
    private static RepositoryProvider mInstance;

    public static RepositoryProvider getInstance() {
        if (mInstance == null) {
            synchronized (RepositoryProvider.class) {
                if (mInstance == null) {
                    mInstance = new RepositoryProvider();
                }
            }
        }
        return mInstance;
    }

    private RepositoryProvider() {
        repository = new RepositoryImpl();
    }

    public IRepository getRepository() {
        return repository;
    }
}
