/**
 *  Copyright 2012 Wordnik, Inc.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package com.wordnik.swagger.play;

import com.wordnik.swagger.core.AuthorizationFilter;

import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.UriInfo;

public interface ApiAuthorizationFilter extends  AuthorizationFilter {
    public boolean authorize(String apiPath, String method, HttpHeaders headers, UriInfo uriInfo);
    public boolean authorizeResource(String apiPath, HttpHeaders headers, UriInfo uriInfo);
}
