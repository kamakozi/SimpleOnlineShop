package com.codestore.store.service.cardservice;

import com.codestore.store.entity.CardEntity;
import com.codestore.store.repository.CardRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CardServiceImpl implements CardService {
    private final CardRepository cardRepository;

    public CardServiceImpl(CardRepository cardRepository){
        this.cardRepository = cardRepository;
    }

    @Override
    public List<CardEntity> getAllCardEntities(){
        return cardRepository.findAll();
    }

    @Override
    public void deleteCard(Long id){
        cardRepository.deleteById(id); // returns void
    }

    @Override
    public CardEntity addItem(CardEntity card){
        return cardRepository.save(card); // saves to DB
    }
}