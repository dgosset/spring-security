/* Copyright 2004 Acegi Technology Pty Limited
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package net.sf.acegisecurity.providers;

import net.sf.acegisecurity.GrantedAuthority;


/**
 * An {@link net.sf.acegisecurity.Authentication} implementation that is
 * designed for use whilst unit testing.
 * 
 * <p>
 * The corresponding authentication provider is  {@link
 * TestingAuthenticationProvider}.
 * </p>
 *
 * @author Ben Alex
 * @version $Id$
 */
public class TestingAuthenticationToken extends AbstractAuthenticationToken {
    //~ Instance fields ========================================================

    private Object credentials;
    private Object principal;
    private GrantedAuthority[] authorities;
    private boolean authenticated = false;

    //~ Constructors ===========================================================

    public TestingAuthenticationToken(Object principal, Object credentials,
        GrantedAuthority[] authorities) {
        this.principal = principal;
        this.credentials = credentials;
        this.authorities = authorities;
    }

    private TestingAuthenticationToken() {
        super();
    }

    //~ Methods ================================================================

    public void setAuthenticated(boolean isAuthenticated) {
        this.authenticated = isAuthenticated;
    }

    public boolean isAuthenticated() {
        return this.authenticated;
    }

    public GrantedAuthority[] getAuthorities() {
        return this.authorities;
    }

    public Object getCredentials() {
        return this.credentials;
    }

    public Object getPrincipal() {
        return this.principal;
    }
}
