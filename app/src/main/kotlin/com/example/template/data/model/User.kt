package com.example.template.data.model

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Table
import org.springframework.security.core.GrantedAuthority
import org.springframework.security.core.userdetails.UserDetails

@Entity
@Table(name = "user")
class User(
    id: Long?,

    @Column(name = "email")
    val email: String,

    @Column(name = "username")
    val accountUsername: String,

    @Column(name = "password")
    val passwordHash: String
) : BaseModel<Long>(id), UserDetails {
    override fun getAuthorities(): Collection<GrantedAuthority> =
        setOf()

    override fun getPassword(): String =
        passwordHash

    override fun getUsername(): String =
        email

    override fun isAccountNonExpired(): Boolean =
        true

    override fun isAccountNonLocked(): Boolean =
        true

    override fun isCredentialsNonExpired(): Boolean =
        true

    override fun isEnabled(): Boolean =
        true
}