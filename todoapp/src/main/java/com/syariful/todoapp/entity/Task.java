package com.syariful.todoapp.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.util.Date;

@Setter
@Getter
@ToString
@Entity
@Table(name = "tasks")
@NoArgsConstructor
public class Task {
    @Id // agar jadi primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) // auto incremental, fungsinya agar bisa bikin nomor urut otomatis
    private Long id; // nama kolom

    @Column(nullable = false) // kolom "text" ini tidak boleh kosong
    private String text; // nama kolom

    // fungsinya agar ketika data diisi
    // kita mencatat tanggal data ni dibuat
    @CreationTimestamp // fungsinya agar dia bisa isi tanggal data dibuat secara otomatis
    @Column(name = "created_at", nullable = false, updatable = false) // tidak boleh kosong & tidak boleh diupdate
    private Date createdAt;

    // fungsinya agar ketika data diubah
    // kita mencatat tanggal data ini diubah
    @UpdateTimestamp // fungsinya agar dia bisa isi tanggal data diubah secara otomatis
    @Column(name = "update_at")
    private Date updateAt;
}
