package com.github.diegonsilveira.samples;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.validation.constraints.NotNull;

@Entity
public class Jedi {
  @Id
  private Integer id;

  @NotNull
  private String name;

  @NotNull
  private String gender;

  @ManyToMany(fetch = FetchType.EAGER)
  @JoinTable(name = "jedi_movie", inverseJoinColumns = @JoinColumn(name = "movie_id"))
  private List<Movie> movies = new ArrayList<>();

  public String getName() {
    return this.name;
  }
  
  public Integer getId() {
	  return id;
  }
  
  public void setId(Integer id) {
	  this.id = id;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getGender() {
    return this.gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public List<Movie> getMovies() {
    return this.movies;
  }

  public void setMovies(List<Movie> movies) {
    this.movies = movies;
  }

}