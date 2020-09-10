package com.winter.blogclone.controller.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CommonRespDto<T> {
	private int statusCode; // 응답코드 1 정상, -1 실패, 0 변경안됨, select 제외 모든 쿼리 (규격화)
	private T data; // select시에 사용한다, 여기에 데이터를 넣어서 사용
}
