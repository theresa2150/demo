package com.example.demo.repositories.impl;

import org.springframework.stereotype.Repository;

import com.example.demo.repositories.InterfaceB;

@Repository
public class ImplB implements InterfaceB {

//	@Override
	public void storeComment() {
		System.out.println(this.getClass().getSimpleName());
	}
}
