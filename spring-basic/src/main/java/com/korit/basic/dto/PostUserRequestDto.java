package com.korit.basic.dto;

import org.hibernate.validator.constraints.Length;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PostUserRequestDto {
    @NotBlank
    @Length(max=20)
    private String userId;
    @NotBlank
    @Length(min=8)
    private String userPassword;
    @NotBlank
    @Length(max=4)
    private String userName;
    @NotBlank
    private String userAdderss;
    @NotBlank
    private String userTelNumber;
}

/* CRUD

CREATE: 
사용자로부터 아이디, 비밀번호, 이름, 주소, 전화번호를 입력받음
아이디는 필수, 길이 20자 이하 영문 대소문자숫자 
비밀번호는 필수, 길이가 8자 이상 대문자+소문자+숫자+특수문자+조합 
이름은 필수 4자 이하 
주소는 필수 
전화번호 필수 , 010-????-????에 해당하는 패턴 

성공 
{
	"code": "SU"
	"message" : "Sueccess"
}

실패
1. 유효성 검사 실패 (Validation Failed)
{
    "code": "VF",
    "message": "Validation Failed"
}

2. 아이디 관련 실패 (Invalid ID)
- 아이디 중복 (Duplicate ID)
{
    "code": "ID_DUP",
    "message": "ID already exists"
}
- 아이디 길이 초과 (ID Length Exceeded)
{
    "code": "ID_LEN",
    "message": "ID must be at most 20 characters"
}
- 아이디 형식 오류 (Invalid ID Format)
{
    "code": "ID_FMT",
    "message": "ID must contain only letters and numbers"
}

3. 비밀번호 관련 실패 (Invalid Password)
- 비밀번호 길이 부족 (Password Too Short)
{
    "code": "PW_LEN",
    "message": "Password must be at least 8 characters long"
}
- 비밀번호 조합 오류 (Password Requirements Not Met)
{
    "code": "PW_WEAK",
    "message": "Password must include uppercase, lowercase, number, and special character"
}
- 취약한 비밀번호 (Weak Password)
{
    "code": "PW_WEAK",
    "message": "Password is too weak"
}

4. 이름 관련 실패 (Invalid Name)
- 이름 길이 초과 (Name Length Exceeded)
{
    "code": "NAME_LEN",
    "message": "Name must be at most 4 characters"
}
- 이름에 숫자/특수문자 포함 (Invalid Name Format)
{
    "code": "NAME_FMT",
    "message": "Name must contain only Korean characters"
}

5. 주소 관련 실패 (Invalid Address)
- 주소 입력 누락 (Address Required)
{
    "code": "ADDR_MISS",
    "message": "Address is required"
}

6. 전화번호 관련 실패 (Invalid Phone Number)
- 전화번호 형식 오류 (Invalid Phone Format)
{
    "code": "PHONE_FMT",
    "message": "Phone number format must be 010-XXXX-XXXX"
}
- 유효하지 않은 번호 (Invalid Phone Number)
{
    "code": "PHONE_INV",
    "message": "Phone number must start with 010"
}

7. 시스템 오류 (System Error)
{
    "code": "SYS_ERR",
    "message": "Internal server error"
}
*/
