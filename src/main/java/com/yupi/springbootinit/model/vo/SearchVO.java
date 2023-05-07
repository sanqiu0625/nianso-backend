package com.yupi.springbootinit.model.vo;

import com.yupi.springbootinit.model.entity.Picture;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * 聚合搜索（脱敏）
 */
@Data
public class SearchVO implements Serializable {

    private List<PostVO> postList;
    private List<UserVO> userList;
    private List<Picture> picrureList;
    private List<?> dataList;
    private static final long serialVersionUID = 1L;
}