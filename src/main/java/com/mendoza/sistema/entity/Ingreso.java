package com.mendoza.sistema.entity;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.util.Date;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
@Table(name = "Ingresos")
@EntityListeners(AuditingEntityListener.class)
public class Ingreso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "serie", length = 64, nullable = true)
    private String serie;

    @Column(name = "numero", length = 100, nullable = true)
    private String numero;

    @Column(name = "fecha", nullable = true)
    private Date fecha;

    @Column(name = "total", nullable = true)
    private Float total;

    @Column(name = "usuarioId")
    private int usuarioId;

    @Column(name="created_at")
    @Temporal(TemporalType.TIMESTAMP)
    @CreatedDate
    private Date createdAt;

    @Column(name="updated_at")
    @Temporal(TemporalType.TIMESTAMP)
    @LastModifiedDate
    private Date updateAt;
}
