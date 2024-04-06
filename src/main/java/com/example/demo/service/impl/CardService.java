package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Card;
import com.example.demo.repository.ICardRepository;
import com.example.demo.service.ICardService;

@Service
public class CardService implements ICardService {

	@Autowired
	ICardRepository iCardRepository;
	
	@Override
	public List<Card> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int save(Card card) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(Card card) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteById(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

}
