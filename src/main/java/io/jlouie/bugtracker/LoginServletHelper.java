/*
 * Copyright 2018 Johnathan Louie.
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
package io.jlouie.bugtracker;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Johnathan Louie
 */
public class LoginServletHelper {

    private final HttpServletRequest request;
    private final HttpServletResponse response;
    private final String forwardPage;

    public LoginServletHelper(HttpServletRequest request, HttpServletResponse response, String forwardPage) {
        this.request = request;
        this.response = response;
        this.forwardPage = forwardPage;
    }

    public HttpServletRequest getRequest() {
        return request;
    }

    public HttpServletResponse getResponse() {
        return response;
    }

    public String getForwardPage() {
        return forwardPage;
    }

}
