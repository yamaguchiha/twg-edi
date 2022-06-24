package jp.or.twg.twg_edi.common.resource;

import java.io.Serializable;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import jp.or.twg.twg_edi.common.utility.CommonDataUtil;

/**
 * リソースファイル読み込み
 *
 * @author Yamaguchiha
 * @version 1.0
 */
abstract public class ResourceReader implements Serializable {
    private static final long serialVersionUID = 1L;

    /** Log4Jインスタンス */
    private final static Log log = LogFactory.getLog(ResourceReader.class);

    /**
     * リソースファイル名取得
     *
     * @return リソースファイル名
     */
    abstract protected String getResourceName();

    /**
     * リソース値取得（文字列型）
     *
     * @param key リソースキー
     * @return リソース値
     */
    public String getString(String key) {

    	String resourceName = getResourceName();
    	if(CommonDataUtil.isNullOrEmpty(resourceName)) {
    		throw new RuntimeException("リソースファイル名が設定されていません");
    	}

        // リソースキーが設定されていない場合はnull
        if (key == null || key.trim().length() == 0) {
            log.debug("リソースキーが設定されていません");
            return null;
        }

        try {
            // リソースファイル取得
            @SuppressWarnings("static-access")
			ResourceBundle rb = ResourceManager.getResource().getBundle(resourceName);
            return rb.getString(key.trim());
        } catch (MissingResourceException e) {
            // 該当するキーが見つからない場合はnull
            log.debug("リソースキー'" + key + "'に該当するリソース値はありませんでした");
            return null;
        }
    }


    /**
     * リソース値取得（Boolean型）
     *
     * @param key リソースキー
     * @return リソース値
     */
    public Boolean getBoolean(String key) {
        // リソース値取得（文字列型）実行
        String value = getString(key);
        if (value == null) {
            // 該当するキーが見つからない場合はnull
            return Boolean.FALSE;
        }

        // 文字列型からBoolean型に変換
        return Boolean.valueOf(value);
    }


    /**
     * リソース値取得（Byte型）
     *
     * @param key リソースキー
     * @return リソース値
     */
    public Byte getByte(String key) {
        // リソース値取得（文字列型）実行
        String value = getString(key);
        if (value == null) {
            // 該当するキーが見つからない場合はnull
            return null;
        }

        try {
            // 文字列型からByte型に変換
            return Byte.valueOf(value);
        } catch (NumberFormatException e) {
            // 変換できなかった場合はnull
            log.debug("リソースキー'" + key + "'の値'" + value + "'をByte型に変換できませんでした");
            return null;
        }
    }


    /**
     * リソース値取得（Double型）
     *
     * @param key リソースキー
     * @return リソース値
     */
    public Double getDouble(String key) {
        // リソース値取得（文字列型）実行
        String value = getString(key);
        if (value == null) {
            // 該当するキーが見つからない場合はnull
            return null;
        }

        try {
            // 文字列型からDouble型に変換
            return Double.valueOf(value);
        } catch (NumberFormatException e) {
            // 変換できなかった場合はnull
            log.debug("リソースキー'" + key + "'の値'" + value + "'をDouble型に変換できませんでした");
            return null;
        }
    }


    /**
     * リソース値取得（Float型）
     *
     * @param key リソースキー
     * @return リソース値
     */
    public Float getFloat(String key) {
        // リソース値取得（文字列型）実行
        String value = getString(key);
        if (value == null) {
            // 該当するキーが見つからない場合はnull
            return null;
        }

        try {
            // 文字列型からFloat型に変換
            return Float.valueOf(value);
        } catch (NumberFormatException e) {
            // 変換できなかった場合はnull
            log.debug("リソースキー'" + key + "'の値'" + value + "'をFloat型に変換できませんでした");
            return null;
        }
    }


    /**
     * リソース値取得（Integer型）
     *
     * @param key リソースキー
     * @return リソース値
     */
    public Integer getInteger(String key) {
        // リソース値取得（文字列型）実行
        String value = getString(key);
        if (value == null) {
            // 該当するキーが見つからない場合はnull
            return null;
        }

        try {
            // 文字列型からInteger型に変換
            return Integer.valueOf(value);
        } catch (NumberFormatException e) {
            // 変換できなかった場合はnull
            log.debug("リソースキー'" + key + "'の値'" + value + "'をInteger型に変換できませんでした");
            return null;
        }
    }


    /**
     * リソース値取得（Long型）
     *
     * @param key リソースキー
     * @return リソース値
     */
    public Long getLong(String key) {
        // リソース値取得（文字列型）実行
        String value = getString(key);
        if (value == null) {
            // 該当するキーが見つからない場合はnull
            return null;
        }

        try {
            // 文字列型からLong型に変換
            return Long.valueOf(value);
        } catch (NumberFormatException e) {
            // 変換できなかった場合はnull
            log.debug("リソースキー'" + key + "'の値'" + value + "'をLong型に変換できませんでした");
            return null;
        }
    }


    /**
     * リソース値取得（Short型）
     *
     * @param key リソースキー
     * @return リソース値
     */
    public Short getShort(String key) {
        // リソース値取得（文字列型）実行
        String value = getString(key);
        if (value == null) {
            // 該当するキーが見つからない場合はnull
            return null;
        }

        try {
            // 文字列型からShort型に変換
            return Short.valueOf(value);
        } catch (NumberFormatException e) {
            // 変換できなかった場合はnull
            log.debug("リソースキー'" + key + "'の値'" + value + "'をShort型に変換できませんでした");
            return null;
        }
    }

}
