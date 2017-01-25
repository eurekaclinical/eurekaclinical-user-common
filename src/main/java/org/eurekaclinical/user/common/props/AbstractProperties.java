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
package org.eurekaclinical.user.common.props;

import org.eurekaclinical.standardapis.props.CasEurekaClinicalProperties;


/**
 *
 * @author miaoai
 */
public abstract class AbstractProperties extends CasEurekaClinicalProperties {

	/**
	 * Loads the application configuration.
	 *
	 * There are two potential sources of application configuration. The
	 * fallback configuration should always be there. The default configuration
	 * directory, <code>/etc/ec-user</code>, may optionally have an
	 * application.properties file within it that overrides the fallback
	 * configuration for each configuration property that is specified. The
	 * <code>eureka.config.dir</code> system property allows specifying an
	 * alternative configuration directory.
	 */
	public AbstractProperties() {
		super("/etc/ec-user");              
	}       
}
