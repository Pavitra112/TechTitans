package com.tech.titens;

import android.animation.*;
import android.app.*;
import android.content.*;
import android.content.Intent;
import android.content.res.*;
import android.graphics.*;
import android.graphics.drawable.*;
import android.media.*;
import android.net.*;
import android.net.Uri;
import android.os.*;
import android.text.*;
import android.text.style.*;
import android.util.*;
import android.view.*;
import android.view.View;
import android.view.View.*;
import android.view.animation.*;
import android.webkit.*;
import android.widget.*;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.*;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.button.*;
import com.google.android.material.textfield.*;
import com.google.firebase.FirebaseApp;
import java.io.*;
import java.text.*;
import java.util.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.*;
import org.json.*;

public class FilteroptionActivity extends AppCompatActivity {
	
	private Toolbar _toolbar;
	private AppBarLayout _app_bar;
	private CoordinatorLayout _coordinator;
	private HashMap<String, Object> mapp = new HashMap<>();
	private String min = "";
	private String max = "";
	
	private ArrayList<HashMap<String, Object>> map = new ArrayList<>();
	
	private ScrollView vscroll1;
	private LinearLayout linear1;
	private LinearLayout linear4;
	private LinearLayout linear5;
	private LinearLayout linear7;
	private LinearLayout linear9;
	private LinearLayout linear11;
	private LinearLayout linear13;
	private LinearLayout linear15;
	private LinearLayout linear17;
	private LinearLayout linear19;
	private MaterialButton materialbutton1;
	private TextView textview2;
	private LinearLayout linear2;
	private TextInputLayout textinputlayout3;
	private TextView textview3;
	private TextInputLayout ageMax;
	private EditText age_min;
	private EditText edittext4;
	private TextView textview4;
	private LinearLayout linear6;
	private TextInputLayout textinputlayout5;
	private TextView textview5;
	private TextInputLayout textinputlayout6;
	private EditText cp_min;
	private EditText cp_max;
	private TextView textview6;
	private LinearLayout linear8;
	private TextInputLayout textinputlayout7;
	private TextView textview7;
	private TextInputLayout textinputlayout8;
	private EditText bp_min;
	private EditText bp_max;
	private TextView textview8;
	private LinearLayout linear10;
	private TextInputLayout textinputlayout9;
	private TextView textview9;
	private TextInputLayout textinputlayout10;
	private EditText cho_min;
	private EditText chole_max;
	private TextView textview10;
	private LinearLayout linear12;
	private TextInputLayout textinputlayout11;
	private TextView textview11;
	private TextInputLayout textinputlayout12;
	private EditText edittext11;
	private EditText edittext12;
	private TextView textview12;
	private LinearLayout linear14;
	private TextInputLayout textinputlayout13;
	private TextView textview13;
	private TextInputLayout textinputlayout14;
	private EditText edittext13;
	private EditText edittext14;
	private TextView textview14;
	private LinearLayout linear16;
	private TextInputLayout textinputlayout15;
	private TextView textview15;
	private TextInputLayout textinputlayout16;
	private EditText edittext15;
	private EditText edittext16;
	private TextView textview16;
	private LinearLayout linear18;
	private TextInputLayout textinputlayout17;
	private TextView textview17;
	private TextInputLayout textinputlayout18;
	private EditText edittext17;
	private EditText edittext18;
	private TextView textview18;
	private LinearLayout linear20;
	private TextInputLayout textinputlayout19;
	private TextView textview19;
	private TextInputLayout textinputlayout20;
	private EditText edittext19;
	private EditText edittext20;
	
