package com.zzwx.weimao.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import com.clock.easonclock.R;
import com.zzwx.weimao.view.XListView;
import com.zzwx.weimao.view.XListView.IXListViewListener;

public class WeiBoHuaTi extends Fragment implements IXListViewListener {
	
	private XListView mListView;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View layout = inflater.inflate(R.layout.yuiqngjiankong_weibohuati, null);
		mListView = (XListView) layout.findViewById(R.id.xListView_weibo);
		mListView.setPullLoadEnable(true);
		mListView.setPullRefreshEnable(true);
		mListView.setXListViewListener(this);
		final String[] colors = getResources().getStringArray(R.array.menu_names);
		ArrayAdapter<String> colorAdapter = new ArrayAdapter<String>(getActivity(), 
		android.R.layout.simple_list_item_1, android.R.id.text1, colors);
		mListView.setAdapter(colorAdapter);
		
		return layout;
	}

	@Override
	public void onRefresh() {
//		new Thread(new Runnable() {
			
//			@Override
//			public void run() {
//				
//				try {
//					Thread.sleep(3000);
//					mListView.stopRefresh();
//					Toast.makeText(getActivity(), "没有更多数据了", Toast.LENGTH_SHORT).show();
//				} catch (InterruptedException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//				
//			}
//		}).start();
		
	}

	@Override
	public void onLoadMore() {
//		new Thread(new Runnable() {
//			
//			@Override
//			public void run() {
//				
//				try {
//					Thread.sleep(3000);
//					mListView.stopLoadMore();
//					Toast.makeText(getActivity(), "没有更多数据了", Toast.LENGTH_SHORT).show();
//				} catch (InterruptedException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//				
//			}
//		}).start();
		
	}
	
}
