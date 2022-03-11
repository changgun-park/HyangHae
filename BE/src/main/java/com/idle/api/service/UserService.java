/**
*
* UserService
* 회원가입, 아이디 중복 검사, 닉네임 중복 검사, 비밀번호 암호화 함수 생성
*
* @author Alice
* @version 1.0.0
* 생성일 2022-03-08
* 마지막 수정일 2022-03-10
**/
package com.idle.api.service;

import com.idle.api.request.UserLoginRequest;
import com.idle.api.request.UserSignUpRequest;


public interface UserService {
    String insertUser(UserSignUpRequest userSignUpRequest);
    String checkDuplicateUserId(String userId);
    String checkDuplicateUserNickname(String userNickname);
    String login(UserLoginRequest userLoginRequest);
    String passwordEncode(String userPw);
}
