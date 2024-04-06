package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Card;

public interface ICardService {
	public List<Card> findAll();
	public int save(Card card);
	public int update(Card card);
	public int deleteById(int id);
}
