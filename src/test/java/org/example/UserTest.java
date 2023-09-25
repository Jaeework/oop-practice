package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class UserTest {

    @DisplayName("패스워드를 초기화 한다.")
    @Test
    void passwordTest() {
        // given
        User usr = new User();

        // when
        //usr.initPassword(new CorrectFixedPasswordGenerator());
        usr.initPassword(() -> "abcdefgh"); // FunctionalInterface이기 때문에 람다로 표현이 가능


        // then
        assertThat(usr.getPassword()).isNotNull();
    }

    @DisplayName("패스워드가 요구사항에 부합하지 않아 초기화가 되지 않는다.")
    @Test
    void passwordTest02() {
        // given
        User usr = new User();

        // when
        //usr.initPassword(new WrongFixedPasswordGenerator());
        usr.initPassword(() -> "ab");

        // then
        assertThat(usr.getPassword()).isNull();
    }

}