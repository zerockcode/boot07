package org.zerock.persistence;

import org.springframework.data.repository.CrudRepository;
import org.zerock.domain.QWebBoard;
import org.zerock.domain.WebBoard;

import com.querydsl.core.BooleanBuilder;
import com.querydsl.core.types.Predicate;

public interface CustomCrudRepository 
    extends CrudRepository<WebBoard, Long>, CustomWebBoard {

	
}
