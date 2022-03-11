/*
유저 관련 api
@author Wendy
@version 1.0.0
생성일 2022-03-10
마지막 수정일 2022-03-10
*/
import axios from "axios";
import { BASE_URL } from "./utils";

export const apiSignup = (
  userEmail: string,
  userId: string,
  userNickname: string,
  password: string
) =>
  axios({
    method: "post",
    url: `${BASE_URL}/user/signup`,
    data: {
      userEmail,
      userId,
      userNickname,
      userPw: password,
    },
  });

export const apiCheckNickname = (userNickname: string) =>
  axios({
    method: "get",
    url: `${BASE_URL}/user/checkunickname/${userNickname}`,
  });

export const apiCheckId = (userId: string) =>
  axios({
    method: "get",
    url: `${BASE_URL}/user/checkuid/${userId}`,
  });