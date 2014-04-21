package com.simpleheaven.fragment;

import com.clock.easonclock.R;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;

public class HomePageFragment extends Fragment{

	
	@Override
	public View onCreateView(final LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View layout = inflater.inflate(R.layout.home_layout,null);
		ListView lv_home_clocktime = (ListView) layout.findViewById(R.id.lv_home_clocktime);
		
		
		lv_home_clocktime.setAdapter(new BaseAdapter() {
			
			@Override
			public View getView(int position, View convertView, ViewGroup parent) {
				View layout = inflater.inflate(R.layout.menu_list_item, null);
				
				
				return layout;
			}
			
			@Override
			public long getItemId(int position) {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public Object getItem(int position) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public int getCount() {
				// TODO Auto-generated method stub
				return 10;
			}
		});
		
		return layout;
	}
}
