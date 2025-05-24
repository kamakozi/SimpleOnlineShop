package com.codestore.store.service.cardservice;

import com.codestore.store.entity.CardEntity;
import com.codestore.store.repository.CardRepository;

import java.util.List;

public interface CardService {
    List<CardEntity> getAllCardEntities();
    void deleteCard(Long id);
    CardEntity addItem(CardEntity card);
}
