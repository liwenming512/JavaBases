package com.zhangguo.bookstore.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.zhangguo.bookstore.entities.Book;
import com.zhangguo.bookstore.mapper.BookDAO;

@Service
public class BookService {
	
	@Resource
	BookDAO bookDao;
	
	public List<Book> getAllBooks(){
		return bookDao.getAllBooks();
	}
	
	public Book getBookById(int id){
		return bookDao.getBookById(id);
	}
	
	public int add(Book entity){
		return bookDao.add(entity);
	}
	
	@Transactional
	public int add(Book entity1, Book entityBak){
		int rows = 0;
		rows = bookDao.add(entity1);
		rows = bookDao.add(entityBak);
		return rows;
	}
	
	public int delete(int id){
		return bookDao.delete(id);
	}
	
	public int delete(String[] ids){
		int rows = 0;
		for(String idstr:ids){
			int id = Integer.parseInt(idstr);
			rows += delete(id);
		}
		return rows;
	}
	
	public int update(Book entity){
		return bookDao.update(entity);
	}
}
