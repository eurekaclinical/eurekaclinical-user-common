/*
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
package org.eurekaclinical.user.common.test;

import java.security.Principal;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;

import org.jasig.cas.client.authentication.AttributePrincipal;

/**
 *
 * @author miaoai
 */
public class UserRoleRequestWrapper extends HttpServletRequestWrapper {

    public UserRoleRequestWrapper(HttpServletRequest req) {
        super(req);
    }

    @Override
    public boolean isUserInRole(String role) {
        return true;
    }

    @Override
    public Principal getUserPrincipal() {
        return new AttributePrincipal() {
            private static final long serialVersionUID = 1L;
            
            @Override
            public String getName() {
                return "testuser";
            }

            @Override
            public String getProxyTicketFor(String string) {
                throw new UnsupportedOperationException("Not supported yet.");
            }

            @Override
            public Map<String, Object> getAttributes() {
                return new HashMap<>();
            }
        };
    }

}
