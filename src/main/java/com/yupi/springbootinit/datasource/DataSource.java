package com.yupi.springbootinit.datasource;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.apache.poi.ss.formula.functions.T;

/**
 * 新接入数据源接口，必须实现
 */
public interface DataSource<T> {
    Page<T> doSearch(String searchText, long pageNum, long pageSize);
}
