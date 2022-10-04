package com.itheima.service.Impl;

import com.itheima.controller.Code;
import com.itheima.dao.BookDao;
import com.itheima.domain.Book;
import com.itheima.exception.BusinessException;
import com.itheima.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookDao bookDao;

    @Override
    public Boolean save(Book book) {
        return bookDao.save(book) > 0;
    }

    @Override
    public Boolean update(Book book) {
        return bookDao.update(book) > 0;

    }

    @Override
    public Boolean delete(Integer id) {
        return bookDao.delete(id) > 0;
    }

    @Override
    public Book getById(Integer id) {
        if (id == 1) {
            throw new BusinessException(Code.BUSINESS_ERR, "业务异常!");
        }
//        try {
//            int i = 1 / 0;
//        } catch (Exception e) {
//            throw new SystemException(Code.SYSTEM_TIMEOUT_ERR, "数据库访问超时，请重试！", e);
//        }
        return bookDao.getById(id);
    }

    @Override
    public List<Book> getAll() {
        return bookDao.getAll();
    }
}
