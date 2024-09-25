package com.project.Courses.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Data
public class Playlist {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long playlistId;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    private String title;

    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;

}
