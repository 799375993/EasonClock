package com.simpleheaven.fragment;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.clock.easonclock.EasonClockActivity;
import com.clock.easonclock.R;

public class MenuFragment extends ListFragment {

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		return inflater.inflate(R.layout.menu_list, null);
	}

	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);
		final String[] colors = getResources().getStringArray(R.array.menu_names);
//		ArrayAdapter<String> colorAdapter = new ArrayAdapter<String>(getActivity(), 
//				android.R.layout.simple_list_item_1, android.R.id.text1, colors);
		setListAdapter(new BaseAdapter() {
			
			private ImageView img_menu;
			private TextView tv_menu;
			private View layout;


			@SuppressLint("ResourceAsColor")
			@Override
			public View getView(int position, View convertView, ViewGroup parent) {
				layout = getActivity().getLayoutInflater().inflate(R.layout.menu_list_item, null);
				tv_menu = (TextView) layout.findViewById(R.id.row_title);
				img_menu = (ImageView) layout.findViewById(R.id.row_icon);
				tv_menu.setText(colors[position]);
//				if(position==0){
//					img_menu.setVisibility(View.GONE);
//					layout.setBackgroundColor(android.R.color.darker_gray);
////					isEnabled(0);
//				}
//				if(position==4){
//					img_menu.setVisibility(View.GONE);
//					layout.setBackgroundColor(android.R.color.darker_gray);
////					isEnabled(4);
//				}
				
				
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
				return position;
			}
			
			@Override
			public int getCount() {
				// TODO Auto-generated method stub
				return colors.length;
			}
			
			@Override
			public boolean isEnabled(int position) {
//				if (position==0) {
//					return false;
//				}
//				if (position==4) {
//					return false;
//				}
				
				
				return super.isEnabled(position);
			}
			
		});
	}

	@Override
	public void onListItemClick(ListView lv, View v, int position, long id) {
		Fragment newContent = null;
		switch (position) {
		case 0:
			newContent = new ColorFragment(R.color.red);
			break;
		case 1:
			newContent = new ColorFragment(R.color.green);
			getActivity().setTitle("舆情监控");
			break;
		case 2:
			newContent = new WeiBoHuaTi();
			getActivity().setTitle("舆情分析");
			break;
		case 3:
			newContent = new ColorFragment(android.R.color.white);
			getActivity().setTitle("关键词分析");
			break;
		case 4:
			newContent = new ColorFragment(android.R.color.black);
			getActivity().setTitle("关键词分析");
			break;
		case 5:
			newContent = new ColorFragment(android.R.color.white);
			getActivity().setTitle("基础设置");
			break;
		case 6:
			newContent = new ColorFragment(android.R.color.darker_gray);
			getActivity().setTitle("关键词管理");
			break;
		case 7:
			newContent = new ColorFragment(android.R.color.white);
			getActivity().setTitle("特证词管理");
			break;
		case 8:
			newContent = new ColorFragment(android.R.color.black);
			getActivity().setTitle("栏目管理");
			break;
		}
		if (newContent != null)
			switchFragment(newContent);
	}

	// the meat of switching the above fragment
	private void switchFragment(Fragment fragment) {
		if (getActivity() == null)
			return;
		
//		if (getActivity() instanceof MainActivity) {
			EasonClockActivity fca = (EasonClockActivity) getActivity();
			fca.switchContent(fragment);
//		} else if (getActivity() instanceof ResponsiveUIActivity) {
//			ResponsiveUIActivity ra = (ResponsiveUIActivity) getActivity();
//			ra.switchContent(fragment);
//		}
	}


}
