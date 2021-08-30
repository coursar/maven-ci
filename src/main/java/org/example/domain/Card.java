package org.example.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// Data object
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Card {
  private String id; // <- data
  private String name;
  private String description;
}
