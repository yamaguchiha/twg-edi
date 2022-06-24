package jp.or.twg.twg_edi.common.entity;

import javax.annotation.Generated;

public class Numbering {

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4993018+09:00", comments = "Source field: public.numbering.id")
	private String id;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4993018+09:00", comments = "Source field: public.numbering.next_number")
	private Long nextNumber;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4993018+09:00", comments = "Source field: public.numbering.id")
	public String getId() {
		return id;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4993018+09:00", comments = "Source field: public.numbering.id")
	public void setId(String id) {
		this.id = id;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4993018+09:00", comments = "Source field: public.numbering.next_number")
	public Long getNextNumber() {
		return nextNumber;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.4993018+09:00", comments = "Source field: public.numbering.next_number")
	public void setNextNumber(Long nextNumber) {
		this.nextNumber = nextNumber;
	}
}