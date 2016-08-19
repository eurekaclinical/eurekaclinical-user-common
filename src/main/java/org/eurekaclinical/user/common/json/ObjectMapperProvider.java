/*-
 * #%L
 * Eureka! Clinical User Common
 * %%
 * Copyright (C) 2016 Emory University
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */
package org.eurekaclinical.user.common.json;

import javax.ws.rs.ext.ContextResolver;
import javax.ws.rs.ext.Provider;

import org.codehaus.jackson.Version;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.module.SimpleModule;

/**
 * Provides custom JSON serialization/deserialization from user objects.
 *
 * @author miaoai
 */
@Provider
public class ObjectMapperProvider implements ContextResolver<ObjectMapper> {

	private ObjectMapper mapper;

	public ObjectMapperProvider() {
		this.mapper = new ObjectMapper();
		SimpleModule module = new SimpleModule(getClass().getName(),
		        new Version(1, 0, 0, "user")) {
			@Override
			public void setupModule(SetupContext context) {
				super.setupModule(context);
			}
		};

		this.mapper.registerModule(module);
	}

	@Override
	public ObjectMapper getContext(Class<?> type) {
		return this.mapper;
	}

}
