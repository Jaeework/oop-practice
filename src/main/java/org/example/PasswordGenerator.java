package org.example;

@FunctionalInterface    // method를 하나만 가진 인터페이스
public interface PasswordGenerator {
    String generatePassword();
}
