package jp.or.twg.springmybatis.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import jp.or.twg.springmybatis.model.Teacher;

@Mapper
public interface TeacherMapper {

	List<Teacher> selectAll();

	Teacher selectByPrimaryKey(Long id);

	int insert(Teacher record);

	int updateByPrimaryKey(Teacher recored);

	int deleteByPrimaryKey(Long id);
}
