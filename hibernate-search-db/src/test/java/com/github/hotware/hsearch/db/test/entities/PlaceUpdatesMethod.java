/*
 * Copyright 2015 Martin Braun
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0

 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.github.hotware.hsearch.db.test.entities;

import com.github.hotware.hsearch.db.events.annotations.Case;
import com.github.hotware.hsearch.db.events.annotations.IdFor;
import com.github.hotware.hsearch.db.events.annotations.Updates;

/**
 * @author Martin
 */
@Updates(tableName = "PlaceUpdates", originalTableName = "Place_Sorcerer")
public class PlaceUpdatesMethod {

	private Integer id;

	private Integer placeId;

	private Integer sorcererId;

	private Integer eventCase;
	
	/**
	 * @return the placeId
	 */
	@IdFor(entityClass = Place.class, columns = "placeId", columnsInOriginal = "id")
	public Integer getPlaceId() {
		return placeId;
	}


	/**
	 * @return the sorcererId
	 */
	@IdFor(entityClass = Sorcerer.class, columns = "sorcererId", columnsInOriginal = "sorc_id")
	public Integer getSorcererId() {
		return sorcererId;
	}

	/**
	 * @param sorcererId
	 *            the sorcererId to set
	 */
	public void setSorcererId(Integer sorcererId) {
		this.sorcererId = sorcererId;
	}

	/**
	 * @return the eventCase
	 */
	// contains the case (which event occured)
	@Case
	public Integer getEventCase() {
		return eventCase;
	}

	/**
	 * @param eventCase
	 *            the eventCase to set
	 */
	public void setEventCase(Integer eventCase) {
		this.eventCase = eventCase;
	}

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	
	/**
	 * @param placeId
	 *            the placeId to set
	 */
	public void setPlaceId(Integer placeId) {
		this.placeId = placeId;
	}

}
