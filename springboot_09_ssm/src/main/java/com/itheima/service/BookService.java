package com.itheima.service;

import com.itheima.domain.Book;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface BookService {

    /**
     * 保存
     * @param book
     * @return
     */
    public Boolean save(Book book);

    /**
     * 修改
     * @param book
     * @return
     */
    public Boolean update(Book book);

    /**
     * 根据id删除
     * @param id
     * @return
     */
    public Boolean delete(Integer id);

    /**
     * 根据id查找
     * @param id
     * @return
     */
    public Book getById(Integer id);

    /**
     * 查找全部
     * @return
     */
    public List<Book> getAll();
}
