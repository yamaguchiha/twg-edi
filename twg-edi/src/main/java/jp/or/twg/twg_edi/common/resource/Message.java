package jp.or.twg.twg_edi.common.resource;

import java.io.Serializable;
import java.text.MessageFormat;

/**
 * メッセージクラス
 */
public class Message  implements Serializable{
	private static final long serialVersionUID = 1L;
	public final String 	key;
	public final String[]	values;

	/**
	 * 置換なしメッセージ
	 *
	 * @param key
	 */
	public Message(String key) {
		this.key = key;
		this.values = new String[0];
	}

	/**
	 * 置換ありメッセージ
	 *
	 * @param key
	 * @param values
	 */
	public Message(String key, String... values) {
		this.key = key;
		if(values == null) {
			this.values = new String[0];
		} else {
			this.values = new String[values.length];
			for(int i = 0 ; i < this.values.length ; i++) {
				this.values[i] = values[i];
			}
		}
	}

	public String getKey() {
		return key;
	}

    public String toString() {
        return MessageFormat.format(
                ResourceManager.getResource().getString(key), (Object[])values);
    }
}
