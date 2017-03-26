package com.vongvia.viewpager;
/**
 * @Title:  程序的引导页
 */
import java.util.ArrayList;
import java.util.List;

import com.vongvia.acitivity.MainActivity;
import com.vongvia.cardsgame.R;

import android.R.interpolator;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.provider.DocumentsContract;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.OnPageChangeListener;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;

public class Guide extends Activity implements OnPageChangeListener{
	
	
	private ViewPager vp;
	private ViewPagerAdapter vpAdapter;
	private List<View> views;
	private ImageView[] dots;
	private int[] ids={R.id.iv1};
	private Button start_btn;
	@Override
	public void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
	   super.onCreate(savedInstanceState);
	   setContentView(com.vongvia.cardsgame.R.layout.guide);
	   initViews();
	   initDots();
	
	}
	
	private void initViews()
	{
	 LayoutInflater inflater=LayoutInflater.from(this);
	 views=new ArrayList<View>();
	 views.add(inflater.inflate(R.layout.vager_one, null));
	 
	 vpAdapter=new ViewPagerAdapter(views,this);
	 vp=(ViewPager)findViewById(R.id.viewpager);
	 vp.setAdapter(vpAdapter);
	 

	 
	 vp.setOnPageChangeListener(this);
	}
	
  private void initDots()
  {
	  dots=new ImageView[views.size()];
	  for(int i=0;i<views.size();i++)
		  dots[i]=(ImageView) findViewById(ids[i]);
  }

@Override
public void onPageScrollStateChanged(int arg0) {
	// TODO Auto-generated method stub
	
}

@Override
public void onPageScrolled(int arg0, float arg1, int arg2) {
	// TODO Auto-generated method stub
	
}

@Override
public void onPageSelected(int arg0) {
	// TODO Auto-generated method stub
	for(int i=0;i<ids.length;i++)
	{
		if(arg0==i)
		{
			dots[i].setImageResource(R.drawable.login_point_selected);
		}
		else 
		{
			dots[i].setImageResource(R.drawable.login_point);
		
		}
	}
	
}
}
