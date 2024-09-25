package com.project.Courses.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class PlaylistCourse {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long playlistCourseId;

    @ManyToOne
    @JoinColumn(name = "playlist_id")
    private Playlist playlist;

    @ManyToOne
    @JoinColumn(name = "course_id")
    private Course course;
}
