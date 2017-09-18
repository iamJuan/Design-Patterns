package com.john.exercise.flyweight;

import java.util.HashMap;

public class TreeFactory {
	
	public static final HashMap<String, Tree> oakMap = new HashMap<String, Tree>();
	
	public static Tree getOakTree(){
		OakTree oakTree = (OakTree)oakMap.get("Oak");
		
		if(oakTree == null){
			oakTree = new OakTree();
			oakMap.put("Oak", oakTree);
			System.out.println("Creating an oak tree");
		}
		
		return oakTree;
	}
}
