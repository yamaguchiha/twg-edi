package jp.or.twg.twg_edi.common;

/**
 * TWG Exception
 *
 * @author yamaguchiha
 *
 */
public class TwgException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	/**
	 * コンストラクタ
	 */
	public TwgException() {
		super();
	}

	/**
	 * コンストラクタ
	 *
	 * @param message メッセージ
	 */
	public TwgException(String message) {
		super(message);
	}

	/**
	 * コンストラクタ
	 *
	 * @param message メッセージ
	 * @param cause 例外
	 */
	public TwgException(String message, Throwable cause) {
		super(message, cause);
	}

	/**
	 * コンストラクタ
	 *
	 * @param cause 例外
	 */
	public TwgException(Throwable cause) {
		super(cause);
	}

}
