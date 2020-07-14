package com.project.sidecarhealth.dto;

import java.time.LocalDateTime;
import java.util.Objects;

public class UserResponseDTO {

  private Long id;
  private String name;
  private String lastName;
  private String email;
  private String apiKey;
  private LocalDateTime createdAt;
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
    UserResponseDTO that = (UserResponseDTO) o;
    return Objects.equals(getId(), that.getId())
        && Objects.equals(getName(), that.getName())
        && Objects.equals(getLastName(), that.getLastName())
        && Objects.equals(getEmail(), that.getEmail())
        && Objects.equals(getApiKey(), that.getApiKey())
        && Objects.equals(getCreatedAt(), that.getCreatedAt())
        && Objects.equals(getUpdatedAt(), that.getUpdatedAt());
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        getId(), getName(), getLastName(), getEmail(), getApiKey(), getCreatedAt(), getUpdatedAt());
  }
}
