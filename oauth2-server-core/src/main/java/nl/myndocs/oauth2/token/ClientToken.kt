package nl.myndocs.oauth2.token

import java.time.Instant

interface ClientToken : ExpirableToken {
    val tokenValue: String
    val kind: TokenKind
    val clientId: String
    override val expireTime: Instant
    val scopes: Set<String>
}

enum class TokenKind {
    ACCESS,
    REFRESH,
    CODE
}