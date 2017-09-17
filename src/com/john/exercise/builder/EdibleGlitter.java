package com.john.exercise.builder;

public class EdibleGlitter extends Decoration{

	@Override
	public String name() {
		return getType() + "- Edible Glitter";
	}

	@Override
	public float price() {
		return 1.25f;
	}

}
