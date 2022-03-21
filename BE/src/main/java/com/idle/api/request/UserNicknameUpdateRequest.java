/**
 *
 * UserNicknameUpdateRequset
 * 닉네임 수정 Request
 *
 * @author David
 * @version 1.0.0
 * 생성일 2022-03-21
 * 마지막 수정일 2022-03-21
 **/
package com.idle.api.request;

import com.sun.istack.NotNull;
import io.swagger.annotations.ApiModel;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@ApiModel("UserNicknameUpdateRequset")
public class UserNicknameUpdateRequest {
    @NotNull
    String userNickname;
}
