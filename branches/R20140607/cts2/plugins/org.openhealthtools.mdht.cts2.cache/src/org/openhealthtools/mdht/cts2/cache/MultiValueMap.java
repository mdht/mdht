package org.openhealthtools.mdht.cts2.cache;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MultiValueMap<K, V> {

	private Map<K, List<V>> uriMap = new HashMap<K, List<V>>();

	public V put(K uri, V object) {
		List<V> objects = uriMap.get(uri);
		if (objects == null) {
			objects = new ArrayList<V>();
			uriMap.put(uri, objects);
		}

		if (!objects.contains(object)) {
			objects.add(object);
		}

		return object;
	}

	public List<V> get(K key) {
		List<V> objects = uriMap.get(key);
		if (objects == null) {
			objects = new ArrayList<V>();
		}

		return objects;
	}

}
