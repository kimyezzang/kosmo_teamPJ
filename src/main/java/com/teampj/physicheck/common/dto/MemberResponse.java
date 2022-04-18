package com.teampj.physicheck.common.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data // lombok(getter, setter, toString, @NotNull 지정된 변수만 생성자 자동 생성)
public class MemberResponse {

    private int memberNo;

    private String id;

    private String name;

    //private String email;

    private String authority;

    private String examination;

}