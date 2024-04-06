package com.example.demo.repository;

import java.util.List;

import com.example.demo.model.Card;

public interface ICardRepository {
	public List<Card> findAll();
	public int save(Card card);
	public int update(Card card);
	public int deleteById(int id);
}
