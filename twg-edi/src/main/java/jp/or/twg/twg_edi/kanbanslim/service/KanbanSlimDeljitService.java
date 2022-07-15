package jp.or.twg.twg_edi.kanbanslim.service;

import java.util.ArrayList;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import jp.or.twg.twg_edi.kanbanslim.model.KanbanSlimDeljitBean;
import lombok.RequiredArgsConstructor;

/**
 *
 * @author yamaguchiha
 *
 */
@RequiredArgsConstructor
@Service
@Transactional(readOnly = false, propagation = Propagation.REQUIRED)
public class KanbanSlimDeljitService {

	public Page<KanbanSlimDeljitBean> getListByShipToReciveCode(Pageable pageable, String shipToReciveCode) {



		return new PageImpl<>(new ArrayList<KanbanSlimDeljitBean>(), pageable, 0);
	}
}
