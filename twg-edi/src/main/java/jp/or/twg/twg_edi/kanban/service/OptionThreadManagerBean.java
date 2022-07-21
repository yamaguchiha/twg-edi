package jp.or.twg.twg_edi.kanban.service;

import jp.or.twg.twg_edi.common.entity.OptionThreadManager;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class OptionThreadManagerBean extends OptionBaseBean {

	//base
	/**
    * オプションスレッド管理
    **/
   private  OptionThreadManager   threadManager;

   //Orgin
   /** 削除有無（true：削除対象） */
   private boolean deleted = false;
}
