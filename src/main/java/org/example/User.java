package org.example;

public class User {
    private String password;

    public void initPassword(PasswordGenerator passwordGenerator) {
        // 패스워드를 초기화 해주는 메소드

        // as-is => 강한 결합도
        //RandomPasswordGenerator rdPW = new RandomPasswordGenerator();
        //rdPW.generatePassword();

        // to-be => 낮은 결합도
        String password = passwordGenerator.generatePassword();

        // 비민번호는 최소 8자 이상 12자 이상이어야 한다.
        if(password.length() >= 8 && password.length() <= 12) {
            this.password = password;
        }
    }

    public String getPassword() {
        return this.password;
    }
}
