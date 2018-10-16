package nl.myndocs.oauth2.token

import java.time.Instant

data class AccessToken(
        override val tokenValue: String,
        val tokenType: String,
        override val expireTime: Instant,
        val username: String?,
        override val clientId: String,
        override val scopes: Set<String>,
        val refreshToken: RefreshToken?
) : ClientToken {

        override val kind = TokenKind.ACCESS
}