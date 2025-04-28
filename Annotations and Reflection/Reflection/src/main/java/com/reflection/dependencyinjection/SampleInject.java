package com.reflection.dependencyinjection;

public class SampleInject {
    @Inject
    private CustomDependency dependency;

    public void getAPIDep(){
        System.out.println(dependency.API_KEY);
    }

    public static void main(String[] args) {
        SampleInject sampleInject = DIContainer.createInstanceDI(SampleInject.class);
        sampleInject.getAPIDep();
    }
}