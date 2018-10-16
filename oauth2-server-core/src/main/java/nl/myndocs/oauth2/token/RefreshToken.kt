package nl.myndocs.oauth2.token

import java.time.Instant

data class RefreshToken(
        override val tokenValue: String,
        override val expireTime: Instant,
        val username: String?,
        override val clientId: String,
        override val scopes: Set<String>
) : ClientToken {

        override val kind = TokenKind.REFRESH
}