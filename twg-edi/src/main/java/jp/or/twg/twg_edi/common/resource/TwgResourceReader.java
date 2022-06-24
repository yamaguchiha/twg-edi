package jp.or.twg.twg_edi.common.resource;

/**
 * TWG共通リソースリーダー
 *
 * @author Yamaguchiha
 * @version 1.0
 */
public class TwgResourceReader extends ResourceReader {
	private static final long serialVersionUID = 1L;

	@Override
	protected String getResourceName() {
		return "twgResource";
	}

}
