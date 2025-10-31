package com.example.webapp.repository;

import com.example.webapp.entity.Authentication;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AuthenticationMapper {

    /**
     * ユーザー名でログイン情報を取得します。
     */
    Authentication selectByUsername(String username);
}
