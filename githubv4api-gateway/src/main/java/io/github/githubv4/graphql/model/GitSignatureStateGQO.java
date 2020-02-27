package io.github.githubv4.graphql.model;

public enum GitSignatureStateGQO {

    BAD_CERT, 
    BAD_EMAIL, 
    EXPIRED_KEY, 
    GPGVERIFY_ERROR, 
    GPGVERIFY_UNAVAILABLE, 
    INVALID, 
    MALFORMED_SIG, 
    NOT_SIGNING_KEY, 
    NO_USER, 
    OCSP_ERROR, 
    OCSP_PENDING, 
    OCSP_REVOKED, 
    UNKNOWN_KEY, 
    UNKNOWN_SIG_TYPE, 
    UNSIGNED, 
    UNVERIFIED_EMAIL, 
    VALID

}