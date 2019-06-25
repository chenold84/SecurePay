package com.spay.shoppingcart.dao;

import java.util.List;

import com.spay.shoppingcart.entities.Category;

public interface CatelogueDao {

	List<Category> fetchCatelogue();

}