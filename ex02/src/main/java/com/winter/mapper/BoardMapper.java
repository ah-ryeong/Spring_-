package com.winter.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.winter.domain.BoardVO;

public interface BoardMapper {
	
//	@Select("SELECT * FROM tbl_board WHERE bno >0")
	public List<BoardVO> getList();
}
