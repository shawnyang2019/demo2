package com.fiberhome.demo;

/**
 * @author vv
 * @since 2019/2/13
 */
public abstract class Animal {

    private boolean gender;

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    protected abstract String skin();

    public void testOverride(){
        System.out.println("animal");
    }
}