	private Intent intent = new Intent();
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.filteroption);
		initialize(_savedInstanceState);
		FirebaseApp.initializeApp(this);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		_app_bar = findViewById(R.id._app_bar);
		_coordinator = findViewById(R.id._coordinator);
		_toolbar = findViewById(R.id._toolbar);
		setSupportActionBar(_toolbar);
		getSupportActionBar().setDisplayHomeAsUpEnabled(true);
		getSupportActionBar().setHomeButtonEnabled(true);
		_toolbar.setNavigationOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _v) {
				onBackPressed();
			}
		});
		vscroll1 = findViewById(R.id.vscroll1);
		linear1 = findViewById(R.id.linear1);
		linear4 = findViewById(R.id.linear4);
		linear5 = findViewById(R.id.linear5);
		linear7 = findViewById(R.id.linear7);
		linear9 = findViewById(R.id.linear9);
		linear11 = findViewById(R.id.linear11);
		linear13 = findViewById(R.id.linear13);
		linear15 = findViewById(R.id.linear15);
		linear17 = findViewById(R.id.linear17);
		linear19 = findViewById(R.id.linear19);
		materialbutton1 = findViewById(R.id.materialbutton1);
		textview2 = findViewById(R.id.textview2);
		linear2 = findViewById(R.id.linear2);
		textinputlayout3 = findViewById(R.id.textinputlayout3);
		textview3 = findViewById(R.id.textview3);
		ageMax = findViewById(R.id.ageMax);
		age_min = findViewById(R.id.age_min);
		edittext4 = findViewById(R.id.edittext4);
		textview4 = findViewById(R.id.textview4);
		linear6 = findViewById(R.id.linear6);
		textinputlayout5 = findViewById(R.id.textinputlayout5);
		textview5 = findViewById(R.id.textview5);
		textinputlayout6 = findViewById(R.id.textinputlayout6);
		cp_min = findViewById(R.id.cp_min);
		cp_max = findViewById(R.id.cp_max);
		textview6 = findViewById(R.id.textview6);
		linear8 = findViewById(R.id.linear8);
		textinputlayout7 = findViewById(R.id.textinputlayout7);
		textview7 = findViewById(R.id.textview7);
		textinputlayout8 = findViewById(R.id.textinputlayout8);
		bp_min = findViewById(R.id.bp_min);
		bp_max = findViewById(R.id.bp_max);
		textview8 = findViewById(R.id.textview8);
		linear10 = findViewById(R.id.linear10);
		textinputlayout9 = findViewById(R.id.textinputlayout9);
		textview9 = findViewById(R.id.textview9);
		textinputlayout10 = findViewById(R.id.textinputlayout10);
		cho_min = findViewById(R.id.cho_min);
		chole_max = findViewById(R.id.chole_max);
		textview10 = findViewById(R.id.textview10);
		linear12 = findViewById(R.id.linear12);
		textinputlayout11 = findViewById(R.id.textinputlayout11);
		textview11 = findViewById(R.id.textview11);
		textinputlayout12 = findViewById(R.id.textinputlayout12);
		edittext11 = findViewById(R.id.edittext11);
		edittext12 = findViewById(R.id.edittext12);
		textview12 = findViewById(R.id.textview12);
		linear14 = findViewById(R.id.linear14);
		textinputlayout13 = findViewById(R.id.textinputlayout13);
		textview13 = findViewById(R.id.textview13);
		textinputlayout14 = findViewById(R.id.textinputlayout14);
		edittext13 = findViewById(R.id.edittext13);
		edittext14 = findViewById(R.id.edittext14);
		textview14 = findViewById(R.id.textview14);
		linear16 = findViewById(R.id.linear16);
		textinputlayout15 = findViewById(R.id.textinputlayout15);
		textview15 = findViewById(R.id.textview15);
		textinputlayout16 = findViewById(R.id.textinputlayout16);
		edittext15 = findViewById(R.id.edittext15);
		edittext16 = findViewById(R.id.edittext16);
		textview16 = findViewById(R.id.textview16);
		linear18 = findViewById(R.id.linear18);
		textinputlayout17 = findViewById(R.id.textinputlayout17);
		textview17 = findViewById(R.id.textview17);
		textinputlayout18 = findViewById(R.id.textinputlayout18);
		edittext17 = findViewById(R.id.edittext17);
		edittext18 = findViewById(R.id.edittext18);
		textview18 = findViewById(R.id.textview18);
		linear20 = findViewById(R.id.linear20);
		textinputlayout19 = findViewById(R.id.textinputlayout19);
		textview19 = findViewById(R.id.textview19);
		textinputlayout20 = findViewById(R.id.textinputlayout20);
		edittext19 = findViewById(R.id.edittext19);
		edittext20 = findViewById(R.id.edittext20);
		
		materialbutton1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				intent.putExtra("filter", "yes");
				if ("".equals("") && "".equals("")) {
					
				}
				else {
					mapp = new HashMap<>();
					mapp.put("id", "gender");
					mapp.put("min", min);
					mapp.put("max", max);
					map.add(mapp);
				}
				if ("".equals("") && "".equals("")) {
					
				}
				else {
					mapp = new HashMap<>();
					mapp.put("id", "chest_pain");
					mapp.put("min", min);
					mapp.put("max", max);
					map.add(mapp);
				}
				if ("".equals("") && "".equals("")) {
					
				}
				else {
					mapp = new HashMap<>();
					mapp.put("id", "blood_pressure");
					mapp.put("min", min);
					mapp.put("max", max);
					map.add(mapp);
				}
				if ("".equals("") && "".equals("")) {
					
				}
				else {
					mapp = new HashMap<>();
					mapp.put("id", "cholesterol");
					mapp.put("min", min);
					mapp.put("max", max);
					map.add(mapp);
				}
				if ("".equals("") && "".equals("")) {
					
				}
				else {
					mapp = new HashMap<>();
					mapp.put("id", "plasma_gluecose");
					mapp.put("min", min);
					mapp.put("max", max);
					map.add(mapp);
				}
				if ("".equals("") && "".equals("")) {
					
				}
				else {
					mapp = new HashMap<>();
					mapp.put("id", "diabetice");
					mapp.put("min", min);
					mapp.put("max", max);
					map.add(mapp);
				}
				if ("".equals("") && "".equals("")) {
					
				}
				else {
					mapp = new HashMap<>();
					mapp.put("id", "insulin");
					mapp.put("min", min);
					mapp.put("max", max);
					map.add(mapp);
				}
				if ("".equals("") && "".equals("")) {
					
				}
				else {
					mapp = new HashMap<>();
					mapp.put("id", "age");
					mapp.put("min", min);
					mapp.put("max", max);
					map.add(mapp);
				}
				if ("".equals("") && "".equals("")) {
					
				}
				else {
					mapp = new HashMap<>();
					mapp.put("id", "priorities");
					mapp.put("min", min);
					mapp.put("max", max);
					map.add(mapp);
				}
			}
		});
	}
	
	private void initializeLogic() {
		linear4.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)5, (int)2, 0xFF000000, 0xFFFFFFFF));
		linear5.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)5, (int)2, 0xFF000000, 0xFFFFFFFF));
		linear7.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)5, (int)2, 0xFF000000, 0xFFFFFFFF));
		linear9.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)5, (int)2, 0xFF000000, 0xFFFFFFFF));
		linear11.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)5, (int)2, 0xFF000000, 0xFFFFFFFF));
		linear13.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)5, (int)2, 0xFF000000, 0xFFFFFFFF));
		linear15.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)5, (int)2, 0xFF000000, 0xFFFFFFFF));
		linear17.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)5, (int)2, 0xFF000000, 0xFFFFFFFF));
	}
	
	
	@Deprecated
	public void showMessage(String _s) {
		Toast.makeText(getApplicationContext(), _s, Toast.LENGTH_SHORT).show();
	}
	
	@Deprecated
	public int getLocationX(View _v) {
		int _location[] = new int[2];
		_v.getLocationInWindow(_location);
		return _location[0];
	}
	
	@Deprecated
	public int getLocationY(View _v) {
		int _location[] = new int[2];
		_v.getLocationInWindow(_location);
		return _location[1];
	}
	
	@Deprecated
	public int getRandom(int _min, int _max) {
		Random random = new Random();
		return random.nextInt(_max - _min + 1) + _min;
	}
	
	@Deprecated
	public ArrayList<Double> getCheckedItemPositionsToArray(ListView _list) {
		ArrayList<Double> _result = new ArrayList<Double>();
		SparseBooleanArray _arr = _list.getCheckedItemPositions();
		for (int _iIdx = 0; _iIdx < _arr.size(); _iIdx++) {
			if (_arr.valueAt(_iIdx))
			_result.add((double)_arr.keyAt(_iIdx));
		}
		return _result;
	}
	
	@Deprecated
	public float getDip(int _input) {
		return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, _input, getResources().getDisplayMetrics());
	}
	
	@Deprecated
	public int getDisplayWidthPixels() {
		return getResources().getDisplayMetrics().widthPixels;
	}
	
	@Deprecated
	public int getDisplayHeightPixels() {
		return getResources().getDisplayMetrics().heightPixels;
	}
}