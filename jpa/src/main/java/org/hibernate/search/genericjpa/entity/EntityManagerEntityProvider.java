/*
 * Hibernate Search, full-text search for your domain model
 *
 * License: GNU Lesser General Public License (LGPL), version 2.1 or later
 * See the lgpl.txt file in the root directory or <http://www.gnu.org/licenses/lgpl-2.1.html>.
 */
package org.hibernate.search.genericjpa.entity;

import javax.persistence.EntityManager;
import java.util.List;

/**
 * Created by Martin on 06.07.2015.
 */
public interface EntityManagerEntityProvider {

	Object get(EntityManager em, Class<?> entityClass, Object id);

	List getBatch(EntityManager em, Class<?> entityClass, List<Object> id);

}
