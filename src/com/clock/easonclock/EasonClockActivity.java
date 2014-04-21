package com.clock.easonclock;
/**
 * 成功正式启程。
 * 
 * @author Administrator
 */
/**
 * 开启人生的第一桶金
 * 
 * @author Administrator
 */
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.widget.Toast;

import com.jeremyfeinstein.slidingmenu.lib.SlidingMenu;
import com.simpleheaven.fragment.ColorFragment;
import com.simpleheaven.fragment.MenuFragment;
import com.simpleheaven.fragment.HomePageFragment;

public class EasonClockActivity extends BaseActivity {
	
	private Fragment mContent;
	private HomePageFragment homefragment;
	
	public EasonClockActivity() {
		super(R.string.app_name);
	}
	
	@Override
	public void Settitle(String title) {
		super.Settitle(title);
	}
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		// set the Above View
		if (savedInstanceState != null)
			mContent = getSupportFragmentManager().getFragment(savedInstanceState, "mContent");
		if (mContent == null)
			mContent = new ColorFragment(R.color.green);
		homefragment = new HomePageFragment();
		/**
		 * test
		 */
		Log.e("???", "?>?????");
		Toast.makeText(getApplicationContext(), "test?", Toast.LENGTH_LONG).show();
		
		// set the Above View
		setContentView(R.layout.content_frame);
		getSupportFragmentManager()
		.beginTransaction()
		.replace(R.id.content_frame, homefragment)
		.commit();
		
		// set the Behind View
		setBehindContentView(R.layout.menu_frame);
		getSupportFragmentManager()
		.beginTransaction()
		.replace(R.id.menu_frame, new MenuFragment())
		.commit();
		
		// customize the SlidingMenu
		getSlidingMenu().setTouchModeAbove(SlidingMenu.TOUCHMODE_FULLSCREEN);
	}
	
	@Override
	public void onSaveInstanceState(Bundle outState) {
		super.onSaveInstanceState(outState);
		getSupportFragmentManager().putFragment(outState, "mContent", mContent);
	}
	
	public void switchContent(Fragment fragment) {
		mContent = fragment;
		getSupportFragmentManager()
		.beginTransaction()
		.replace(R.id.content_frame, fragment)
		.commit();
		getSlidingMenu().showContent();
	}
}
