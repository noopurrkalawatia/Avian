package com.example.noopurrkalawatia.avian;

import android.view.View;

public class MainActivityPresenter {
    private User user;
    private View view;

    public MainActivityPresenter(View view)
    {
        this.user = new User();
        this.view = view;
    }

    public void updateSpeed(int speed)
    {
        user.setUpdatedSpeed(speed);
        view.updateSpeed(speed);
    }

    public void updateStringAlert(String message)
    {
        user.setAlertMessage(message);
        view.updateAlertMessage(message);
    }

    public interface View
    {
        void updateSpeed(int speed);
        void updateAlertMessage(String message);
    }
}
