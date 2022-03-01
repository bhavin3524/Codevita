package com.sortingdemo;

import java.util.ArrayList;
import java.util.Collections;

import com.sortingdemo.util.MyUtils;

public class MP4 {
	public static void main(String[] args) {
		ArrayList<Song> songList = new ArrayList<Song>();
		
		songList.add(new Song("ABC", "Arijit singh", 2011));
		songList.add(new Song("PQR", "Shankar Mahadeva", 2006));
		songList.add(new Song("BCD", "Shreya goshal", 2004));
		songList.add(new Song("EFG", "Arman malik", 2014));
		songList.add(new Song("EDC", "Bieber", 2003));
		
		
		MyUtils.iterateList(songList);
		
		Collections.sort(songList);
		
		System.out.println("After Sorting....");
		
		MyUtils.iterateList(songList);
		
		
		
	}
}
