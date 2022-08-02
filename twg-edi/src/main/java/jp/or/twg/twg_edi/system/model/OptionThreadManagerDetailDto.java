package jp.or.twg.twg_edi.system.model;

import lombok.Getter;
import lombok.Setter;

/**
 * 処理一覧詳細情報 Dto
 *
 * @author kawadet
 *
 */
@Setter
@Getter
public class OptionThreadManagerDetailDto {

    // スレッド管理
    private String id;
    private String threadStatus;
    private String threadCategory;

    // 処理担当者
    private long usersOid;
    private String usersOidName;

    //事業所工区
    private long userPlaceOid;
    private String userPlaceCode;
    private String userPlaceName;

    private String startUpTime;
    private String closeOutTime;

    // 所要時間（秒）
    private int intervalTime;

    private String errorMessage;

}
