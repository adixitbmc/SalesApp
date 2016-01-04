package com.amol.exercise.sales.security;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.filter.OncePerRequestFilter;

public class CustomFilter extends OncePerRequestFilter {

	@Override
	protected void doFilterInternal(HttpServletRequest req,
			HttpServletResponse res, FilterChain chain)
			throws ServletException, IOException {
		
		String auth_id = req.getHeader("AUTHENTICATION_ID");
		if (auth_id != null && !(Integer.parseInt(auth_id) == 99))
			res.sendError(HttpServletResponse.SC_NOT_ACCEPTABLE,"Invalid Authetication Id" );
		chain.doFilter(req, res);
	}

}
