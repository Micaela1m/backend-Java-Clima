package com.ideas.springboot.web.app.service;
import com.ideas.springboot.web.app.service.dto.TeamResponse;

public interface TeamService {
  TeamResponse buscarClima(String region);
}