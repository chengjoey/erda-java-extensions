/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package cloud.erda.agent.plugin.httpasyncclient.v4;

import cloud.erda.agent.core.tracing.TracerSnapshot;
import org.apache.http.protocol.HttpContext;

/**
 * @author randomnil
 */
public class ThreadTransferInfo {

    public static ThreadLocal<ThreadTransferInfo> LOCAL = new ThreadLocal<ThreadTransferInfo>();

    private TracerSnapshot snapshot;
    private HttpContext httpContext;

    public ThreadTransferInfo(TracerSnapshot snapshot, HttpContext httpContext) {
        this.snapshot = snapshot;
        this.httpContext = httpContext;
    }

    public TracerSnapshot getSnapshot() {
        return snapshot;
    }

    public HttpContext getHttpContext() {
        return httpContext;
    }
}
