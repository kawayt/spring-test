package com.example.webapp.utility;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

/**
 * ハッシュ化した文字列を返すクラス
 */
public class PasswordGenerator {
    public static void main(String[] args) {
        // 「BCrypt」のインスタンス化
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        // 入力値
        String rawPassword = "userpass";
        // パスワードをハッシュ化
        String encodedPassword = encoder.encode(rawPassword);
        // 表示
        System.setOut(
                new PrintStream(new FileOutputStream(FileDescriptor.out), true, StandardCharsets.UTF_8));
        System.out.println("ハッシュ化されたパスワード: " + encodedPassword);
    }
}
