package jp.or.twg.springmybatis.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import jp.or.twg.springmybatis.mapper.TeacherMapper;
import jp.or.twg.springmybatis.model.Teacher;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Transactional
@Service
public class TeacherService {

	private final TeacherMapper mapper;

	public List<Teacher> selectAll() {
		return mapper.selectAll();
	}

	public Teacher selectByPrimaryKey(Long id) {
		return mapper.selectByPrimaryKey(id);
	}

	public void save(Teacher teacher) {
		if(teacher.getId() == null) {
			mapper.insert(teacher);
		} else {
			mapper.updateByPrimaryKey(teacher);
		}
	}

	public void deleteByPrimaryKey(Long id) {
		mapper.deleteByPrimaryKey(id);
	}
}
