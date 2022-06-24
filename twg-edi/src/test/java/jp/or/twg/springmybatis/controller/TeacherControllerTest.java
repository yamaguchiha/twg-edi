package jp.or.twg.springmybatis.controller;

import static org.junit.Assert.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.ModelAndView;

import com.github.springtestdbunit.annotation.DatabaseSetup;

import jp.or.twg.base.AbstractDbunitTest;
import jp.or.twg.springmybatis.mapper.TeacherMapper;
import jp.or.twg.springmybatis.model.Teacher;

/**
 * ControllerクラスのJUnitテスト
 *
 * @author yamaguchiha
 *
 */
@DatabaseSetup("classpath:META-INF/dbunit/teacher.xlsx")
public class TeacherControllerTest extends AbstractDbunitTest {

	private MockMvc mockMvc;

	@Autowired
    private WebApplicationContext wac;

	@Autowired
	TeacherMapper teacherMapper;

	@Before
	public void Setup() {
		mockMvc = MockMvcBuilders.webAppContextSetup(wac).build();
	}

	@Test
	public void testTeacher_一覧画面() throws Exception {
		MvcResult mvcResult = mockMvc.perform(get("/teacher"))
				.andDo(print()) //コンソールにプリント
				.andExpect(status().isOk()) //statusコードの確認
				.andExpect(view().name("list")) //Viewが合っているか
				.andReturn(); //結果をmvcResultへ返却

		ModelAndView mav = mvcResult.getModelAndView();
		@SuppressWarnings("unchecked")
		List<Teacher> teacherList = ((List<Teacher>)mav.getModel().get("page"));

        int expectTeacherListSize = 5;
        assertEquals("一覧表示件数が異なります", expectTeacherListSize, teacherList.size()); //作成したデータと表示されているモデルのListサイズが合っているか
	}

	@Test
	public void testTeacher_追加画面() throws Exception {
		MvcResult mvcResult = mockMvc.perform(get("/teacher/add"))
				.andDo(print()) //コンソールにプリント
				.andExpect(status().isOk()) //statusコードの確認
				.andExpect(view().name("form")) //Viewが合っているか
				.andReturn(); //結果をmvcResultへ返却

		ModelAndView mav = mvcResult.getModelAndView();
		Teacher teacher = ((Teacher)mav.getModel().get("teacher"));

		assertNull("IDがNullでない", teacher.getId());
		assertNull("UserNameがNullでない", teacher.getUserName());
		assertNull("EmailがNullでない", teacher.getEmail());
	}

	@Test
	public void testTeacher_編集画面() throws Exception {
		MvcResult mvcResult = mockMvc.perform(get("/teacher/edit/3"))
				.andDo(print()) //コンソールにプリント
				.andExpect(status().isOk()) //statusコードの確認
				.andExpect(view().name("form")) //Viewが合っているか
				.andReturn(); //結果をmvcResultへ返却

		ModelAndView mav = mvcResult.getModelAndView();
		Teacher teacher = ((Teacher)mav.getModel().get("teacher"));

		assertEquals("IDが異なります", (Long)3L, teacher.getId());
		assertEquals("UserNameが異なります", "test1", teacher.getUserName());
		assertEquals("Emailが異なります", "test@test.com", teacher.getEmail());
	}

	@Test
	public void testTeacher_Process() throws Exception {
		final String editUserName = "テストで変更";
    	Teacher teacher = teacherMapper.selectByPrimaryKey(12L);
    	teacher.setUserName(editUserName);

    	// HTTPステータスはリクエストされたリソースが一時的に Location で示された
    	// URLへ移動したことを示す302が返される
    	@SuppressWarnings("unused")
		MvcResult mvcResult = mockMvc.perform(post("/teacher/process").flashAttr("teacher", teacher))
				.andDo(print()) //コンソールにプリント
				.andExpect(status().isFound()) //statusコードの確認
				.andExpect(view().name("redirect:/teacher")) //Viewが合っているか
				.andReturn(); //結果をmvcResultへ返却

    	// 変更されているか確認
    	Teacher afterTeacher = teacherMapper.selectByPrimaryKey(12L);
    	System.out.println("afterTeacher.getUserName()=[" + afterTeacher.getUserName() + "]");
    	assertEquals("UserNameが変更されていない", editUserName, afterTeacher.getUserName());
	}

	@Test
	public void testTeacher_削除処理() throws Exception {
    	// HTTPステータスはリクエストされたリソースが一時的に Location で示された
    	// URLへ移動したことを示す302が返される
		@SuppressWarnings("unused")
		MvcResult mvcResult = mockMvc.perform(get("/teacher/delete/3"))
				.andDo(print()) //コンソールにプリント
				.andExpect(status().isFound()) //statusコードの確認
				.andExpect(view().name("redirect:/teacher")) //Viewが合っているか
				.andReturn(); //結果をmvcResultへ返却

    	// 削除されているか確認
    	Teacher afterTeacher = teacherMapper.selectByPrimaryKey(3L);
		assertNull("指定のデータが削除されていない", afterTeacher);
	}
}
