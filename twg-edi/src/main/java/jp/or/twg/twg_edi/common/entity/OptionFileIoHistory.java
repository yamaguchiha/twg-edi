package jp.or.twg.twg_edi.common.entity;

import java.util.Date;

import javax.annotation.Generated;

import jp.or.twg.twg_edi.common.difinition.OptionFileIoType;

public class OptionFileIoHistory {

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5092743+09:00", comments = "Source field: public.option_file_io_history.oid")
	private Long oid;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5092743+09:00", comments = "Source field: public.option_file_io_history.file_io_type_id")
	private String fileIoTypeId;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5092743+09:00", comments = "Source field: public.option_file_io_history.place_oid")
	private Long placeOid;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5102719+09:00", comments = "Source field: public.option_file_io_history.file_io_data_oid")
	private Long fileIoDataOid;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5102719+09:00", comments = "Source field: public.option_file_io_history.thread_manager_id")
	private String threadManagerId;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5102719+09:00", comments = "Source field: public.option_file_io_history.acquired")
	private String acquired;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5102719+09:00", comments = "Source field: public.option_file_io_history.create_data_oid")
	private String createDataOid;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5102719+09:00", comments = "Source field: public.option_file_io_history.data_size")
	private Integer dataSize;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5102719+09:00", comments = "Source field: public.option_file_io_history.delete_flag")
	private String deleteFlag;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5102719+09:00", comments = "Source field: public.option_file_io_history.ts_registerer_date")
	private Date tsRegistererDate;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5102719+09:00", comments = "Source field: public.option_file_io_history.ts_registerer_user_id")
	private Long tsRegistererUserId;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5102719+09:00", comments = "Source field: public.option_file_io_history.ts_registerer_user_place_id")
	private Long tsRegistererUserPlaceId;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5102719+09:00", comments = "Source field: public.option_file_io_history.ts_last_modified_date")
	private Date tsLastModifiedDate;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5102719+09:00", comments = "Source field: public.option_file_io_history.ts_last_modified_user_id")
	private Long tsLastModifiedUserId;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5102719+09:00", comments = "Source field: public.option_file_io_history.ts_last_modified_user_place_id")
	private Long tsLastModifiedUserPlaceId;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5092743+09:00", comments = "Source field: public.option_file_io_history.oid")
	public Long getOid() {
		return oid;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5092743+09:00", comments = "Source field: public.option_file_io_history.oid")
	public void setOid(Long oid) {
		this.oid = oid;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5092743+09:00", comments = "Source field: public.option_file_io_history.file_io_type_id")
	public String getFileIoTypeId() {
		return fileIoTypeId;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5092743+09:00", comments = "Source field: public.option_file_io_history.file_io_type_id")
	public void setFileIoTypeId(String fileIoTypeId) {
		this.fileIoTypeId = fileIoTypeId;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5102719+09:00", comments = "Source field: public.option_file_io_history.place_oid")
	public Long getPlaceOid() {
		return placeOid;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5102719+09:00", comments = "Source field: public.option_file_io_history.place_oid")
	public void setPlaceOid(Long placeOid) {
		this.placeOid = placeOid;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5102719+09:00", comments = "Source field: public.option_file_io_history.file_io_data_oid")
	public Long getFileIoDataOid() {
		return fileIoDataOid;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5102719+09:00", comments = "Source field: public.option_file_io_history.file_io_data_oid")
	public void setFileIoDataOid(Long fileIoDataOid) {
		this.fileIoDataOid = fileIoDataOid;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5102719+09:00", comments = "Source field: public.option_file_io_history.thread_manager_id")
	public String getThreadManagerId() {
		return threadManagerId;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5102719+09:00", comments = "Source field: public.option_file_io_history.thread_manager_id")
	public void setThreadManagerId(String threadManagerId) {
		this.threadManagerId = threadManagerId;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5102719+09:00", comments = "Source field: public.option_file_io_history.acquired")
	public String getAcquired() {
		return acquired;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5102719+09:00", comments = "Source field: public.option_file_io_history.acquired")
	public void setAcquired(String acquired) {
		this.acquired = acquired;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5102719+09:00", comments = "Source field: public.option_file_io_history.create_data_oid")
	public String getCreateDataOid() {
		return createDataOid;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5102719+09:00", comments = "Source field: public.option_file_io_history.create_data_oid")
	public void setCreateDataOid(String createDataOid) {
		this.createDataOid = createDataOid;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5102719+09:00", comments = "Source field: public.option_file_io_history.data_size")
	public Integer getDataSize() {
		return dataSize;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5102719+09:00", comments = "Source field: public.option_file_io_history.data_size")
	public void setDataSize(Integer dataSize) {
		this.dataSize = dataSize;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5102719+09:00", comments = "Source field: public.option_file_io_history.delete_flag")
	public String getDeleteFlag() {
		return deleteFlag;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5102719+09:00", comments = "Source field: public.option_file_io_history.delete_flag")
	public void setDeleteFlag(String deleteFlag) {
		this.deleteFlag = deleteFlag;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5102719+09:00", comments = "Source field: public.option_file_io_history.ts_registerer_date")
	public Date getTsRegistererDate() {
		return tsRegistererDate;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5102719+09:00", comments = "Source field: public.option_file_io_history.ts_registerer_date")
	public void setTsRegistererDate(Date tsRegistererDate) {
		this.tsRegistererDate = tsRegistererDate;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5102719+09:00", comments = "Source field: public.option_file_io_history.ts_registerer_user_id")
	public Long getTsRegistererUserId() {
		return tsRegistererUserId;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5102719+09:00", comments = "Source field: public.option_file_io_history.ts_registerer_user_id")
	public void setTsRegistererUserId(Long tsRegistererUserId) {
		this.tsRegistererUserId = tsRegistererUserId;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5102719+09:00", comments = "Source field: public.option_file_io_history.ts_registerer_user_place_id")
	public Long getTsRegistererUserPlaceId() {
		return tsRegistererUserPlaceId;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5102719+09:00", comments = "Source field: public.option_file_io_history.ts_registerer_user_place_id")
	public void setTsRegistererUserPlaceId(Long tsRegistererUserPlaceId) {
		this.tsRegistererUserPlaceId = tsRegistererUserPlaceId;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5102719+09:00", comments = "Source field: public.option_file_io_history.ts_last_modified_date")
	public Date getTsLastModifiedDate() {
		return tsLastModifiedDate;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5102719+09:00", comments = "Source field: public.option_file_io_history.ts_last_modified_date")
	public void setTsLastModifiedDate(Date tsLastModifiedDate) {
		this.tsLastModifiedDate = tsLastModifiedDate;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5102719+09:00", comments = "Source field: public.option_file_io_history.ts_last_modified_user_id")
	public Long getTsLastModifiedUserId() {
		return tsLastModifiedUserId;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5102719+09:00", comments = "Source field: public.option_file_io_history.ts_last_modified_user_id")
	public void setTsLastModifiedUserId(Long tsLastModifiedUserId) {
		this.tsLastModifiedUserId = tsLastModifiedUserId;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5102719+09:00", comments = "Source field: public.option_file_io_history.ts_last_modified_user_place_id")
	public Long getTsLastModifiedUserPlaceId() {
		return tsLastModifiedUserPlaceId;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-06-21T19:20:40.5102719+09:00", comments = "Source field: public.option_file_io_history.ts_last_modified_user_place_id")
	public void setTsLastModifiedUserPlaceId(Long tsLastModifiedUserPlaceId) {
		this.tsLastModifiedUserPlaceId = tsLastModifiedUserPlaceId;
	}

    /**
     * ファイル入出力種別取得
     *
     * @return ファイル入出力種別
     */
    public OptionFileIoType getFileIoType() {
    	return OptionFileIoType.getType(getFileIoTypeId());
    }

}