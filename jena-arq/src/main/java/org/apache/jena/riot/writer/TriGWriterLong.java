/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.jena.riot.writer ;

import org.apache.jena.atlas.io.IndentedWriter ;
import org.apache.jena.riot.RIOT;
import org.apache.jena.riot.system.PrefixMap ;
import org.apache.jena.sparql.core.DatasetGraph ;
import org.apache.jena.sparql.util.Context ;

public class TriGWriterLong extends TriGWriter {

    @Override
    protected void output(IndentedWriter iOut, DatasetGraph dsg, PrefixMap prefixMap, String baseURI, Context context) {
        context.set(RIOT.symTurtleIndentStyle, "long");
        super.output(iOut, dsg, prefixMap, baseURI, context);
    }
}
