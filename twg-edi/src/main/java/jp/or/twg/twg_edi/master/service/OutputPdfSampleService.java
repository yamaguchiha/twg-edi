package jp.or.twg.twg_edi.master.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.mybatis.dynamic.sql.SqlBuilder;
import org.mybatis.dynamic.sql.render.RenderingStrategies;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import jp.or.twg.twg_edi.common.difinition.SqlStatement;
import jp.or.twg.twg_edi.common.entity.OptionFileIoData;
import jp.or.twg.twg_edi.common.entity.OptionFileIoHistory;
import jp.or.twg.twg_edi.common.mapper.OptionFileIoDataMapper;
import jp.or.twg.twg_edi.common.mapper.OptionFileIoHistoryDynamicSqlSupport;
import jp.or.twg.twg_edi.common.mapper.OptionFileIoHistoryMapper;
import jp.or.twg.twg_edi.common.service.HelperService;
import jp.or.twg.twg_edi.common.servlet.SimpleDownloadHelper;
import lombok.RequiredArgsConstructor;


/**
 * PDF発行サンプル　サービスクラス
 *
 * @author yamaguchiha
 *
 */
@RequiredArgsConstructor
@Service
@Transactional(readOnly = false, propagation = Propagation.REQUIRED)
public class OutputPdfSampleService {

	private final OptionFileIoHistoryMapper optionFileIoHistoryMapper;
	private final OptionFileIoDataMapper optionFileIoDataMapper;

	private final HelperService helperService;

	/**
	 * ファイル入出力履歴リスト取得
	 *
	 * @param placeOid 場所OID
	 * @param fileIoType ファイル入出力種別ID
	 * @param acquired true：取得済、false：未取得
	 * @return
	 */
	public List<OptionFileIoHistory> getFileIoHistoryListByFileIoType(Long placeOid, String fileIoType, String acquired) {
		List<OptionFileIoHistory> list = new ArrayList<OptionFileIoHistory>();

		SelectStatementProvider statement = SqlBuilder.select(OptionFileIoHistoryMapper.selectList)
				.from(OptionFileIoHistoryDynamicSqlSupport.optionFileIoHistory)
				.where(OptionFileIoHistoryDynamicSqlSupport.fileIoTypeId, SqlBuilder.isEqualTo(fileIoType))
				.and(OptionFileIoHistoryDynamicSqlSupport.placeOid, SqlBuilder.isEqualTo(placeOid))
				.and(OptionFileIoHistoryDynamicSqlSupport.deleteFlag, SqlBuilder.isEqualTo(SqlStatement.VALUE_N))
				.and(OptionFileIoHistoryDynamicSqlSupport.acquired, SqlBuilder.isEqualTo(acquired))
				.orderBy(SqlBuilder.sortColumn(OptionFileIoHistoryDynamicSqlSupport.tsLastModifiedDate.name()).descending())	// DESC
				.build()
				.render(RenderingStrategies.MYBATIS3);

		list = optionFileIoHistoryMapper.selectMany(statement);

		return list;
	}

	public SimpleDownloadHelper downloadUnissuedData(Long id) {
		OptionFileIoHistory history = null;
		OptionFileIoData fileIoData = null;

		// 排他確認
//		if (chkLocked()) {
//			return null;
//		}

		// ファイル入出力履歴取得
		Optional<OptionFileIoHistory> objHistroy = optionFileIoHistoryMapper.selectByPrimaryKey(id);
		if(!objHistroy.isEmpty()) {
			history = objHistroy.get();
		} else {
			// ファイル入出力履歴が存在しなかった場合はエラー

			return null;
		}

		// スレッド管理取得
//		OptionThreadManager threadManager = history.loadThreadManager();
//		if (threadManager == null) {
//			// スレッド管理が存在しなかった場合はエラー
//
//			return null;
//		}

		// スレッド状態チェック
//		if (!ThreadStatus.SUCCESSFUL.name().equals(threadManager.getThreadStatus())) {
//			// 正常終了ではない場合はエラー
//
//			return null;
//		}

		// ファイル入出力データ取得
		Optional<OptionFileIoData> objData = optionFileIoDataMapper.selectByPrimaryKey(history.getFileIoDataOid());
		if(!objData.isEmpty()) {
			fileIoData = objData.get();
		} else {
			// ファイル入出力データが存在しなかった場合はエラー

			return null;
		}

		// ダウンロードヘルパー取得
		SimpleDownloadHelper helper = helperService.getSimpleDownloadHelper(history, fileIoData);

		// ダウンロードが完了した場合の処理
		if (helper != null) {

			// かんばん枝番情報を生成する

			// ファイル入出力履歴（取得済みへ更新する）

		}

		return helper;
	}
}
