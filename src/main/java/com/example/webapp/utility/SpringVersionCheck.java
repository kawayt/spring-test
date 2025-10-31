package com.example.webapp.utility;

import org.springframework.boot.SpringBootVersion;
import org.springframework.core.SpringVersion;
import org.springframework.security.core.SpringSecurityCoreVersion;

import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

public class SpringVersionCheck {
    public static void main(String[] args) {
        System.setOut(
                new PrintStream(new FileOutputStream(FileDescriptor.out), true, StandardCharsets.UTF_8));

        // Spring Frameworkのバージョン
        String springVersion = SpringVersion.getVersion();
        System.out.println("Spring Framework のバージョン: " + springVersion);
        // Spring Boot のバージョン
        String bootVersion = SpringBootVersion.getVersion();
        System.out.println("Spring Boot のバージョン: " + bootVersion);
        // Spring Security のバージョン
        String securityVersion = SpringSecurityCoreVersion.getVersion();
        System.out.println("Spring Security のバージョン: " + securityVersion);
    }
}