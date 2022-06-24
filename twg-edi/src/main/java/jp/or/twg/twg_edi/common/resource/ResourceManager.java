package jp.or.twg.twg_edi.common.resource;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.MissingResourceException;
import java.util.ResourceBundle;
import java.util.Set;
import java.util.StringTokenizer;

/**
 * @author Yamaguchiha
 * @version 1.0
 */
public class ResourceManager {
    private static Map<Locale, ResourceBundle> bundleMap = new HashMap<Locale, ResourceBundle>();

    public static ResourceBundle getResource(Locale locale) {
        ResourceBundle rb = bundleMap.get(locale);
        if(rb == null) {
            String name = "messageResource,twgResource";
            rb = new MultiResourceBundle(name, locale);
            bundleMap.put(locale, rb);
        }
        return rb;
    }

    public static ResourceBundle getResource() {
        return getResource(Locale.JAPANESE);
    }

    protected static class MultiResourceBundle extends ResourceBundle {
        private List<ResourceBundle> list;
        MultiResourceBundle(String name, Locale locale) {
            list = new ArrayList<ResourceBundle>();
            StringTokenizer tokenizer = new StringTokenizer(name, ", \n");
            while(tokenizer.hasMoreTokens()) {
                list.add(ResourceBundle.getBundle(tokenizer.nextToken(), locale));
            }
        }

        @Override
        public Enumeration<String> getKeys() {
            Set<String> set = new HashSet<String>();
            for(ResourceBundle rb : list) {
                Enumeration<String> en = rb.getKeys();
                while(en.hasMoreElements()) {
                    set.add(en.nextElement());
                }
            }
            return Collections.enumeration(set);
        }

        @Override
        protected Object handleGetObject(String key) {
            for(ResourceBundle rb : list) {
                try {
                    Object o = rb.getObject(key);
                    return o;
                } catch(MissingResourceException e) {
                    //ignore...
                }
            }
            return null;
        }

    }
}
