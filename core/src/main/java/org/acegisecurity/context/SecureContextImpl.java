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

package net.sf.acegisecurity.context;

import net.sf.acegisecurity.Authentication;


/**
 * Basic concrete implementation of a {@link SecureContext}.
 *
 * @author Ben Alex
 * @version $Id$
 */
public class SecureContextImpl extends ContextImpl implements SecureContext {
    //~ Instance fields ========================================================

    private Authentication authentication;

    //~ Methods ================================================================

    public void setAuthentication(Authentication newAuthentication) {
        this.authentication = newAuthentication;
    }

    public Authentication getAuthentication() {
        return this.authentication;
    }

    public void validate() throws ContextInvalidException {
        super.validate();

        if (authentication == null) {
            throw new ContextInvalidException("Authentication not set");
        }
    }
}
