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

import org.springframework.core.NestedRuntimeException;


/**
 * Abstract superclass for all exceptions thrown in the context package and
 * subpackages.
 * 
 * <p>
 * Note that this is a runtime (unchecked) exception.
 * </p>
 *
 * @author Ben Alex
 * @version $Id$
 */
public abstract class ContextException extends NestedRuntimeException {
    //~ Constructors ===========================================================

    /**
     * Constructs a <code>ContextException</code> with the specified message
     * and root cause.
     *
     * @param msg the detail message
     * @param t the root cause
     */
    public ContextException(String msg, Throwable t) {
        super(msg, t);
    }

    /**
     * Constructs a <code>ContextException</code> with the specified message
     * and no root cause.
     *
     * @param msg the detail message
     */
    public ContextException(String msg) {
        super(msg);
    }
}
