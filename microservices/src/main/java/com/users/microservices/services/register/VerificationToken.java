package com.users.microservices.services.register;

import java.util.Calendar;

import org.springframework.data.jpa.repository.JpaRepository;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@Entity
@NoArgsConstructor
public class VerificationToken {
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private Long id;
 private String token;
 private Date expirationTime;
 private static final int EXPIRATION_TIME = 15;
 @OneToOne
 @JoinColumn(name = "user_id")
 private User user;
 public VerificationToken(String token, User user) {
 super();
 this.token = token;
 this.user = user;
 this.expirationTime = this.getTokenExpirationTime();
 }
 public VerificationToken(String token) {
 super();
 this.token = token;
 this.expirationTime = this.getTokenExpirationTime();
 }
 public Date getTokenExpirationTime() {
 Calendar calendar = Calendar.getInstance();
 calendar.setTimeInMillis(new Date().getTime());
 calendar.add(Calendar.MINUTE, EXPIRATION_TIME);
 return new Date(calendar.getTime().getTime());
 }
}
public interface VerificationTokenRepository extends
JpaRepository<VerificationToken, Long> {
 VerificationToken findByToken(String token);
}

