package org.booking.spring_security.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.io.Serializable;

public class JwtResponse implements Serializable {

    private static final long serialVersionUID = -8091879091924046844L;
    private final String token;

  public JwtResponse(String token) {
        this.token = token;
    }

    public String getToken() {
        return this.token;
    }

}
