package com.tech.titens;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;
import com.tech.titens.databinding.MainBinding;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {
	private Timer _timer = new Timer();
	private MainBinding mainBinding;
	private TimerTask t;
	private Intent intent = new Intent();
	
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		mainBinding = MainBinding.inflate(getLayoutInflater());
		View view = mainBinding.getRoot();
		initializeLogic();
	}

	private void initializeLogic() {
		try {
			t = new TimerTask() {
				@Override
				public void run() {
					runOnUiThread(() -> {
						if (!(FirebaseAuth.getInstance().getCurrentUser() != null)) {
							intent.setClass(getApplicationContext(), HomeActivity.class);

						} else {
							intent.setClass(getApplicationContext(), LoginPageActivity.class);
						}
						startActivity(intent);
						finish();
					});
				}
			};
			_timer.schedule(t, (int) (2000));
		}catch (Exception e){

		}
	}
}
