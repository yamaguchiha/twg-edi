package jp.or.twg.twg_edi.common.resource;

/**
 * メッセージリソースリーダー
 *
 * @author Yamaguchiha
 * @version 1.0
 */
public class MessageResourceReader extends ResourceReader {
	private static final long serialVersionUID = 1L;

	@Override
	protected String getResourceName() {
		return "messageResource";
	}

}
