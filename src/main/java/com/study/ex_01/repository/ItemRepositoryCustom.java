package com.study.ex_01.repository;

import com.study.ex_01.dto.ItemSearchDto;
import com.study.ex_01.entity.Item;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ItemRepositoryCustom {

    Page<Item> getAdminItemPage(ItemSearchDto itemSearchDto, Pageable pageable);
}
