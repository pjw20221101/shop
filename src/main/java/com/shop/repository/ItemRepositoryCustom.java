package com.shop.repository;

import com.shop.dto.ItemSearchDto;
import com.shop.entity.Item;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import com.shop.dto.MainItemDto;


//인터페이스, 선언만 되어 있다. 구현하는 클래스를 생성  (ItemRepositoryCustomImpl)
public interface ItemRepositoryCustom {

	// 관리자 페이지에서 처리하는 검색 기능이 구현 
    Page<Item> getAdminItemPage(ItemSearchDto itemSearchDto, Pageable pageable);

    
    // Main에서 사용되는 검색 
    Page<MainItemDto> getMainItemPage(ItemSearchDto itemSearchDto, Pageable pageable);

}