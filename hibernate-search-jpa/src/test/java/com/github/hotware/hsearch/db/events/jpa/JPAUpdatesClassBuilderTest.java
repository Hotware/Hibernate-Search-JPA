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
package com.github.hotware.hsearch.db.events.jpa;

import java.io.IOException;

import org.junit.Test;

import com.github.hotware.hsearch.db.events.jpa.JPAUpdatesClassBuilder.IdColumn;
import com.github.hotware.hsearch.jpa.test.entities.Place;

/**
 * @author Martin
 *
 */
public class JPAUpdatesClassBuilderTest {

	@Test
	public void test() throws IOException {
		JPAUpdatesClassBuilder builder = new JPAUpdatesClassBuilder();
		builder.tableName("tableName")
				.originalTableName("originalTableName")
				.idColumn(
						IdColumn.of(Long.class, true, Place.class,
								new String[] { "placeId" },
								new String[] { "Place_ID" }))
				.build(System.out, "pack", "MyUpdateClass");
	}

}
