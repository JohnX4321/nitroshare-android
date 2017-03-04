package net.nitroshare.android;

import android.Manifest;
import android.os.Bundle;

import com.heinrichreimersoftware.materialintro.app.IntroActivity;
import com.heinrichreimersoftware.materialintro.slide.SimpleSlide;

/**
 * Display an interactive introduction to the application
 */
public class MainIntroActivity extends IntroActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setButtonBackFunction(BUTTON_BACK_FUNCTION_BACK);

        addSlide(new SimpleSlide.Builder()
                .title(R.string.activity_intro_intro_title)
                .description(R.string.activity_intro_intro_description)
                .image(R.drawable.ic_intro_transfer)
                .background(R.color.colorPrimary)
                .backgroundDark(R.color.colorPrimaryDark)
                .build());

        addSlide(new SimpleSlide.Builder()
                .title(R.string.activity_intro_perms_title)
                .description(R.string.activity_intro_perms_description)
                .image(R.drawable.ic_intro_lock)
                .background(R.color.colorPrimary)
                .backgroundDark(R.color.colorPrimaryDark)
                .permission(Manifest.permission.WRITE_EXTERNAL_STORAGE)
                .build());
    }
}