package com.recipeManager.bean;

import javax.faces.bean.ManagedBean;

@ManagedBean(name="recipeMngr")
public class RecipeManager {
	String recipeId;
	String recipeName;
	
	public RecipeManager(){
		
	}
	public String getRecipeId() {
		return recipeId;
	}
	public void setRecipeId(String recipeId) {
		this.recipeId = recipeId;
	}
	public String getRecipeName() {
		return recipeName;
	}
	public void setRecipeName(String recipeName) {
		this.recipeName = recipeName;
	}	
}
