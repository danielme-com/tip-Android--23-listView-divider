package com.danielme.tipsandroid.listviewdivider;

import com.danieme.tipsandroid.listviewdivider.R;

import android.app.ListActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;

/**
 * 
 * @author danielme.com
 *
 */
public class MainActivity extends ListActivity
{

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		String[] names = new String[] { "uno","dos","tres","cuatro", "cinco", "seis", "siete","ocho","nueve","diez","once","doce","trece","catorce","quince", "dieciséis", "diecisiete","dieciocho" };
		setListAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,android.R.id.text1, names));
	}
}