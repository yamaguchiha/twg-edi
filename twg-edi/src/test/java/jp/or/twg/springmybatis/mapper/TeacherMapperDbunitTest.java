package jp.or.twg.springmybatis.mapper;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.github.springtestdbunit.annotation.DatabaseSetup;

import jp.or.twg.base.AbstractDbunitTest;
import jp.or.twg.springmybatis.model.Teacher;

/**
 * MapperクラスのJUnitテスト
 *
 * @author yamaguchiha
 *
 */
@DatabaseSetup("classpath:META-INF/dbunit/teacher.xlsx")
public class TeacherMapperDbunitTest extends AbstractDbunitTest {

	@Autowired
	TeacherMapper teacherMapper;

	@Test
    public void testSelectByPrimaryKey() {
    	Teacher teacher = teacherMapper.selectByPrimaryKey(12L);

    	assertEquals("値が異なります", (Long)12L, teacher.getId());
    }

	@Test
	public void testInsert() {
		Teacher teacher = new Teacher();
		teacher.setUserName("テストユーザ");
		teacher.setEmail("test@twg.or.jp");

		int result = teacherMapper.insert(teacher);

    	assertEquals("INSET戻り値が異なります", 1, result);

    	List<Teacher> list = teacherMapper.selectAll();
    	Teacher rsltTeacher = list.get(list.size() - 1);
    	assertEquals("UserNameが異なります", teacher.getUserName(), rsltTeacher.getUserName());
    	assertEquals("Emailが異なります", teacher.getEmail(), rsltTeacher.getEmail());

	}

	@Test
	public void testUpdate() {
		final String newUserName = "新しい名前";
		final String newEmail = "new@twg.or.jp";

    	List<Teacher> list = teacherMapper.selectAll();
    	Teacher updTeacher = list.get(2);
    	Long updId = updTeacher.getId();
    	updTeacher.setUserName(newUserName);
    	updTeacher.setEmail(newEmail);

    	int result = teacherMapper.updateByPrimaryKey(updTeacher);

       	assertEquals("UPDATE戻り値が異なります", 1, result);

       	Teacher rsltTeacher = teacherMapper.selectByPrimaryKey(updId);

    	assertEquals("UserNameが異なります", newUserName, rsltTeacher.getUserName());
    	assertEquals("Emailが異なります", newEmail, rsltTeacher.getEmail());
	}

	@Test
	public void testDeleteByPrimaryKey() {
    	List<Teacher> list = teacherMapper.selectAll();
    	Teacher delTeacher = list.get(3);
    	Long delId = delTeacher.getId();

    	int result = teacherMapper.deleteByPrimaryKey(delId);

       	assertEquals("DELETE戻り値が異なります", 1, result);

       	Teacher rsltTeacher = teacherMapper.selectByPrimaryKey(delId);
       	assertNull("指定のデータが削除されていない", rsltTeacher);
	}
}
