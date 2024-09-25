package uk.gov.android.network.auth

sealed class AuthenticationResponse {
    data class Success(val bearerToken: String) : AuthenticationResponse()
    data object AccessTokenExpired : AuthenticationResponse()
    data class Failure(val error: Exception) : AuthenticationResponse()
}
