package com.example.videoplayer;

import java.io.File;

import android.app.Activity;
import android.os.Bundle;
import android.os.Environment;
import android.widget.MediaController;
import android.widget.VideoView;

public class HomeActivity extends Activity
{
	VideoView videoViewer;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.home);
		videoViewer = (VideoView) findViewById(R.id.videoView1);
		
		//get path of Video file
		File sdCard = Environment.getExternalStorageDirectory();
		String filePath = sdCard.getAbsolutePath() + "/tech.3gp";
		videoViewer.setVideoPath(filePath);
		MediaController con = new MediaController(HomeActivity.this);
		videoViewer.setMediaController(con);
		videoViewer.start();
	}
}
