/*
* Copyright 2015 Stormpath, Inc.
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
* http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/
package com.stormpath.sdk.oauth;


/**
 * Holder for Oauth Grant Authentication-specific data that will be received on the Grant Authentication request execution.
 * @see com.stormpath.sdk.application.Application#authenticate(PasswordGrantRequest)
 * @see com.stormpath.sdk.application.Application#authenticate(RefreshGrantRequest)
 *
 * @since 1.0.RC5.1
 */
public interface OauthGrantAuthenticationResult {

    /**
     * Returns the String that corresponds to the Oauth Access Token created during the Create Grant Authentication operation.
     * @return the String representation of the Oauth Access Token
     */
    String getAccessTokenString();

    /**
     * Returns the {@code AccessToken AccessToken} generated during the Create Grant Authentication operation.
     * @return the {@code AccessToken AccessToken} object
     */
    AccessToken getAccessToken();

    /**
     * Returns the String that corresponds to the token created during the Refresh Grant Authentication operation.
     * @return the String representation of the Oauth refresh token
     */
    String getRefreshTokenString();

    /**
     * Returns the {@code RefreshToken RefreshToken} generated during the Refresh Grant Authentication operation.
     * @return the {@code RefreshToken RefreshToken} object
     */
    RefreshToken getRefreshToken();

    /**
     * Returns the href of the token created during the Create Grant Authentication operation.
     * @return the href Oauth Access Token
     */
    String getAccessTokenHref();

    /**
     * Returns the type of the token created during the create grant authentication or refresh grant authentication operations.
     * @return the String corresponding to the type of the token created during the grant authentication operation
     */
    String getTokenType();

    /**
     *
     * @return
     */
    int getExpiresIn();

}