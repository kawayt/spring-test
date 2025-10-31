package com.example.webapp.repository;

import com.example.webapp.entity.ToDo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * ToDo：リポジトリ
 */
@Mapper
public interface ToDoMapper {
    /**
     * 全ての「すること」を取得します。
     */
    List<ToDo> selectAll();

    /**
     * 指定されたIDに対応する「すること」を取得します。
     */
    ToDo selectById(@Param("id") Integer id);

    /**
     * 「すること」を登録します。
     */
    void insert(ToDo toDo);

    /**
     * 「すること」を更新します。
     */
    void update(ToDo toDo);

    /**
     * 指定されたIDの「すること」を削除します。
     */
    void delete(@Param("id") Integer id);
}
