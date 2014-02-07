/*
 * Copyright 2011 the original author or authors.
 *
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
 */
package com.google.appengine.task.appcfg

/**
 * Defines App Engine plugin application configuration convention.
 *
 * @author Benjamin Muschko
 */
class AppConfigConvention {
    String email
    String server
    String host
    Boolean noCookies
    Boolean passIn
    String password
    String httpProxy
    String httpsProxy
    Boolean oauth2
    // an list of other appcfg params to send to the appcfg command
    List<String> extraOptions = []
    DownloadLogsConvention logs = new DownloadLogsConvention()
    DownloadAppConvention app = new DownloadAppConvention()
    UpdateConvention update = new UpdateConvention()
}
