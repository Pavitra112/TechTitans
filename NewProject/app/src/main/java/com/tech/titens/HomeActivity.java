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
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ListView;
import androidx.annotation.*;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.firebase.FirebaseApp;
import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.GenericTypeIndicator;
import com.google.firebase.database.ValueEventListener;
import java.io.*;
import java.text.*;
import java.util.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.*;
import org.json.*;

public class HomeActivity extends AppCompatActivity {
	
	private FirebaseDatabase _firebase = FirebaseDatabase.getInstance();
	
	private Toolbar _toolbar;
	private AppBarLayout _app_bar;
	private CoordinatorLayout _coordinator;
	private FloatingActionButton _fab;
	
	private ArrayList<HashMap<String, Object>> lMap = new ArrayList<>();
	
	private ListView listview1;
	
	private DatabaseReference data = _firebase.getReference("data");
	private ChildEventListener _data_child_listener;
	private Intent intent = new Intent();
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.home);
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
		_fab = findViewById(R.id._fab);
		
		listview1 = findViewById(R.id.listview1);
		
		_fab.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				intent.setClass(getApplicationContext(), FilteroptionActivity.class);
				startActivity(intent);
			}
		});
		
		_data_child_listener = new ChildEventListener() {
			@Override
			public void onChildAdded(DataSnapshot _param1, String _param2) {
				GenericTypeIndicator<HashMap<String, Object>> _ind = new GenericTypeIndicator<HashMap<String, Object>>() {};
				final String _childKey = _param1.getKey();
				final HashMap<String, Object> _childValue = _param1.getValue(_ind);
				data.addListenerForSingleValueEvent(new ValueEventListener() {
					@Override
					public void onDataChange(DataSnapshot _dataSnapshot) {
						lMap = new ArrayList<>();
						try {
							GenericTypeIndicator<HashMap<String, Object>> _ind = new GenericTypeIndicator<HashMap<String, Object>>() {};
							for (DataSnapshot _data : _dataSnapshot.getChildren()) {
								HashMap<String, Object> _map = _data.getValue(_ind);
								lMap.add(_map);
							}
						}
						catch (Exception _e) {
							_e.printStackTrace();
						}
						listview1.setAdapter(new Listview1Adapter(lMap));
						((BaseAdapter)listview1.getAdapter()).notifyDataSetChanged();
					}
					@Override
					public void onCancelled(DatabaseError _databaseError) {
					}
				});
			}
			
			@Override
			public void onChildChanged(DataSnapshot _param1, String _param2) {
				GenericTypeIndicator<HashMap<String, Object>> _ind = new GenericTypeIndicator<HashMap<String, Object>>() {};
				final String _childKey = _param1.getKey();
				final HashMap<String, Object> _childValue = _param1.getValue(_ind);
				
			}
			
			@Override
			public void onChildMoved(DataSnapshot _param1, String _param2) {
				
			}
			
			@Override
			public void onChildRemoved(DataSnapshot _param1) {
				GenericTypeIndicator<HashMap<String, Object>> _ind = new GenericTypeIndicator<HashMap<String, Object>>() {};
				final String _childKey = _param1.getKey();
				final HashMap<String, Object> _childValue = _param1.getValue(_ind);
				
			}
			
			@Override
			public void onCancelled(DatabaseError _param1) {
				final int _errorCode = _param1.getCode();
				final String _errorMessage = _param1.getMessage();
				
			}
		};
		data.addChildEventListener(_data_child_listener);
	}
	
	private void initializeLogic() {
	}
	
	public class Listview1Adapter extends BaseAdapter {
		
		ArrayList<HashMap<String, Object>> _data;
		
		public Listview1Adapter(ArrayList<HashMap<String, Object>> _arr) {
			_data = _arr;
		}
		
		@Override
		public int getCount() {
			return _data.size();
		}
		
		@Override
		public HashMap<String, Object> getItem(int _index) {
			return _data.get(_index);
		}
		
		@Override
		public long getItemId(int _index) {
			return _index;
		}
		
		@Override
		public View getView(final int _position, View _v, ViewGroup _container) {
			LayoutInflater _inflater = getLayoutInflater();
			View _view = _v;
			if (_view == null) {
				_view = _inflater.inflate(R.layout.view, null);
			}
			
			final LinearLayout linear1 = _view.findViewById(R.id.linear1);
			final LinearLayout linear2 = _view.findViewById(R.id.linear2);
			final LinearLayout linear3 = _view.findViewById(R.id.linear3);
			final LinearLayout linear4 = _view.findViewById(R.id.linear4);
			final TextView textview1 = _view.findViewById(R.id.textview1);
			final TextView textview2 = _view.findViewById(R.id.textview2);
			final TextView textview3 = _view.findViewById(R.id.textview3);
			final TextView textview4 = _view.findViewById(R.id.textview4);
			final TextView textview5 = _view.findViewById(R.id.textview5);
			final TextView textview6 = _view.findViewById(R.id.textview6);
			final TextView textview7 = _view.findViewById(R.id.textview7);
			final TextView textview8 = _view.findViewById(R.id.textview8);
			final TextView textview9 = _view.findViewById(R.id.textview9);
			final TextView textview18 = _view.findViewById(R.id.textview18);
			final TextView textview10 = _view.findViewById(R.id.textview10);
			final TextView textview11 = _view.findViewById(R.id.textview11);
			final TextView textview12 = _view.findViewById(R.id.textview12);
			final TextView textview13 = _view.findViewById(R.id.textview13);
			final TextView textview14 = _view.findViewById(R.id.textview14);
			final TextView textview15 = _view.findViewById(R.id.textview15);
			final TextView textview16 = _view.findViewById(R.id.textview16);
			final TextView textview17 = _view.findViewById(R.id.textview17);
			
			linear2.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)5, (int)2, 0xFF000000, 0xFFFFFFFF));
			try {
				textview1.setText("Id : Patient_".concat(_data.get((int)_position).get("id").toString()));
			} catch (Exception e) {
				 
			}
			try {
				textview2.setText("Age : ".concat(_data.get((int)_position).get("age").toString()));
			} catch (Exception e) {
				 
			}
			try {
				textview3.setText("Gender : ".concat(_data.get((int)_position).get("gender").toString()));
			} catch (Exception e) {
				 
			}
			try {
				textview4.setText("Chest Pain Type : ".concat(_data.get((int)_position).get("chest pain type").toString()));
			} catch (Exception e) {
				 
			}
			try {
				textview5.setText("Cholesterol : ".concat(_data.get((int)_position).get("cholesterol").toString()));
			} catch (Exception e) {
				 
			}
			try {
				textview6.setText("Max Heart Rate : ".concat(_data.get((int)_position).get("max heart rate").toString()));
			} catch (Exception e) {
				 
			}
			try {
				textview7.setText("Exercise angina : ".concat(_data.get((int)_position).get("exercise angina").toString()));
			} catch (Exception e) {
				 
			}
			try {
				textview8.setText("Plasma Glucose : ".concat(_data.get((int)_position).get("plasma glucose").toString()));
			} catch (Exception e) {
				 
			}
			try {
				textview9.setText("Skin Thikness : ".concat(_data.get((int)_position).get("skin_thickness").toString()));
			} catch (Exception e) {
				 
			}
			try {
				textview10.setText("Insulin : ".concat(_data.get((int)_position).get("insulin").toString()));
			} catch (Exception e) {
				 
			}
			try {
				textview11.setText("Bmi : ".concat(_data.get((int)_position).get("bmi").toString()));
			} catch (Exception e) {
				 
			}
			try {
				textview12.setText("Diabetes : ".concat(_data.get((int)_position).get("diabetes_pedigree").toString()));
			} catch (Exception e) {
				 
			}
			try {
				textview13.setText("Hypertension: ".concat(_data.get((int)_position).get("hypertension").toString()));
			} catch (Exception e) {
				 
			}
			try {
				textview14.setText("Heart Disease : ".concat(_data.get((int)_position).get("heart_disease").toString()));
			} catch (Exception e) {
				 
			}
			try {
				textview15.setText("Residence type : ".concat(_data.get((int)_position).get("Residence_type").toString()));
			} catch (Exception e) {
				 
			}
			try {
				textview16.setText("Smoking : ".concat(_data.get((int)_position).get("smoking_status").toString()));
			} catch (Exception e) {
				 
			}
			try {
				textview17.setText("Triage : ".concat(_data.get((int)_position).get("triage").toString()));
			} catch (Exception e) {
				 
			}
			
			return _view;
		}
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