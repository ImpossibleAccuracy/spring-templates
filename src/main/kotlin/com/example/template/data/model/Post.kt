package com.example.template.data.model

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Table

@Entity
@Table(name = "post")
class Post(
    id: Long?,
    @Column(name = "title")
    val title: String,
    @Column(name = "author_username")
    val authorUsername: String,
    @Column(name = "rating")
    val rating: Int
) : BaseModel<Long>(id)