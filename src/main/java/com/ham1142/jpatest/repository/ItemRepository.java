package com.ham1142.jpatest.repository;

import com.ham1142.jpatest.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ItemRepository extends JpaRepository<Item, Long> {

    List<Item> findByItemNm(String itemNm);

    List<Item> findByItemNmOrItemDetail(String itemNm, String itemDetail); // 이름이나 Detail 둘 중 하나만 일치하는 필드 값을 조회

    List<Item> findByPriceLessThanEqual(int price);

}