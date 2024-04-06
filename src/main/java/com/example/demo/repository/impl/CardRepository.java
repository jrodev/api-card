package com.example.demo.repository.impl;

import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import com.example.demo.model.Card;
import com.example.demo.repository.ICardRepository;
 
public class CardRepository implements ICardRepository {

	private JdbcTemplate jdbcTemplate;
	
	@Override
	public List<Card> findAll() {
		
		String SQL = "SELECT * FROM cards WHERE status = 1";
		List<Card> cards = jdbcTemplate.query(SQL, BeanPropertyRowMapper.newInstance(Card.class));
		
		return cards;
	}

	@Override
	public int save(Card card) {
		
		String SQL = "INSERT INTO cards VALUES (?,?,?,?,?)";
		
		Object[] oCard = new Object[]{
			card.getName(), card.getNumber(), card.getType(), card.getCvv(), card.getStatus()
		};
		
		int numRowsAffected = jdbcTemplate.update(SQL, oCard);

		return numRowsAffected;
	}

	@Override
	public int update(Card card) {
		
		String SQL = "UPDATE cards SET name=?, number=?, type=?, cvv=? WHERE idcard=?";
		
		Object[] oCard = new Object[]{
			card.getName(), card.getNumber(), card.getType(), card.getCvv(), card.getIdcard()
		};
		
		int numRowsAffected = jdbcTemplate.update(SQL, oCard);

		return numRowsAffected;
	}

	@Override
	public int deleteById(int id) {
		
		String SQL = "UPDATE cards SET status=0 WHERE idcard=?";
		
		Object[] oCard = new Object[]{id};
		
		int numRowsAffected = jdbcTemplate.update(SQL, oCard);

		return numRowsAffected;
	}

}
