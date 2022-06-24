package jp.or.twg.twg_edi.common.service;

import java.util.Optional;

import org.springframework.dao.DuplicateKeyException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import jp.or.twg.twg_edi.common.entity.Numbering;
import jp.or.twg.twg_edi.common.mapper.NumberingMapper;
import lombok.RequiredArgsConstructor;

/**
 * ナンバリングサービス
 *   各テーブルのOIDを生成する
 *
 * @author yamaguchiha
 *
 */
@RequiredArgsConstructor
@Service
@Transactional(readOnly = false, propagation = Propagation.REQUIRES_NEW)
public class NumberingService {

	private final NumberingMapper mapper;

	/**
	 * ID（対象テーブルのclassパス）で新規OID取得（同期）
	 *
	 * @param id
	 * @return
	 */
	public synchronized long getOid(String id) {

		Optional<Numbering> resultOpt = mapper.selectByPrimaryKey(id);
		Numbering numbering = null;

		if(resultOpt.isEmpty()) {
			// 新規追加
			numbering = new Numbering();
			numbering.setId(id);
			numbering.setNextNumber(1L);
			numbering.getNextNumber().longValue();
			try {
				mapper.insert(numbering);
			} catch (DuplicateKeyException e) {
				// 重複の場合は再取得
				resultOpt = mapper.selectByPrimaryKey(id);

				// カウントアップ更新
				numbering = resultOpt.get();
				numbering.setNextNumber(countupUpdate(resultOpt.get()));
				mapper.updateByPrimaryKey(numbering);
			}

		} else {
			// カウントアップ更新
			numbering = resultOpt.get();
			numbering.setNextNumber(countupUpdate(resultOpt.get()));
			mapper.updateByPrimaryKey(numbering);
		}

		return numbering.getNextNumber().longValue();

	}

	private long countupUpdate(Numbering oldNumbering) {
		Numbering newNumbering = new Numbering();

		newNumbering.setId(oldNumbering.getId());
		long currentNumber = oldNumbering.getNextNumber().longValue();
        if(currentNumber == Long.MAX_VALUE) {
        	currentNumber = 1;
        } else {
        	currentNumber++;
        }
		return currentNumber;
	}

}
