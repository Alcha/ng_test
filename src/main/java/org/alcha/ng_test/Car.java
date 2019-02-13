package org.alcha.ng_test;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created By: Alcha
 * Created On: 2019/02/02/13/2019 @ 02:40
 */
@Entity
@Data
@NoArgsConstructor
public class Car {
  @Id
  @GeneratedValue
  private Long id;
  private @NonNull String name;
}
