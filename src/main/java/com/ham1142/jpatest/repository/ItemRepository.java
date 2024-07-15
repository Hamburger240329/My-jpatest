package com.ham1142.jpatest.repository;

import com.ham1142.jpatest.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, Long> {
}
