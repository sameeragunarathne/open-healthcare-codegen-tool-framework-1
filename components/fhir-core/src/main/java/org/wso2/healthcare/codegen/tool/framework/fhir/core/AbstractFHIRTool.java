/*
 * Copyright (c) 2023, WSO2 LLC. (http://www.wso2.org).
 *
 * WSO2 LLC. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.wso2.healthcare.codegen.tool.framework.fhir.core;

import org.wso2.healthcare.codegen.tool.framework.commons.core.AbstractTool;
import org.wso2.healthcare.codegen.tool.framework.commons.core.ToolContext;
import org.wso2.healthcare.codegen.tool.framework.commons.exception.CodeGenException;

/**
 * Abstract class for implementing FHIR tools.
 */
public abstract class AbstractFHIRTool extends AbstractTool {

    @Override
    public ToolContext getToolContext() throws CodeGenException {
        throw new CodeGenException("Tool implementations from the base protocol level(FHIR, HL7) implementations " +
                "doesn't get a specific tool context, " +
                "hence the protocol level tool context is shared amongst the tool implementations.");
    }

    @Override
    public void setToolContext(ToolContext toolContext) throws CodeGenException {
        throw new CodeGenException("Tool implementations from the base protocol level(FHIR, HL7) implementations " +
                "doesn't get a specific tool context, " +
                "hence the protocol level tool context is shared amongst the tool implementations.");
    }
}
