
package com.tuyano.springboot;

import java.io.Serializable;
import java.util.List;

/**
 * リスト6-1
 */
public interface MyDataDao_List6_01<T> extends Serializable {

	public List<T> getAll();

}
