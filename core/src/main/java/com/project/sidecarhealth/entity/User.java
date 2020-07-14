package com.project.sidecarhealth.entity;

import java.time.LocalDateTime;
import java.util.Objects;
import javax.persistence.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@EntityListeners(AuditingEntityListener.class)
public class User {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  private String name;
  private String lastName;
  private String email;
  private String apiKey;

  @CreatedDate
  @Column(name = "created_at")
  private LocalDateTime createdAt;

  @LastModifiedDate
  @Column(name = "updated_at")
  private LocalDateTime updatedAt;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getApiKey() {
    return apiKey;
  }

  public void setApiKey(String apiKey) {
    this.apiKey = apiKey;
  }

  public LocalDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(LocalDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public LocalDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(LocalDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    User user = (User) o;
    return Objects.equals(getId(), user.getId())
        && Objects.equals(getName(), user.getName())
        && Objects.equals(getLastName(), user.getLastName())
        && Objects.equals(getEmail(), user.getEmail())
        && Objects.equals(getApiKey(), user.getApiKey())
        && Objects.equals(getCreatedAt(), user.getCreatedAt())
        && Objects.equals(getUpdatedAt(), user.getUpdatedAt());
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        getId(), getName(), getLastName(), getEmail(), getApiKey(), getCreatedAt(), getUpdatedAt());
  }
}
